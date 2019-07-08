import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int userChoice;
        int randNum;
        boolean inPlay = true;

        while (inPlay) {

            System.out.println("Welcome to Rock Paper Scissors!\nPlease make your choice...");
            System.out.println("1.Rock\n2.Paper\n3.Scissors\n4.Exit");
            Scanner scan = new Scanner(System.in);
            Random generator = new Random();
            randNum = generator.nextInt(3) + 1;
            userChoice = scan.nextInt();
            if (userChoice == 4){
                inPlay = false;

            }

            if (randNum == 1 && inPlay) {
                if (userChoice == 1) {
                    System.out.printf("You both chose rock, it's a draw.");
                } else if (userChoice == 2) {
                    System.out.printf("You win, paper beats rock");
                } else {
                    System.out.println("You lose, scissors beats rock");
                }
            }

            else if (randNum == 2 && inPlay) {
                if (userChoice == 2) {
                    System.out.printf("You both chose paper, it's a draw.");
                } else if (userChoice == 3) {
                    System.out.printf("You win, scissors beats paper");
                } else {
                    System.out.println("You lose, paper beats rock");
                }
            }

            else if (randNum == 3 && inPlay) {
                if (userChoice == 3) {
                    System.out.printf("You both chose scissors, it's a draw.");
                } else if (userChoice == 1) {
                    System.out.printf("You win, rock beats scissors");
                } else {
                    System.out.println("You lose, scissors beats paper");
                }
            }




        }
    }
}
