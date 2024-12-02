
import java.util.Scanner;
public class ex2 {


    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double metersToFeet(double meters) {
        return meters / 0.3048;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double input;
            System.out.println("Measurement Conversion Utility");
            System.out.println("1. Feet to Meters");
            System.out.println("2. Meters to Feet");
            System.out.println("3. Miles to Kilometers");
            System.out.println("4. Kilometers to Miles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            System.out.print("Enter the distance: ");
            input = scanner.nextDouble();

            if(choice==1) {
                    System.out.printf("%.2f feet is approximately %.2f meters.%n", input, feetToMeters(input));
                    
            }
           else if(choice==2) {
                    System.out.printf("%.2f meters is approximately %.2f feet.%n", input, metersToFeet(input));
                    
           }
           else if(choice==3) {   
           
            System.out.printf("%.2f miles is approximately %.2f kilometers.%n", input, milesToKilometers(input));
                    
           }
           else if(choice==4) {
                    System.out.printf("%.2f kilometers is approximately %.2f miles.%n", input, kilometersToMiles(input));
                 
           }
      
            else{
                System.out.println("Invalid choice. Please try again.");
            }
      
    }

  
}






