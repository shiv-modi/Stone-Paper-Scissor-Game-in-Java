import java.util.Random;
import java.util.Scanner;

public class game {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        int computerChoice = random.nextInt(3);

        Scanner sc = new Scanner(System.in);

        System.out.println("..........Welcome To Stone, Paper, Scissor-GAME............");

        System.out.println("0 - Stone, 1 - Paper, 2 - Scissor");

        System.out.print("Enter Your Chance : ");
        
        int userChoice = sc.nextInt();

        if (userChoice <= 2) {

            System.out.println("Computer Chance : " + computerChoice);

            if ((userChoice - computerChoice) % 3 == 0) {
                System.out.println("It's a tie!");
            } else if ((userChoice - computerChoice) % 3 == 1) {
                System.out.println("Computer Wins!");
            } else {
                System.out.println("User Wins!");
            }

        } else {
            System.out.println("Not a valid input, please try again.");
        }

        sc.close(); 
    }
}
