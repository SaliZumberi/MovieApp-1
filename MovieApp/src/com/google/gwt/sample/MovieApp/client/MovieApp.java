package com.google.gwt.sample.MovieApp.client;


import com.google.gwt.core.client.EntryPoint;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MovieApp implements EntryPoint {

	public void onModuleLoad() {
		Button btn = new Button("Test");
		Label lb = new Label("Label");
		// test
		RootPanel.get().add(btn);
		RootPanel.get().add(lb);
		
	}
}
