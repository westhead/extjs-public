/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007, 2008, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.extjs.gxt.ui.client.widget.form;

import com.extjs.gxt.ui.client.Events;
import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

/**
 * Single checkbox field.
 * 
 * <dl>
 * <dt>Events:</dt>
 * 
 * <dd><b>Change</b> : FieldEvent(field, checked)<br>
 * <div>Fires when this field receives input focus.</div>
 * <ul>
 * <li>field : this</li>
 * <li>checked : checked state</li>
 * </ul>
 * </dd>
 * </dl>
 */
public class CheckBox extends Field {

  /**
   * The text that appears beside the checkbox (defaults to null).
   */
  public String boxLabel;

  protected boolean checked;
  protected El wrap, input;

  @Override
  public void clearInvalid() {

  }

  /**
   * Returns <code>true</code> if checked.
   * 
   * @return the checked state
   */
  public boolean isChecked() {
    return checked;
  }

  /**
   * Sets the chekced state.
   * 
   * @param checked <code>true</code> to check, <code>false</code> otherwise
   */
  public void setChecked(boolean checked) {
    setValue(String.valueOf(checked));
  }

  public void setValue(String value) {
    if (value != null
        && (value.toLowerCase().equals("true") || value.toLowerCase().equals("on"))) {
      checked = true;
    } else {
      checked = false;
    }
    if (rendered) {
      input.setElementAttribute("checked", checked);
    }
    FieldEvent fe = new FieldEvent(this);
    fe.checked = checked;
    fireEvent(Events.Change, fe);
  }

  @Override
  protected El getInputEl() {
    return input;
  }

  @Override
  protected void markInvalid(String msg) {

  }

  @Override
  protected void onClick(ComponentEvent ce) {
    boolean value = input.getBooleanElementAttribute("checked");
    if (value != checked) {
      setChecked(value);
    }
  }

  @Override
  protected El getStyleEl() {
    return input;
  }

  @Override
  protected void onRender(Element target, int index) {
    if (this instanceof Radio) {
      input = new El(DOM.createInputRadio(""));
    } else {
      input = new El(DOM.createInputCheck());
    }

    input.setStyleAttribute("marginTop", "3px");

    wrap = new El(DOM.createDiv());
    wrap.setElementAttribute("hideFocus", "hideFocus");
    wrap.setStyleName("x-form-check-wrap");
    wrap.appendChild(input.dom);
    setElement(wrap.dom, target, index);

    if (boxLabel != null) {
      Element div = DOM.createDiv();
      fly(div).setStyleName("x-form-cb-label");
      fly(div).setInnerHtml(boxLabel);
      wrap.appendChild(div);
    }

    super.onRender(target, index);

    focusStyle = null;
  }

  @Override
  protected void onResize(int width, int height) {
    super.onResize(width, height);
  }

}
