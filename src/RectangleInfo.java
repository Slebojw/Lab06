import java.util.Scanner;

public class RectangleInfo {

    public void run() {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done;
        String trash;
        done = false;

        do{
            System.out.print("Enter width: ");
            if(in.hasNextDouble()){
                width = in.nextDouble();
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
            System.out.print("Enter height: ");
            if(in.hasNextDouble()){

                height = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else{

                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);

            }

        }while(!done);
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

    }

}