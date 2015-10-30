package com.google.gwt.sample.MovieApp.client;


import java.io.IOException;
import au.com.bytecode.opencsv.*;
import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.view.client.ListDataProvider;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MovieApp implements EntryPoint {
     // Server server = new Server();
	public void onModuleLoad() {
		
		Button btn = new Button("Test");
		final String goofy = "da";
		Label lb = new Label("Label");
		// test
		DataGrid<String> dgTable = new DataGrid<String>();
		ListDataProvider<String> dataprovider = new ListDataProvider<String>();
		dataprovider.addDataDisplay(dgTable);
		List<String> list = dataprovider.getList();
		
	    
		RootPanel.get().add(btn);	
		RootPanel.get().add(lb);
		RootPanel.get().add(dgTable);
		
	}
}


	
