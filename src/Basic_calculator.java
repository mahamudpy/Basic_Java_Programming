
import java.util.Scanner;

public class Basic_calculator {

    public static void main(String[] args) {

        System.out.print(" ----------- WELCOME TO THE CALCULATOR ----------- ");
        System.out.print("\n\n");


        while (true) {

                System.out.println(" Addition       +     ----> Type 1 to Proceed ");
                System.out.println(" Subtraction    -     ----> Type 2 to Proceed ");
                System.out.println(" Multiplication *     ----> Type 3 to Proceed ");
                System.out.println(" Division       /     ----> Type 4 to Proceed ");

                Scanner scanner = new Scanner(System.in);
                System.out.println(" What arithmetic operation do you want to do ? ");
                int dp = scanner.nextInt();

                System.out.print("Enter the First number : ");
                double a = scanner.nextDouble();
                System.out.print("Enter the Second number : ");
                double b = scanner.nextDouble();

                switch (dp) {
                    case 1:
                        double add = a + b;
                        System.out.println(" The addition of two numbers is " + add);
                        break;
                    case 2:
                        double sub;
                        if (b > a) {
                            sub = b - a;
                            System.out.println(" The subtraction of two numbers is " + sub);
                        } else {
                            sub = a - b;
                            System.out.println(" The subtraction of two numbers is " + sub);
                        }

                    case 3:
                        double mul = a * b;
                        System.out.println(" The multiplication of two numbers is " + mul);
                        break;

                    case 4:
                        double div = a / b;
                        System.out.println(" The division of two numbers is " + div);
                        break;

                    default:
                        System.out.println("Invalid input. Please try again.");
                        break;
            }

            System.out.println();
        }

    }

}