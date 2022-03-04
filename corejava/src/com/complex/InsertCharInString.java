package com.complex;

public class InsertCharInString {
	
	
	

public String addChar(String str, char ch, int position) {
    return str.substring(0, position) + ch + str.substring(position);
}
}
