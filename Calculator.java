import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
    
        double first;
        double second;
        int choice =1;
        boolean again = true;
    
        Scanner keyboard = new Scanner(System.in);
    
        while (again == true) {
            System.out.print("Enter your First number > ");
            first = keyboard.nextDouble();
            System.out.print("Enter your Second number > ");
            second = keyboard.nextDouble();
            
            System.out.print("Please choose an option from the menu. \n" +
                             "1. Addition\n" +
                             "2. Subtraction\n" +
                             "3. Multiplication\n" +
                             "4. Division\n");
            choice = keyboard.nextInt();
            
            if (choice == 1) {
                System.out.println(first + " + " + second + " = " + (first+second));
            }
            else if (choice == 2) {
                System.out.println(first + " - " + second + " = " + (first-second));
            }
            else if (choice == 3) {
                System.out.println(first + " * " + second + " = " + (first*second));
            }
            else if (choice == 4) {
                System.out.println(first + " / " + second + " = " + (first/second));
            }
            else {
                again = false;
            }
        }
    }
}