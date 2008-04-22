/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007, 2008, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.extjs.gxt.samples.explorer.client.pages;

import java.util.List;

import com.extjs.gxt.samples.resources.client.Stock;
import com.extjs.gxt.samples.resources.client.TestData;
import com.extjs.gxt.ui.client.Events;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Button;
import com.extjs.gxt.ui.client.widget.ButtonBar;
import com.extjs.gxt.ui.client.widget.Container;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.DataList;
import com.extjs.gxt.ui.client.widget.DataListItem;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.menu.TextMenuItem;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;

public class DataListPage extends Container implements EntryPoint {

  private int count;

  public void onModuleLoad() {
    RootPanel.get().add(this);
  }

  @Override
  protected void onRender(Element parent, int pos) {
    super.onRender(parent, pos);
    HorizontalPanel hp = new HorizontalPanel();
    hp.setSpacing(8);

    Listener l = new Listener<ComponentEvent>() {
      public void handleEvent(ComponentEvent ce) {
        DataList l = (DataList) ce.component;
        int count = l.getSelection().size();
        Info.display("Selection Changed", "There are {0} items selected", "" + count);
      }
    };

    final DataList list = new DataList();
    list.selectionMode = SelectionMode.MULTI;
    list.setBorders(false);
    list.addListener(Events.SelectionChange, l);
    list.setWidth(190);

    Menu contextMenu = new Menu();

    TextMenuItem insert = new TextMenuItem();
    insert.setText("Insert Item");
    insert.setIconStyle("icon-add");
    insert.addSelectionListener(new SelectionListener() {
      public void componentSelected(ComponentEvent ce) {
        DataListItem item = list.getSelectedItem();
        if (item != null) {
          int index = list.indexOf(item);
          DataListItem newItem = new DataListItem();
          newItem.setText("New Item " + count++);
          newItem.setIconStyle(item.getIconStyle());
          list.insert(newItem, ++index);
        }
      }
    });
    contextMenu.add(insert);

    TextMenuItem remove = new TextMenuItem();
    remove.setText("Remove Selected");
    remove.setIconStyle("icon-delete");
    remove.addSelectionListener(new SelectionListener() {
      public void componentSelected(ComponentEvent ce) {
        List<DataListItem> selected = list.getSelection();
        while (selected.size() > 0) {
          list.remove(selected.get(0));
        }
      }
    });
    contextMenu.add(remove);

    list.setContextMenu(contextMenu);

    List<Stock> stocks = TestData.getStocks();
    for (int i = 0; i < 6; i++) {
      Stock stock = stocks.get(i);
      DataListItem item = new DataListItem();

      item.setText(stock.getName());
      item.setIconStyle("icon-chart");
      list.add(item);
    }
    hp.add(list);

    
    ContentPanel frame = new ContentPanel();
    frame.frame = true;
    frame.collapsible = true;
    frame.animCollapse = true;
    frame.setHeading("Framed List");
    frame.setSize(210, 200);
    
    final DataList list2 = new DataList();
    list2.flat = true;
    
    list2.addListener(Events.SelectionChange, l);
    stocks = TestData.getStocks();
    for (Stock stock : stocks) {
      DataListItem item = new DataListItem();
      item.setText(stock.getName());
      list2.add(item);
    }

    frame.setLayout(new FitLayout());
    frame.add(list2);
    
    hp.add(frame);

    VerticalPanel vp = new VerticalPanel();
    vp.setSpacing(8);
    ButtonBar buttonBar = new ButtonBar();
    buttonBar.add(new Button("Select All", new SelectionListener() {
      public void componentSelected(ComponentEvent ce) {
        list.selectAll();
      }
    }));
    buttonBar.add(new Button("Select Last", new SelectionListener() {
      public void componentSelected(ComponentEvent ce) {
        list2.select(list2.getItemCount() - 1);
      }
    }));

    vp.add(buttonBar);
    vp.add(hp);
    add(vp);
  }

}
