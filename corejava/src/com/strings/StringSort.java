package com.strings;

import java.io.*;
import java.util.Arrays;


class StringSort {


	public static void main(String[] args) throws Exception
	{
		
		String str = "java";
	
		
		char arr[] = str.toCharArray();

		
	
		char temp;

		for(int i=0;i<= arr.length;i++)
		{
                    for(int j=i+1;j<=arr.length;j++)
			{
				if (arr[i] < arr[j]) {
				
					// Comparing the characters one by one
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
	}
}