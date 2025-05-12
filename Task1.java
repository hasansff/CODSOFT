import java.util.*;
import java.util.Random;
public class Task1 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        Random rand = new Random();

        //generating random numbers
        int randomnos = rand.nextInt(100)+1;

        int target = randomnos;

        int guess = 0;

        while(guess!=target){
            System.out.print("enter your guess : ");
            guess = S.nextInt();

            if(guess > 100 || guess < 1){
                System.out.println("the number is out of range . Please enter a number within the range (Range 1 to 100)");
            }
           
            if(randomnos < guess){
                System.out.println("the number you have guessed is too high . re - guess the number");
            }
            else if(randomnos > guess){
                    System.out.println("the number you have guessed is too low . re - guess the number");
            }
            else{
                System.out.println("you have guessed the correct number!");
            }
            
        }
        
    }
}
  