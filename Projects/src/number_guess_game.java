import java.util.Random;
import java.util.Scanner;

/*
            Problem Statement ?
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

class game
{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void takeUserInput()
    {
        System.out.println("Guess the number :: ");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectnumber()
    {
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class number_guess_game {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b)
        {
            g.takeUserInput();
            b=g.isCorrectnumber();
        }
    }
}
