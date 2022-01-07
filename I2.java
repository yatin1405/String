package com.stringDemo;

public class I2 {
	public static void main(String[] args) {
		String str1 = "Red is favourite color";
		String str2 = "Orange is also my favourite color";
		String str = "Red";
		boolean start1 = str1.startsWith(str);
		boolean start2 = str2.startsWith(str);
		
		System.out.println(str1+" start with "+str+" : "+start1);
		System.out.println(str2+" start with "+str+" : "+start2);
	}

}
