/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007, 2008, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.extjs.gxt.ui.client.widget.toolbar;

import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.util.WidgetHelper;
import com.extjs.gxt.ui.client.widget.Button;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.google.gwt.user.client.Element;

/**
 * A tool item with an optional text and icon style.
 * 
 * <dl>
 * <dt><b>Events:</b></dt>
 * 
 * <dd><b>Select</b> : (component, event)<br>
 * <div>Fires after the item is clicked.</div>
 * <ul>
 * <li>component : this</li>
 * <li>event : the dom event</li>
 * </ul>
 * </dd>
 * </dl>
 */
public class TextToolItem extends ToolItem {

  /**
   * The wrapped button instance.
   */
  protected Button button;

  /**
   * Creates a new tool item text.
   */
  public TextToolItem() {
    button = new Button();
  }

  /**
   * Creates a new text tool item.
   * 
   * @param text the tool item text
   */
  public TextToolItem(String text) {
    this();
    setText(text);
  }

  /**
   * Creates a new text tool item.
   * 
   * @param text the text
   * @param iconStyle the icon style
   */
  public TextToolItem(String text, String iconStyle) {
    this();
    setText(text);
    setIconStyle(iconStyle);
  }

  @Override
  public void addListener(int eventType, Listener listener) {
    button.addListener(eventType, listener);
  }

  /**
   * Adds a selection listener.
   * 
   * @param listener the selection listener
   */
  public void addSelectionListener(SelectionListener listener) {
    button.addSelectionListener(listener);
  }

  /**
   * Returns the item's icon style.
   * 
   * @return the icon style
   */
  public String getIconStyle() {
    return button.getIconStyle();
  }

  /**
   * Returns the item's menu (if it has one).
   * 
   * @return the menu
   */
  public Menu getMenu() {
    return button.getMenu();
  }

  /**
   * Returns the item's parent tool bar.
   * 
   * @return the toolbar
   */
  public ToolBar getToolBar() {
    return toolBar;
  }

  @Override
  public void removeListener(int eventType, Listener listener) {
    button.removeListener(eventType, listener);
  }

  /**
   * Removes a selection listener.
   * 
   * @param listener the listener to be removed
   */
  public void removeSelectionListener(SelectionListener listener) {
    button.removeSelectionListener(listener);
  }

  /**
   * Sets the item's icon style.
   * 
   * @param iconStyle the icon style
   */
  public void setIconStyle(String iconStyle) {
    button.setIconStyle(iconStyle);
  }

  /**
   * Sets the item's menu.
   * 
   * @param menu the menu
   */
  public void setMenu(Menu menu) {
    button.setMenu(menu);
  }

  /**
   * Sets the item's text.
   * 
   * @param text the text
   */
  public void setText(String text) {
    button.setText(text);
  }

  protected void doAttachChildren() {
    super.doAttachChildren();
    WidgetHelper.doAttach(button);
  }

  protected void doDetachChildren() {
    super.doDetachChildren();
    WidgetHelper.doDetach(button);
  }

  protected void onDisable() {
    button.disable();
  }

  protected void onEnable() {
    button.enable();
  }

  protected void onRender(Element target, int index) {
    button.render(target, index);
    setElement(button.getElement());
  }

}
