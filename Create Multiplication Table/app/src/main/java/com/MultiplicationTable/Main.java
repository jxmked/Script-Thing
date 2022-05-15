package com.MultiplicationTable;

import java.util.Scanner;

public class Main {
/**
 *
 * Found this idea from Facebook where asking this kind of question
 *
 * Print Multiplication Table From given start and end numbers
 *
 * */
 
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
  	int start, end, i, j;
  	
  	
  	do {
  		System.out.println("Enter a number where multiplication table start:");
  		start = input.nextInt();
  		System.out.println("Enter a number where multiplication table end:");
  		end = input.nextInt();
  		
  		if(start >= end){
  		  System.out.println("Starting number must be lower than ending nunber");
  		}
  	} while( start >= end );

  	input.close();
  	
  	for(i = start; i <= end; i++){
  	  for(j = 1; j <= 10; j++){
  	  	System.out.printf("%d * %d = %d\n", i, j, i * j);
    	}
    	System.out.println("********************");
  	}
  }
}

/**
 * Written by Jovan De Guia
 * Github Username: Jxmked
 *
 * */