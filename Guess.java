import java.util.Scanner;

public class Guess {
    private int number;

    public Guess(){
        number = (int) ((Math.random() * 100000) + 1);
    }

    public int getNumber(){
        return number;
    }
    public String yourGuess(int guess){
        String player = "Player 1";
        Scanner s = new Scanner(System.in);
        System.out.println("Guess a random number between 1 and 100000!");
        guess = s.nextInt();

        while(guess != number) {
            if (guess > number ){
                System.out.println("Your guess is greater than the number. Guess a smaller number.");
                if (player == "Player 1") {
                    player = "Player 2";
                    System.out.println(player + " guess again");
                    guess = s.nextInt();
                } else if (player == "Player 2") {
                    player = "Player 1";
                    System.out.println(player + " guess again");
                    guess = s.nextInt();
                }
            }
            else if(guess < number) {
                System.out.println("Your guess is less than the number. Guess a bigger number.");
                if (player == "Player 1") {
                    player = "Player 2";
                    System.out.println(player + " guess again");
                    guess = s.nextInt();
                } else if (player == "Player 2") {
                    player = "Player 1";
                    System.out.println(player + " guess again");
                    guess = s.nextInt();
                }
            }
        }
        String winStatement = (player + " you win, you guessed " + guess);

        return winStatement;
    }
}

