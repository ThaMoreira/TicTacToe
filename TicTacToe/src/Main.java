import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3];

        System.out.println("*** Welcome to Tic Tac Toe Game ***\n\n"
                + "Do you wanna to hear the rules? (y/n)");
        String rules = input.nextLine();
        if (rules.equalsIgnoreCase("y"))
            Game.helpGame();
        System.out.println("\nLet's play!! ");

        Players player1 = new Players();
        player1.name = player1.setPlayer(1);
        player1.symb = player1.setSymbol(1);

        Players player2 = new Players();
        player2.name = player2.setPlayer(2);
        player2.symb = player2.setSymbol(2);


    }
}