package org.bht.politz;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws IOException 
     */
    public void testApp() throws IOException
    {
    	long d = System.currentTimeMillis();
        // Test that reading and processing takes less 10 secs
    	App.main(new String[0]);
        assertTrue(System.currentTimeMillis() - d < 10000);
    }
    
    public void testLongIndex() {
    	// Test that the class flawlessly accepts index names with 255 chars
        String longIndex100 = "longindexnameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeelongindexnameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        Share s = new Share("DE1000", "ADAC", 64.27, 1.24);
        s.setIndex(longIndex100);
        assertTrue(s.getIndex().equals(longIndex100));	
    }
    
    public void testLongName() {
    	// Test that the class flawlessly accepts index names with 255 chars
    	String longName255 = "longindexnameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeelongindexnameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeelongindexnameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeelongindexnameeeeeeeeeeeeeee";
        Share s = new Share("DE1000", "ADAC", 64.27, 1.24);
        s.setName(longName255);
        assertTrue(s.getName().equals(longName255));	
    }
    
    public void testGettersSetters() {
    	Share s = new Share("DE1000", "ADAC", 64.27, 1.24);
    	s.setTendency(1.25);
    	assertTrue(s.getTendency() == 1.25);
    	s.setValue(65.00);
    	assertTrue(s.getValue() == 65.00);
    }
}
