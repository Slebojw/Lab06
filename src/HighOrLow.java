import java.util.Random;
import java.util.Scanner;

public class HighOrLow {

    public void run() {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int random = generator.nextInt(10) + 1;
        int guess = 0;

        boolean done = false;
        String trash = "";

        do{

            System.out.print("Guess a number (1-10): ");

            if(in.hasNextInt()){

                guess = in.nextInt();
                in.nextLine();

                if(guess >= 1 && guess <= 10){

                    done = true;

                }

                else{

                    System.out.println("Guess must be between 1 and 10.");

                }

            }

            else{

                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);

            }

        }while(!done);

        System.out.println("Random number: " + random);

        if(guess == random){

            System.out.println("You got it!");

        }
        else if(guess < random){

            System.out.println("Too low!");

        }
        else{

            System.out.println("Too high!");

        }

    }

}
