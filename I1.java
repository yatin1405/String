package com.stringDemo;

public class I1 {
	public static void main(String[] args) {
		String str1 = "Java Exercises";
		String str2 = "Java Exercise";
		
		String str = "se";
		
		boolean ends1 = str1.endsWith(str);
		boolean ends2 = str2.endsWith(str);
		
		System.out.println(str1+" ends with "+str+" :"+ends1);
		System.out.println(str2+" ends with "+str+" :"+ends2);
		
	}

}
