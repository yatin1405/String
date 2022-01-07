package com.stringDemo;

import java.util.HashSet;
import java.util.Set;

public class I3 {
	private static void allInterLeavings(String res, String str1, String str2, Set<String> out) {
		
			
		if(str1.length()==0 && str2.length()==0) {
			out.add(res);
			return;
		}
		if(str1.length()>0) {
			allInterLeavings(res+str1.charAt(0), str1.substring(1), str2, out);
		}
		if(str2.length()>0) {
			allInterLeavings(res+str2.charAt(0),str1, str2.substring(1), out);
		}
	}



	public static void main(String[] args) {
		String str1 = "wx";
		String str2 = "yz";
		System.out.println("The given string are: "+str1+" "+str2);
		System.out.println("The interleavings strings are: ");
		Set<String > out = new HashSet<>();
		allInterLeavings("", str1, str2, out);
		out.stream().forEach(System.out::println);
	}
}
