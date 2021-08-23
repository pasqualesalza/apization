package com.stackoverflow.api;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * How to right align buttons on a HorizontalPanel (GWT)
 *
 * classpath: gwt-user-2.8.2
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2004888">https://stackoverflow.com/a/2004888</a>
 */
public class APIzator2004888 {

  public static void rightButton() throws Exception {
    final HorizontalPanel hp = new HorizontalPanel();
    final Button saveButton = new Button("save");
    final Button cancelButton = new Button("cancel");
    // just to see the bounds of the HorizontalPanel
    hp.setWidth("600px");
    hp.setBorderWidth(2);
    // It only applies to widgets added after this property is set.
    hp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
    hp.add(saveButton);
    hp.add(cancelButton);
    RootPanel.get().add(hp);
  }
}
