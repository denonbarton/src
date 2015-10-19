package hello.controller;

import java.util.Scanner;

public class HelloController
{
   public void start()
  
   {
      Scanner hello = new Scanner( System.in );

      int number1;
      int number2;
      boolean retry;
      
      
      
      System.out.println( "Enter first integer: " ); // prompt 
      number1 = hello.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = hello.nextInt(); // read second number from user 
      
    
      if ( number1 == number2 ) 
         System.out.printf( "%d == %d\n", number1, number2 );

      if ( number1 < number2 )
         System.out.printf( "%d < %d\n", number1, number2 );

      if ( number1 > number2 )
         System.out.printf( "%d > %d\n", number1, number2 );
      
     if ( number1 > 100)
 	  	System.out.printf( " that number is too high"); 		
     	
     if ( number1 > 100)
	  	System.out.printf( " that number is too high");
     
     System.out.println("would you like to try again? true, or false");
  		retry = hello.nextBoolean();
  		
  	if (retry == false)
  	{
  	System.out.printf( " Thanks For Playing ");
  	System.exit(0);
  	}
  	
  	if (retry = true)
  	{
  
  	
  	 System.out.println( "Enter first integer: " ); // prompt 
     number1 = hello.nextInt(); // read first number from user 

     System.out.print( "Enter second integer: " ); // prompt 
     number2 = hello.nextInt(); // read second number from user 
     
     
     if ( number1 == number2 ) 
        System.out.printf( "%d == %d\n", number1, number2 );

     if ( number1 < number2 )
        System.out.printf( "%d < %d\n", number1, number2 );

     if ( number1 > number2 )
        System.out.printf( "%d > %d\n", number1, number2 );
     
    if ( number1 > 100)
	  	System.out.printf( " that number is too high"); 		
    	
    if ( number1 > 100)
	  	System.out.printf( " that number is too high");
  	
   }
  	
  	
  	
  
  	
  	
  		
     	
     	
    

   }
    

}