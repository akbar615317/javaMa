package com.strings;

public class FirstExp {
		
	public static void main(String[] args) {
		
	
		String str= "Hello".intern();
		
		String str1= new String("Hello").intern();
		char ch[]= {'j','a','v','a',' ','t','r','a','i','n','i','n','g'};
		
		
		byte b[]= str.getBytes();
		
		System.out.println(b);
		
		
		
		String s4="This is java trainging";
		
		String s5="it was me";
		
		String str2=new String(ch);
		
		for(byte c : b )
		{
		
		System.out.println(c);
		}
		
		
		//char ch1= str3.charAt(2);
		
		int n=s4.indexOf(s5);
		
		int n1=s4.length();
		
		System.out.println(n1);
		
		
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		//String s5="it was me";
		
		//char ch[]= {'j','a','v','a',' ','t','r','a','i','n','i','n','g'};
		
		s5.getChars(0, 9,ch,4);
		System.out.println(ch);
		
		
		
		String str10= "Hello, this is a book on java ";
		
		String s[];
		s = str10.split(" ");
		for(int i=0; i<s.length; i++)
		System.out.println(s[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(ch1);
		
		
		//System.out.println(str);
		
		//System.out.println(str2);
		//System.out.println(str3);
		
		if(str==str1)
		{
			
			System.out.println("both are equal");
		}else
		{
			
			System.out.println("both are not equal");
			
		}
		
	
		
		
		
		
	}	
		
}
