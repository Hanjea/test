package com.yedam.java.ch0204;

import java.util.Scanner;

public class variableExample {public static void main(String[] args)throws Exception {
	
	
	System.out.print("Hello World\n");
	System.out.print("Today : 2021.10.15");

	
	
	
	int x = 1; 
	int y = 2;
	System.out.println ("x: "+ x +", y : "+ y);
	System.out.println("======================");
	System.out.printf("x: %d, y: %d", x ,y);
System.out.println("========================================================");	
	
	int value = 123;
	System.out.printf("상품의 가격: %d원\n" ,value);
	System.out.printf("상품의 가격: %6d원\n", value);
	System.out.printf("상품의 가격: %d-6원\n", value);
	System.out.printf("상품의 가격: %d06원\n", value);
	
    
	double area = 3.14159 * 10 * 10 ;
	System.out.printf("반지름이 %d인원의 넓이:%10.2f\n",10, area);
	
	int keyCode;
	
	/*
	 * while(true) { keyCode = System.in.read(); System.out.println(keyCode);
	 * 
	 * keyCode = System.in.read(); System.out.println(keyCode);
	 * 
	 * 
	 * keyCode = System.in.read(); System.out.println(keyCode); }
	 */
 
 Scanner scanner = new Scanner(System.in);
		 
		 String inputData = scanner.nextline()
         System.out.println();
int x = 1;

 
} 

}
