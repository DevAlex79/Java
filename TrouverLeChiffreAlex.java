import java.util.Random;
import java.util.Scanner; // Import the Scanner class

public class TrouverLeChiffreAlex {
    // Alexandra

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner saisie = new Scanner(System.in); // Create a Scanner object sur l'entrée standard alias le clavier alias
                                               
          int numberToGuess = rand.nextInt(10) + 1;
        int numberBetween = 0;

        while (numberToGuess != numberBetween) {

            System.out.println("Enter number between 1 and 10");
            numberBetween = saisie.nextInt();

            if (numberBetween > numberToGuess) {
                System.out.println("Number too big");
            }
            else if (numberBetween < numberToGuess) {
                System.out.println("Number too small");
            }
        }

        System.out.println("You are the winner !");
        saisie.close(); 
    }
    
}
