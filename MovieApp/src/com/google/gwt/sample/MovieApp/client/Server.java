package com.google.gwt.sample.MovieApp.client;
import java.util.*;
import java.io.File;
		import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.Oneway;
import com.univocity.*;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class Server {
	List<String[]> allRows;
	
    public Reader getReader(String relativePath) throws UnsupportedEncodingException {
        
        return new InputStreamReader(this.getClass().getResourceAsStream(relativePath), "UTF-8");
       
    }

		
/**
 * @throws UnsupportedEncodingException
 */
private void loadCSV() throws UnsupportedEncodingException {
	CsvParserSettings settings = new CsvParserSettings();
	    //the file used in the example uses '\n' as the line separator sequence.
	    //the line separator sequence is defined here to ensure systems such as MacOS and Windows
	    //are able to process this file correctly (MacOS uses '\r'; and Windows uses '\r\n').
	    settings.getFormat().setLineSeparator("\n");
	    settings.setMaxColumns(800000);
	    settings.selectIndexes(2,4,5,7,8,9);
	    settings.setNullValue("no information");
	  
	    // creates a CSV parser
	    CsvParser parser = new CsvParser(settings);

	    // parses all rows in one go.
	    String pattern = "(!a)";
	    Pattern r = Pattern.compile(pattern);
	    allRows = parser.parseAll(getReader("/war/csv/Testf.csv"));
	    System.out.println("Array complete");
	    System.out.println(allRows.get(3)[2]);
	    
	       
	   for(String[] strings : allRows){
		   
		 for(int i = 0; i<strings.length;i++){
		  // strings = Arrays.toString(strings);
		  strings[i] = strings[i].replaceAll(pattern, "");
		  //System.out.println(strings[2]);
		 }
	    	   
		// System.out.println(Arrays.toString(strings)+ "*");
	    }
	    System.out.println("done");
	    
}
public List<String[]> getList(){
	return allRows;
	
}
}
