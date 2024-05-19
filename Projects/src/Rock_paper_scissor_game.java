import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor :: ");
        int userInput=sc.nextInt();
        Random random=new Random();
        int computerInput= random.nextInt(3);

        if(computerInput==0){
            System.out.println("Computer choice: Rock - 0");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper - 1");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors - 2");
        }

        if(computerInput==userInput)
        {
            System.out.println("Draw");
        } else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0
                ||userInput==2 && computerInput==1 ) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("You Lose!");
        }
    }
}
