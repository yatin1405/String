package com.stringDemo;

public class A4 {
	public static void main(String[] args) {
		String s = "It is a string";
		String rs = "is not";
		StringBuilder sb = new StringBuilder(s);
		sb.replace(3, 5, rs);
		System.out.println(sb);
		
	}

}
