import java.util.Scanner;

public class FuelCosts {

    public void run() {

        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double price = 0;

        boolean done;
        String trash;



        done = false;

        do{

            System.out.print("Gallons in tank: ");

            if(in.hasNextDouble()){

                gallons = in.nextDouble();
                in.nextLine();
                done = true;

            }

            else{

                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);

            }

        }while(!done);



        done = false;

        do{

            System.out.print("Miles per gallon: ");

            if(in.hasNextDouble()){

                mpg = in.nextDouble();
                in.nextLine();
                done = true;

            }

            else{

                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);

            }

        }while(!done);

        done = false;

        do{

            System.out.print("Price per gallon: ");

            if(in.hasNextDouble()){

                price = in.nextDouble();
                in.nextLine();
                done = true;

            }

            else{

                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);

            }

        }while(!done);

        double cost100 = (100.0/mpg) * price;
        double distance = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n",cost100);
        System.out.printf("Maximum distance: %.2f miles%n",distance);

    }

}