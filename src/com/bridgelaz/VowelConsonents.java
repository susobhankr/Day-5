package com.bridgelaz;
import java.util.Scanner;
	public class VowelConsonents {
		public static void main(String[] args) {
	// TODO Auto-generated method stub
			System.out.println("Enter a character :");
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);

			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||  ch == 'O' ||  ch == 'U' )
      System.out.println(ch + " is vowel");
  else
	  System.out.println(ch + " is consonant");
	}
}