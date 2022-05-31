import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String args[]){
        
        Random rand = new Random();
        int upperbound = 50;

        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Guess the number between 0-50:");
            int guessed = scan.nextInt();

            if(guessed == int_random){
                System.out.println("You guessed correctly!");
                break;
            }else{
                System.out.println("You guessed wrong");
                int difference = guessed - int_random;
                if(difference > 0){
                    System.out.println("The number is lower");
                }else{
                    System.out.println("The number is higher");
                }
            }
        }
    }
}
