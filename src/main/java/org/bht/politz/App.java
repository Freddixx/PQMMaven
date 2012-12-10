package org.bht.politz;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author Friedrich Politz
 * @version 1.0
 * 
 * Small App to read and sort values from a CSV data sheet.
 */
public class App 
{
	/**
	 * Main Routine
	 * @param args CMD line args
	 * @throws IOException Cheap throw just in case file reading fails
	 */
    public static void main( String[] args ) throws IOException
    {
    	// Initialization
    	CSVReader reader = new CSVReader(new FileReader("Dax30-Table.csv"), ';');
        String [] nextLine;
        List<Share> shares = new LinkedList<Share>();
        // Read and convert values
        while ((nextLine = reader.readNext()) != null) {
            String index = nextLine[0];
            String name = nextLine[1];
            double value = Double.valueOf(nextLine[2].replace(',', '.'));
            double tendency = Double.valueOf(nextLine[3].replace(',', '.').replace('%', '0'));
            Share s = new Share(index, name, value, tendency);
            shares.add(s);
        }
        // Sort the list
        Collections.sort(shares);
        // Winners
        System.out.println("Winners:");
        for (int i = 0; i < 5; i++) {
        	System.out.println(shares.get(i));
        }
        // Losers
        System.out.println("Losers:");
        for (int i = shares.size() - 1; i > shares.size() - 6; i--) {
        	System.out.println(shares.get(i));
        }
    }
}
