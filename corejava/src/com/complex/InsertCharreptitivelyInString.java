package com.complex;

public class InsertCharreptitivelyInString {
	
	
	public static void main(String a[]) {
	String s1= "tenesse";
	StringBuffer sb =new StringBuffer(s1);
	char ch[]=s1.toCharArray();
	int count=0;
    
	for(int i=0;i<ch.length;i++ )  
	{

	    if(ch[i] == 'e')
	   	 count++;
	    else 
	    	continue;
	}

	 for(int i=0;i<ch.length;i++ ) {
		 
		 if(ch[i] == 'e') {
			 
			 for(int j=0;j<=count;j++)
			 
		      s1.replace('e', '$');
		 }
		 
		 else
			 continue;
	 }
	 System.out.println(s1);
	}

}
