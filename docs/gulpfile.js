const { series, watch } = require('gulp');

const del = require('del');
const { exec } = require('child_process');
const fs = require('fs');

const browserSync = require('browser-sync').create();

const lunr = require('lunr');


function clean(cb) {
    del.sync(['public']);
    cb();
}

function hugoBuild(cb) {
    exec('hugo --gc --minify', function (err, stdout, stderr) {
        console.log(stdout);
        console.log(stderr);
        cb(err);
    });
}

function hugoServer(cb) {
    browserSync.init({
        server: {
            baseDir: "./public"
        }
    });

    watch(['**/*', '!public/**/*', '!gulpfile.js'], series(clean, hugoBuild, lunrIndex, browserSync.reload));
    // watch('public/**/*').on('change', browserSync.reload);
}

function lunrIndex(cb) {
    // Load the documents from Hugo.
    const documents = JSON.parse(fs.readFileSync('public/a/index.json'));

    // Use the dictionary to store the data to print.
    var information = {}

    var index = lunr(function() {
        // Define the reference field.
        this.ref('url');

        // Define the search fields.
        this.field('title');
        this.field('question-text');
        this.field('answer-text');
        // this.field('apization');

        documents.forEach(function(document) {
            // Add the document to the index.
            this.add({
                'url': document.url,
                'title': document.title,
                'question-text': document.question_text,
                'answer-text': document.answer_text,
                // 'apization': document.apization_code,
            });

            // Store the data to print.
            information[document.url] = {
                'title': document.title,
            };
        }, this);
    });

    // Write the index file.
    fs.writeFileSync('public/lunr-index.json', JSON.stringify({index: index, information: information}));

    cb();
}


exports.clean = clean;
exports.build = series(clean, hugoBuild, lunrIndex);
exports.serve = series(clean, hugoBuild, lunrIndex, hugoServer);

exports.default = exports.build;
