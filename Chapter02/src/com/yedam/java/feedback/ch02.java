package com.yedam.java.feedback;

public class ch02 {public static void main(String[] args) {
	
	
	
	int a; 
	int b;
	
	a = b = 10; // b = 10 담고 , a = b 자바 변수는 오른쪽에서 왼쪽으로 
	System.out.println("a:"+ a + ",b:"+ b );
	
	int result = a + b ; 
	
	System.out.println("result:" + result);

	if(result > 5) {
		int c = 100; 
	result = a + b + c ;
	System.out.println("a:" + a + ",b:" + b + ",c:" + c );
     System.out.println("result" + result);
	}

    System.out.println("============================");
    
    byte byteValue1 = 127;
    //byte byteValue = 128;
    short shortValue1 = 128;
    short shortValue2 = 32767;
    // short shortValue2 = 32768;
    int intValue1 = 32768;
    long longValue = 21475687978L;
    
    System.out.println(byteValue1);
    System.out.println(shortValue1);
    System.out.println(shortValue2);
    System.out.println(intValue1);
    System.out.println(longValue);
    
    char charValue1 = 'A'; // 65;
    System.out.println("charValue1 : " + charValue1);
    System.out.println("charValue1의 유니코드 값:"+(long)charValue1);
    
    String str1 = "A" ; 
    String str2 = "홍길동 문장 !!";
    
   System.out.println(str1);
   System.out.println(str2);
   
   float floatValue1 = 3.14F ; 
   double doubleValue = 3.14 ; 
   
   float floatValue2 = 0.1234567890123456789F ;
   double doubleValue2 = 0.1234567890123456789 ; 
   
   System.out.println(floatValue2);
   System.out.println(doubleValue2);
   
   
   boolean stop = true ; 
   stop = false ; 
   
   byte bValue = 127;
   int iValue = bValue ; 
   
   System.out.println(iValue);
   

  double dbValue = 198.87632;
  long lnValue = (long)dbValue ; 
  System.out.println(lnValue);

  
}
}
