package com.stringDemo;

public class A2 {
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxy";
		int len = s.length();
		int n=5;
		int temp=0, chars = len/5;
		String equalstr[] = new String[n];
		
		if(len%n!=0) {
			System.out.println("Sorry! This string cannot divided into "+n+" equal parts");
		}
		else {
			for(int i=0; i<len; i+=chars) {
				String part=s.substring(i,i+chars);
				equalstr[temp] = part;
				temp++;
			}
			System.out.println(n+" equal parts of given string are ");
			for(int i=0; i<equalstr.length;i++) {
				System.out.println(equalstr[i]);
			}
		}
	}

}
