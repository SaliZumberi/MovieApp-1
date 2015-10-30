package com.google.gwt.sample.MovieApp.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class readMovies80000 {
String[][] allData;
	public static void main(String[] args) {
		
		readMovies80000 obj = new readMovies80000 ();
		obj.readMovies();
	}
	
	public void readMovies () {
		
		String csvFile = "war/csv/movies_80000.tsv";
		BufferedReader br = null;
		BufferedReader br2 = null;
		String line = "";
		String cvsSplitBy = "\\t";
		// creating Regular Expression to format the data
		String regEx = "\"/m/[a-z_0-9]*\": \"|[{]|[}]|\"";
		Pattern pattern = Pattern.compile(regEx);
		
		
		
		int k = 0; 
		int j = 0; 
		int nrOfLines = 0; 
		int nrOfCol = 0; 
		
		// get number of rows and col
		try {

			// prende in input il csv File
			br2 = new BufferedReader(new FileReader(csvFile));
			
			// finchè non arriva alla fine del file, continua a scendere
			while ((line = br2.readLine()) != null) {
				
				String []A = line.split(cvsSplitBy);
				nrOfCol = A.length;
				nrOfLines++; 
				//System.out.print("Line: "+nrOfLines);
				/*for (int i = 0; i < 9; i++) {
					System.out.print(i+" ");
				}
					*/
				//System.out.println();
			}
			
			
			System.out.println("Number of rows: "+ nrOfLines);
			System.out.println("Number of col: "+ nrOfCol);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
		
	
		String [][] B = new String [nrOfLines][nrOfCol]; // righe, colonne (row, col)
		
		
		try {

			// prende in input il csv File
			br = new BufferedReader(new FileReader(csvFile));
			
			// finchè non arriva alla fine del file, continua a scendere
			while ((line = br.readLine()) != null) {

			        // use comma as separator
				String []A = line.split(cvsSplitBy);
				for (int i = 0; i < nrOfCol; i++) {
				
					B [k][i] = A[i]; // row k (constant in the for loop) & column i splits
				
							Matcher m = pattern.matcher(B[k][i]);
					  B[k][i] = m.replaceAll("");
					  //seeing id Regex works
			
				}
				
				k++;
				 
				/*
				B[k][j] = A[0]; // Wikipedia ID
				B[k][j+1] = A[1]; // Freebase movie ID
				B[k][j+2] = A[2]; // Movie name
				B[k][j+3] = A[3]; // Movie release date
				B[k][j+4] = A[4]; // Movie box office revenue
				B[k][j+5] = A[5]; // Movie runtime
				B[k][j+6] = A[6]; // Movie languages (Freebase ID:name tuples)
				B[k][j+7] = A[7]; // Movie countries (Freebase ID:name tuples)
				B[k][j+8] = A[8]; // Movie genres (Freebase ID:name tuples)
				k++;*/
				
			}
			allData = B;
			// Array 2D: prima coordinata: righe
			// seconda coordinata: colonne
			System.out.println("FOR SORT");
			for (int i = 0; i < 1; i++) {
				for (int s = 0; s < nrOfCol; s++) {
					System.out.print(B[i][s]+"  \t ");
				}
				System.out.println();
			}
			
			
			
			System.out.println("AFTER SORT");
			for (int i = 0; i < 1; i++) {
				for (int s = 0; s < nrOfCol; s++) {
					System.out.print(B[i][s]+"  \t ");
				}
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	public String[][] getAllData(){
		return allData;
		
	}
	
	
}
