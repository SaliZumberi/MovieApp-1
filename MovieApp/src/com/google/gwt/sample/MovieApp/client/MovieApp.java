package com.google.gwt.sample.MovieApp.client;


import com.google.gwt.core.client.EntryPoint;

import com.google.gwt.user.client.ui.Button;

import com.google.gwt.user.client.ui.RootPanel;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MovieApp implements EntryPoint {

	public void onModuleLoad() {
		Button btn = new Button("Test");
		// testcomment
		RootPanel.get().add(btn);
		
	}
}