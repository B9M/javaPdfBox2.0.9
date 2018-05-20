package test.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	PDFManager pdfManager = new PDFManager();
	    pdfManager.setFilePath(".\\testPdfBox.pdf");
	System.out.println(pdfManager.ToText()); 
	    
	    
    	BufferedWriter writer = null;
    	try
    	{
    	    writer = new BufferedWriter( new FileWriter("output.txt"));
    	    writer.write(pdfManager.ToText());

    	}
    	catch ( IOException e)
    	{
    	}
    	finally
    	{
    	    try
    	    {
    	        if ( writer != null)
    	        writer.close( );
    	    }
    	    catch ( IOException e)
    	    {
    	    }
    	}
    /*	PDFManager pdfManager = new PDFManager();
	    pdfManager.setFilePath("");
	  // System.out.println(pdfManager.getClass().getSuperclass()); 
	   // System.out.println(pdfManager.ToText());  
	    File dest =new File("");

	//	FileInputStream fis = new FileInputStream(pdfManager.ToText());
		InputStreamReader isr = new InputStreamReader(pdfManager.toString());
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));

		FileWriter fstream = new FileWriter(dest, true);
		BufferedWriter out = new BufferedWriter(fstream);

		String aLine = null;
		while ((aLine = in.readLine()) != null) {
			//Process each line and add output to Dest.txt file
			out.write(aLine);
			out.newLine();
		}

		// do not forget to close the buffer reader
		in.close();

		// close buffer writer
		out.close();
		System.out.println("fin");*/
    
    }
}
