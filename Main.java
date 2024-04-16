import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guess g = new Guess();
        int num = g.getNumber();
        String guess = g.yourGuess(num);
        System.out.println(guess);



    }
}