
import java.util.Scanner;

public class Reverse_letter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the letters to reverse: ");
        String a  = scanner.nextLine();

        String result = "";

        int len = a.length();

        for (int i= len-1; i>=0 ; i--){

            result = result + a.charAt(i);
        }

        System.out.println(result);
        System.out.println(a);

    }
}