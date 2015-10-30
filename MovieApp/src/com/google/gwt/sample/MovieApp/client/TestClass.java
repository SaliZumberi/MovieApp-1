package com.google.gwt.sample.MovieApp.client;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.appengine.tools.util.Logging;

import au.com.bytecode.opencsv.*;
public class TestClass {
	public void Logging() throws IOException{
CSVReader reader = new CSVReader(new FileReader("war/csv/Testd.csv"));
 List<String[]> myEntries = reader.readAll();
	}
}
