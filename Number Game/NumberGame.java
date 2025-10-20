import java.nio.channels.Pipe.SourceChannel;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random ();

        int min = 1;
        int max= 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalscore= 0;
        System.out.println("Welcome to the Number Game!");

        boolean playagain = true;
        while (playagain){
            int numberToGuess = rand.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean numberGuessed= false;
            System.out.println("Round " + (rounds + 1));

            System.out.println("I am thinking of number between"+ min+"and"+max);

            while (attempts < maxAttempts && ! numberGuessed){
                System.out.println("Enter your guess :");

                int userGuess = sc.nextInt();
                attempts++;
                if (userGuess ==numberToGuess);{
                    System.out.println("correct! your guessed the number!");
                    numberGuessed = true;
                    totalscore +=(maxAttempts - attempts +1);
                } if (userGuess > numberToGuess){
                    System.out.println("Too high!");

                }else {
                    System.out.println("Too low!");
                }
                if (!numberGuessed){
                    System.out.println("You have used all your attempts. The number guess was : "+ numberToGuess);
                }
                rounds++;
                System.out.println("Your score of this round: "+(numberGuessed ? (maxAttempts-attempts +1):0));
                System.out.println("Do you want to play another round ?(yes/No) : ");
                sc.nextLine();
                String again= sc.nextLine();
                playagain=  again.equalsIgnoreCase("yes");

            }
                System.out.println("Gaveover!");
                System.out.println("Total rounds played : "+rounds);
                System.out.println("Total score : "+ totalscore);
                sc.close();
        }
    }
    
}
