package com.learning.mulesoft;

import java.io.IOException;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
  
import java.io.File;

  


public class FileOperations {
	

	// Merging multiple pdf documents here
	  

	  
	    public static void mergePDF(String[] listPDFFileNames, String mergedPDFFileName)
	        throws IOException
	    {
	  
           //create instance of PDFMergeUtility class
	    	PDFMergerUtility pdfmrg = new PDFMergerUtility();
	    	
	    	//set the destination file name
	    	pdfmrg.setDestinationFileName(mergedPDFFileName);
	    	
	    	
	    	//Add all the files to be merged
	    	
	    	for(String file : listPDFFileNames)
	    	{
	    		pdfmrg.addSource(file);
	    		System.out.println("Merged File" + file);
	    	}
	    	
	    	//invoke mergeDocuments method to merge documents
	    	pdfmrg.mergeDocuments();

}}
