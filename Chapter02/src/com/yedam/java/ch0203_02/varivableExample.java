package com.yedam.java.ch0203_02;

public class varivableExample {public static void main(String[] args) {

	
	byte bValue1 = 10;
	byte bValue2 = 20;
	
	int  byteResult = bValue1 + bValue2 ; 
	
	System.out.println("Result"+ byteResult);
	
	
	char cValue1= 'A';
	char cValue2 = 1;
	int charResult = cValue1 + cValue2 ;
	
   int iValue1 = 10;
   int iValue2 = iValue1/4; 
   
   System.out.println("byteResult: " + byteResult);
   System.out.println("charResult, 유니코드값 :" + charResult);
   System.out.println("charResult , 출력문자 :" + (char)charResult);
   System.out.println("intValue2 :" + iValue2);
   
   double doubleValue = iValue1/4.0;
   //intValue = 10
   // 4 
   // 10 / 4 
   // 2.5 -> 2 
   // double 타입 doubleValue = 2 ; 
   //2.0 ; ㅋㅋ
   
   
   System.out.println(doubleValue);
  System.out.println("Quiz=====================================");
   
   byte x = 10; 
   byte y = 20;
   int  m = 30;
   long n = 70L;
   
 

   int result1 = x + y + m ;
   System.out.println(result1);
   
   long result2 = x + y + n;
   System.out.println(result2);
   int x1 = 100;
   long y1 = 140L;
   float f1 = 3.14F; 
   double d1 = 10.15;
   
   float result3 = x1 + y1 + f1 ;
   System.out.println(result3);
   double result4 = y1 + f1 + d1 ;
   System.out.println(result4);
   
   int value = 10 +2 +8; // 10+2 > 12+ 8;
   String str1 = 10+ 2+ "8"; // 12 + "8" ;  > "12" + "8"  > "128"
   String str2 = 10 + "2" + 8; // "10" + "2" = "102" > "102" + "8" = "1028" 
   String str3 = "10" + 2 + 8; 
   String str4 = "10" + (2 + 8); // "1010" 
   
   System.out.println(value);
   System.out.println(str1);
   System.out.println(str2);
   System.out.println(str3);
   System.out.println(str4);
   
   
  int value1 = Integer.parseInt("10") + 2 + 8;
  System.out.println(value1);
  
  
  double value2= Double.parseDouble("3.14");
  boolean value3 = Boolean.parseBoolean("true");
		  
		  
	 if(value3) { 
		 double result = value2 + 1; 
	 System.out.println(result);
	 }
  
	 
	 String str5 = String.valueOf(10);
     String str6 = String.valueOf(10.5);
     String str7 = String.valueOf(true);
    
    		 
    		 String strResult = str5 + str6 + str7 ; 
    		 System.out.println(strResult);
    		 
    		 System.out.println("=================");
    		 
    		 
    		 
    		 
    		 
}
}
