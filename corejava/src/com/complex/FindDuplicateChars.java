package com.complex;

public class FindDuplicateChars {
		
public void findDuplicateChars(String str){
	         position = str.length();
	         char element='$';
	   char arr[]=str.toCharArray();
	   List<Character> list = new ArrayList<>(
	            Arrays.asList(arr));
	   for(int i=0;i<arr.length;i++)
		   if (arr[i]=='e') {
	   for(int j=0;j<=i;J++)
			   list.add(i, element);
		   }
	   
	}
	    public static void main(String a[]){
	    	
	    	
	        DuplicateCharsInString dcs = new DuplicateCharsInString();
	        dcs.findDuplicateChars("tenesse");
	    }

}
