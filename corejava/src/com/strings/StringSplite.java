
package com.strings;

public class StringSplite {
	
	
	public static void main(String[] args) 
	{
	
	int x=1237;
	
	int reverse =0;
	
	while(x!=0)
	{
		int reminder=x%10;
		reverse=reverse*10+reminder;
		x=x/10;
		
		
	}
	
	System.out.println(reverse);
	}

}