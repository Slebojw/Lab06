import java.util.Scanner;
public class CtoFConverter {
    public void run() {
                Scanner in = new Scanner(System.in);

                int tempC = 0;
                int tempF;
                String trash = "";
                boolean done = false;

                do {

                    System.out.print("Enter temperature in Celsius: ");

                    if (in.hasNextInt()) {

                        tempC = in.nextInt();
                        in.nextLine();
                        done = true;

                    }
                    else {

                        trash = in.nextLine();

                        System.out.println("You entered: " + trash);
                        System.out.println("Please enter a valid integer.");

                    }

                } while(!done);

                tempF = (tempC * 9 / 5) + 32;

                System.out.println("Temperature in Fahrenheit: " + tempF);

            }

        }


