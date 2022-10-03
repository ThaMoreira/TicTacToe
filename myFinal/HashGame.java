package Git_Final_Project.myFinal;

import java.util.Scanner;
public class HashGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3];
        Board.initBoard(board);

        System.out.println("*** Welcome to Tic Tac Toe Game ***\n\n"
                + "Do you wanna to hear the rules? (y/n)");
        String rules = input.nextLine();
        if (rules.equalsIgnoreCase("y"))
            Game.helpGame();
        System.out.println("\nLet's play!! ");

        Players player1 = new Players();
        player1.name = Game.getName(1);
        player1.simb = 'O';

        Players player2 = new Players();
        player2.name = Game.getName(2);
        player2.simb = 'X';

        Game.playGame(board, player1, player2);
    }
}