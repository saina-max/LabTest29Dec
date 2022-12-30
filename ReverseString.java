/*
	 * Program to Java program to Print Reverse of the String
	 * @Author Saina Khan
	 * @date 29-dec-2022
	 */
package com.Program3;
import java.util.Scanner; 

public class ReverseString {  
	
	private static Scanner sc;

	public static void main(String args[])  
	{  
	String s;  
	sc = new Scanner(System.in);  
	System.out.print("Enter a String: ");  
	s=sc.nextLine();                    //reading string from user  
	System.out.print("After reverse string is: ");  
	for(int i=s.length();i>0;--i)                //i is the length of the string  
	{  
	System.out.print(s.charAt(i-1));            //printing the character at index i-1  
	}  
	}  
	}

