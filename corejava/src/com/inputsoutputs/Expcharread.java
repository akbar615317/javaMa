package com.inputsoutputs;

import java.io.*;


public class Expcharread {
	
	public static void main(String arg[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		  System.out.println("enter value");
		  
		  char ch=(char)br.readLine().charAt(0);
		 // br.skip(2);
		  
		 
		  System.out.println("output is "+ ch);
		
		 
	     
	     System.out.print("enter string");
	     
	     String str= br.readLine();
	     
	     System.out.println("output is string  "+ str);
	     
	     System.out.println("enter in value");
	     
	     int n=Integer.parseInt(br.readLine());
	     
	     System.out.println("integer output is "+ n);
	     
	     float f=Float.parseFloat(br.readLine());
	     
	     
	     
	     
	     
	     
	     
	     
	     

		
		
		
		
	}
	
	

}
