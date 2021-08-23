package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Verify if String matches a format String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7190810">https://stackoverflow.com/a/7190810</a>
 */
public class APIzator7190810 {

  // copied from java.util.Formatter
  // %[argument_index$][flags][width][.precision][t]conversion
  private static final String formatSpecifier =
    "%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])";

  private static final Pattern formatToken = Pattern.compile(formatSpecifier);

  public static Pattern convert(final String format) {
    final StringBuilder regex = new StringBuilder();
    final Matcher matcher = formatToken.matcher(format);
    int lastIndex = 0;
    regex.append('^');
    while (matcher.find()) {
      regex.append(Pattern.quote(format.substring(lastIndex, matcher.start())));
      regex.append(
        convertToken(
          matcher.group(1),
          matcher.group(2),
          matcher.group(3),
          matcher.group(4),
          matcher.group(5),
          matcher.group(6)
        )
      );
      lastIndex = matcher.end();
    }
    regex.append(Pattern.quote(format.substring(lastIndex, format.length())));
    regex.append('$');
    return Pattern.compile(regex.toString());
  }

  private static String convertToken(
    String index,
    String flags,
    String width,
    String precision,
    String temporal,
    String conversion
  ) {
    if (conversion.equals("s")) {
      return "[\\w\\d]*";
    } else if (conversion.equals("d")) {
      return "[\\d]{" + width + "}";
    }
    throw new IllegalArgumentException(
      "%" + index + flags + width + precision + temporal + conversion
    );
  }
}
