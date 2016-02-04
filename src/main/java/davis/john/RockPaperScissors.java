package davis.john;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by jrdavis on 1/27/16.
 */
public class RockPaperScissors {



    public static void main(String[] args) {


        RockPaperScissors r1 = new RockPaperScissors();
    }

    RockPaperScissors(){
        run();
    }

    public void run(){
        String personPlay;

        String computerPlay = ""; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to determine

        int round = 0;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Welcome to rock paper scissors, this will be best out of three rounds");
        System.out.println("Type Rock, Paper, or Scissors");
        computerInt = generator.nextInt(3)+1;


        if (computerInt == 1)
            computerPlay = "R";
        else if (computerInt == 2)
            computerPlay = "P";
        else if (computerInt == 3)
            computerPlay = "S";


        personPlay = "B";




        while (round < 3){



            while (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("S")) {



                //Get player's play from input-- note that this is
                // stored as a string
                System.out.println("Enter your play: ");
                personPlay = scan.next();

                //Make player's play uppercase for ease of comparison
                personPlay = personPlay.toUpperCase();

                if (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("S"))
                    System.out.println("Invalid move. Try again.");


                System.out.println("Computer play is: " + computerPlay);

            }
            //See who won. Use nested ifs

            if (personPlay.equals(computerPlay))
                System.out.println("It's a tie!");

            else if (personPlay.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors. You win!!");
                else if (computerPlay.equals("P"))
                    System.out.println("Paper eats rock. You lose!!");
                else if (personPlay.equals("P"))
                    if (computerPlay.equals("S"))
                        System.out.println("Scissor cuts paper. You lose!!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Paper eats rock. You win!!");
                    else if (personPlay.equals("S"))
                        if (computerPlay.equals("P"))
                            System.out.println("Scissor cuts paper. You win!!");
                        else if (computerPlay.equals("R"))
                            System.out.println("Rock breaks scissors. You lose!!");
                        else
                            System.out.println("Invalid user input.");

            System.out.println("the computer won " + round + " times");
            round++;

        }
    }

}
