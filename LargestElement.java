/*
	 * Program to Java program to convert Print Largest Number
	 * @Author Saina Khan
	 * @date 29-dec-2022
	 */

package com.Program5;

public class LargestElement {
	    public static void main(String[] args) {  
	  
	        //Initialize array  
	        int [] arr = new int [] {2,5,70,3,1};  
	        //Initialize max with first element of array.  
	        int max = arr[0];  
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) {  
	            //Compare elements of array with max  
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    }  
	}
