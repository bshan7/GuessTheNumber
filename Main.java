import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int state = 0;
        int number = (int) (Math.random() *100);

        System.out.println("I have chosen a number between 1 and 100");
        System.out.println("Can you guess the number?");
        for(int i=9;i>=1;i--)
        {
            System.out.println("You have "+ i + " chances left.");
            guess = scan.nextInt();
            if (guess < number)
            {
                System.out.println("The number is greater than "+ guess);
            }
            else if(guess > number)
            {
                System.out.println("The number is lesser than "+ guess);
            }
            else if(guess == number) {
                state = i+8;
                break;
            }

        }
        if(state!=0)
        {
            System.out.println("Congrats! You have won.");
            System.out.println("You have guessed in "+ state +" chances");
        }
        else
        {
            System.out.println("Sorry, the actual number is "+ number);
            System.out.println("Better luck next time");
        }
    }
}
