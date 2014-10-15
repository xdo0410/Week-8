1. What is a Java class? (10 points)
    Java class is the class where we can study a high tech programming language of computer. In this class, we study how to write instructions commanding computers to perform those kinds of tasks: Software, controls hardware. 

2. What is the difference between declaring a variable and instantiating a variable (10 points)
    Declaring a variable is the creation of the variable that appear alone, the variable has to come with the type such as float, double, int or boolean. Declarations simply notify the compiler that you will be using name to refer to a variable whose type is type. Declarations do not instantiate objects.
    Instantiating variable is the new operator which instantiates a new object by allocating memory for it. new requires a single argument: a constructor method for the object to be created. The constructor method is responsible for initializing the new object.
3. Write a Odd/Even game, where the user is asked to guess whether a system generated number is Odd or Even (50 points)

import java.util.Scanner;
public class OddEven 
{
	public static void main(String[] args )
	{
		int x;
	     System.out.println("Enter an integer for the sytem to guess if it is odd or even ");
	     Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	 
	      if ( x % 2 == 0 )
	         System.out.println("You entered an even number.");
	      else
	         System.out.println("You entered an odd number.");
	  
	}
}

4. Allow the user to play until the user no longer interested (20 points)

import java.util.Scanner;
public class OddEven 
{
	public static void main(String[] args )
	{
		int x;
	    String answer = "";
	 do
	 {
		 System.out.println("Enter an integer for the sytem to guess if it is odd or even ");
	     Scanner in = new Scanner(System.in);
	     x = in.nextInt();
	      if ( x % 2 == 0 )
	         System.out.println("You entered an even number.");
	      else
	         System.out.println("You entered an odd number.");
	      
	      System.out.println("Continue(Y/N)");

	      answer = in.next();
	      
	 }
	 
	  while (answer.equals("y"));
		  
	}
}


5. Keep track of number of wins and loses and inform user upon game completion (10 points)
import java.util.Scanner;

public class OddEven
{
	
	
		public static void main(String[] args )
		{
		     int x, wins =0, losses=0;
		     String answer = "";
		     
		    
		 
		     do
		         {
		    	 System.out.println("Enter an integer to check if it is odd or even ");
			     Scanner in = new Scanner(System.in);
			     x = in.nextInt();
			     
			      if ( x % 2 == 0 )
			      	{
			    	  System.out.println("You entered an even number.");
			    	  wins++;
			      	}
			      else
			      	{
			    	  System.out.println("You entered an odd number.");
			    	  losses++;
			      	}
			      
			      System.out.print("Continue(Y/N)");
			      answer = in.next();
	        	}
		     while (answer.equals("y"));
		    	 
		     System.out.printf("Wins: %d \nLosses: %d", wins, losses);
		}
}

6. Use a class to generate the randome odd/even number (5 points)
import java.util.Random;

public class RandomNum
{
		private int genNum;
		
		public int generateNum()
		{
			
			Random rando = new Random();
			
			genNum = rando.nextInt();
			
			
		    return genNum; 
		}
		
		public int getGenerNum()
		{
			return genNum;
		}
}



import java.util.Scanner;


public class evenOdd
{
	
	public static void main(String[] args)
	{
		RandomNum object = new RandomNum();
		Scanner in = new Scanner(System.in);
		
		int genNum = object.getGenerNum();
		int answer=1, wins =0, losses=0;
	    
		while(answer == 1)
	    {	
			if ( genNum % 2 == 0 )
				{
			    	  System.out.println("System generated number is even.");
			    	  wins++;
			    }
			else
			  	{
			    	  System.out.println("System generated number is odd.");
			    	  losses++;
			  	}
			      
			      System.out.print("Do you still wish to play? (0 for no, 1 for yes)");
			      answer = in.nextInt();	
	    }
	     System.out.printf("Wins: %d \nLosses: %d", wins, losses);
		
	}

}


7. Add a method to test whether the number is odd/even, and use it in the game (10 points)

import java.util.Random;
import java.util.Scanner;

public class RandomNum
{
		private int genNum, wins =0, losses =0;
		
		public int generateNum()
		{
			
			Random rando = new Random();
			
			genNum = rando.nextInt();
			
			
		    return genNum; 
		}
		
		public void checknum(int genNum)
		{
			if ( genNum % 2 == 0 )
			
		    	  System.out.println("System generated number is even.");
		    
		else
		  	
		    	 System.out.println("System generated number is odd.");
		    	
		}
		
		public int getGenerNum()
		{
			return genNum;
		}
}




public class evenOdd
{
	
	public static void main(String[] args)
	{
		Ya object = new RandomNum();
		Scanner in = new Scanner();
		
		
		int answer=1;
	    
		while(answer == 1)
	    {	
			int genNum = object.getGenerNum();
			
			object.checknum(genNum);
			
			System.out.print("Do you still wish to play? (0 for no, 1 for yes)");
			answer = in.nextInt();	
	    }
	     System.out.print("Thanks for playing!");
		
	}
