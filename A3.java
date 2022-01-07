package com.stringDemo;

public class A3 {
	static final int MAX_CHARS = 256;
	static void CountCharacter(String s, int[] ctr) {
		for(int i=0;i<s.length();i++) {
			ctr[s.charAt(i)]++;
		}
	}
		static void showDuplicates(String s) {
			int ctr[] = new int[MAX_CHARS];
			CountCharacter(s, ctr);
			for(int i=0;i<MAX_CHARS;i++) {
				if(ctr[i]>1) {
					System.out.printf("%c appears %d times\n",i,ctr[i]);
			}
		}
	}
	public static void main(String[] args) {
		String s = "w3resource tops technology";
		System.out.println("The given string is: "+s);
		System.out.println("The duplicate characters and counts are: ");
		showDuplicates(s);
	}

}
