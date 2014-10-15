import javax.swing.JOptionPane;



public class RPS

{

    public static void main(String[] args)

    {

        String userInput;

        int userChoice = -1, cpuChoice, timesWon = 0, timesLost = 0, timesTied = 0;

        boolean debug = false;
        
        int RandomNum = 0;
        
        RandomNum randomNum = new RandomNum (RandomNum);
        

        

        while( userChoice >= -1)

        {

            cpuChoice = randomNum.getRandomNumber();

             

            String choice = JOptionPane.showInputDialog("Enter your choice (Rock, Paper, or Scissors): ");




            if( choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("r") )

                userChoice = 0;

            else if( choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("p") )

                userChoice = 1;

            else if( choice.equalsIgnoreCase("scissors") || choice.equalsIgnoreCase("s") )

                userChoice = 2;

            else if( choice.equalsIgnoreCase("debug") && debug == true)

                userChoice = 3;

            else

            {

                String invalid = String.format("Invalid choice");
                JOptionPane.showMessageDialog(null,invalid);

                break;

            }

             

            if( userChoice == 3) 
            {
                String won1 = String.format("You won! You are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);
                JOptionPane.showMessageDialog(null,won1);
            }

            else if( userChoice == 0 && cpuChoice == 0) // Rock v Rock
            {
                String tied1 = String.format("You tied! Rock v Rock \nYou are: "+ +timesWon +":"+ timesLost +":"+ ++timesTied);
                JOptionPane.showMessageDialog(null,tied1);
            }

            else if( userChoice == 0 && cpuChoice == 1) // Rock v Paper
            {
                String lost1 = String.format("You lost! Rock v Paper \nYou are: "+ +timesWon +":"+ ++timesLost +":"+ timesTied);
                JOptionPane.showMessageDialog(null,lost1);
            }
            else if( userChoice == 0 && cpuChoice == 2) // Rock v Scissors
            {
            	String won2 = String.format("You won! Rock v Scissors \nYou are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);
            	JOptionPane.showMessageDialog(null,won2);
            }
            else if( userChoice == 1 && cpuChoice == 0) // Paper v Rock
            {
            	String won3 = String.format("You won! Paper v Rock \nYou are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);
            	JOptionPane.showMessageDialog(null,won3);
            }
            else if( userChoice == 1 && cpuChoice == 1) // Paper v Paper
            {
            	String tied2 = String.format("You tied! Paper v Paper \nYou are: "+ timesWon +":"+ timesLost +":"+ ++timesTied);
            	JOptionPane.showMessageDialog(null,tied2);
            }
            else if( userChoice == 1 && cpuChoice == 2) // Paper v Scissors
            {
            	String lost2 = String.format("You lost! Paper v Scissors \nYou are: "+ timesWon +":"+ ++timesLost +":"+ timesTied);
            	JOptionPane.showMessageDialog(null,lost2);
            }
            else if( userChoice == 2 && cpuChoice == 0) // Scissors v Rock
            {
            	String lost3 = String.format("You lost! Scissors v Rock \nYou are: "+ timesWon +":"+ ++timesLost +":"+ timesTied);
            	JOptionPane.showMessageDialog(null,lost3);
            }
            else if( userChoice == 2 && cpuChoice == 1) // Scissors v Paper
            {
            	String won4 = String.format("You won! Scissors v Paper \nYou are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);
            	JOptionPane.showMessageDialog(null,won4);
            }
            else if( userChoice == 2 && cpuChoice == 2) // Scissors v Scissors
            {
            	String tied3 = String.format("You tied! Scissors v Scissors \nYou are: "+ timesWon +":"+ timesLost +":"+ ++timesTied);
            	JOptionPane.showMessageDialog(null,tied3);
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
             

            String again = JOptionPane.showInputDialog("Play again(y/n)? ");

            

             

            if( again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes") )

            {

                continue;

            }

            else

            {

                break;

            }

        }


    }

}
