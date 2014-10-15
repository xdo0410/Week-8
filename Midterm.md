1. What is a Java class? (10 points)
    Java class is the class where we can study a high tech programming language of computer. In this class, we study how to write instructions commanding computers to perform those kinds of tasks: Software, controls hardware. 

2. What is the difference between declaring a variable and instantiating a variable (10 points)
    Declaring a variable is the creation of the variable that appear alone, the variable has to come with the type such as float, double, int or boolean. Declarations simply notify the compiler that you will be using name to refer to a variable whose type is type. Declarations do not instantiate objects.
    Instantiating variable is the new operator which instantiates a new object by allocating memory for it. new requires a single argument: a constructor method for the object to be created. The constructor method is responsible for initializing the new object.
3. Write a Odd/Even game, where the user is asked to guess whether a system generated number is Odd or Even (50 points)

import javax.swing.JOptionPane;



public class OddEven

{

    public static void main(String[] args)

    {

        String userInput;

        int userChoice = -1, cpuChoice, timesWon = 0, timesLost = 0, timesTied = 0;

       boolean debug = false;

        

        while( userChoice >= -1)

        {

            cpuChoice = (int)(Math.random() * 10);

             

            String choice = JOptionPane.showInputDialog("Enter your choice (Odd or Even): ");




            if( choice.equalsIgnoreCase("Odd") || choice.equalsIgnoreCase("o") )

                userChoice = 0;

            else if( choice.equalsIgnoreCase("Even") || choice.equalsIgnoreCase("e") )

                userChoice = 1;
      

      
            else

            {

                String invalid = String.format("Invalid choice");
                JOptionPane.showMessageDialog(null,invalid);

                break;

            }

             //5. Keep track of number of wins and loses and inform user upon game completion//

            if( userChoice == 3) 
            {
                String won1 = String.format("You you are correct. Computer number is Odd. You are: "+ ++timesWon +":"+ timesLost);
                JOptionPane.showMessageDialog(null,won1);
            }

            else if( userChoice == 0 && cpuChoice == 0) // Odd and Odd - Correct
            {
                String tied1 = String.format("You you are correct. Computer number is Odd. \nYou are: "+ ++timesWon +":"+ timesLost);
                JOptionPane.showMessageDialog(null,tied1);
            }

            else if( userChoice == 0 && cpuChoice == 1) // Odd and Even - Wrong
            {
                String lost1 = String.format("You you are wrong. Computer number is Even. \nYou are: "+ +timesWon +":"+ ++timesLost);
                JOptionPane.showMessageDialog(null,lost1);
            }
          
            else if( userChoice == 1 && cpuChoice == 0) // Even and Even - Correct
            {
            	String won3 = String.format("You you are correct. Computer number is Even \nYou are: "+ ++timesWon +":"+ timesLost);
            	JOptionPane.showMessageDialog(null,won3);
            }
            else if( userChoice == 1 && cpuChoice == 1) // Even and Odd - Wrong
            {
            	String tied2 = String.format("You you are wrong. Computer number is Odd \nYou are: "+ timesWon +":"+ ++timesLost);
            	JOptionPane.showMessageDialog(null,tied2);
            }
         
            else // Internal Error

            {

                String error = String.format("Internal Error");
                JOptionPane.showMessageDialog(null,error);

                break;

            }

             

            if(debug == true)

            {

           String user = String.format("RAW INFO::userChoice=="+ userChoice +"::cpuChoice==="+ cpuChoice);
           JOptionPane.showMessageDialog(null,user);
            
            }
             
             
             //4. Allow the user to play until the user no longer interested //

            String again = JOptionPane.showInputDialog("Play again(y/n)? ");

            

             

            if( again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes") )

            {

                continue;

             
            }

            else
            	
            	
            	

            {
            	
            	
            	{    	   if( again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no") )
                   	
                   {String bye = String.format("Thank you for playing. Bye!");
                   	 JOptionPane.showMessageDialog(null,bye);
                   }

                break;

        	 	}

        	}
        }
        }


6. Use a class to generate the random odd/even number (5 points)

public class RandomNum 
{
	private int GenerateRandomNumber;

	public RandomNum (int RandomNumber)
	{
		  GenerateRandomNumber = RandomNumber;
		  RandomNumber = 0 + (int) ( Math.random() * 10 );
	}
	

	public void setRandomNumber (int RandomNumber)
	{
		GenerateRandomNumber = RandomNumber;
		
	}

	public int getRandomNumber ()
	{
		return GenerateRandomNumber;
	}
	
}





7. Add a method to test whether the number is odd/even, and use it in the game (10 points)

	public void checknum(int RandomNumber)
		{
			if ( RandomNumber % 2 == 0 )
			
		    	  System.out.println("System generated number is even.");
		    
		else
		  	
		    	 System.out.println("System generated number is odd.");
		    	
		}
