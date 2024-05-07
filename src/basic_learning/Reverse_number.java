package basic_learning;
import java.util.Scanner;

public class Reverse_number {


        public static void main(String[] args) {

                int number;
                int reversedNumber;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number to reverse: ");
                number = scanner.nextInt();

                reversedNumber = reverse(number);

                System.out.println("Reversed number: " + reversedNumber);
                scanner.close();
        }

        public static int reverse(int number) {
                int reversedNumber = 0;
                while (number > 0) {
                        int digit = number % 10;
                        reversedNumber = reversedNumber * 10 + digit;
                        number = number/10;
                }
                return reversedNumber;
        }
}
