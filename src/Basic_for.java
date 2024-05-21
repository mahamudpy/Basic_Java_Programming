//import java.util.Scanner;

public class Basic_for {
    public static void main(String[] args) {

        int count = 0;

        for (int i =1; i<=100; i++){

            if (i%3 == 0 && i%5==0){
                System.out.println("Here is the value :  " + i);
                count++;

                if (count == 3){

                    break;
                }
            }
        }
    }
}