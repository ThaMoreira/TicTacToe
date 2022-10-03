package Git_Final_Project.myFinal;

import java.util.Scanner;

public class Game {
    public static void helpGame() {
        System.out.println("RULES");
        System.out.println("The game is played on a grid that's 3 squares by 3 squares.\n" +
                "The player 1 is O and the player 2 is the X. Players take turns putting their marks in empty squares.\n" +
                "The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.\n" +
                "When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.\n");
        System.out.println("To play, enter a number for row and column. For example:\nPlayer: 02");
        System.out.println("\n  *** Board ***");
        System.out.println("    0    1    2 ");
        System.out.println("0     |     | X   ");
        System.out.println("  ---------------");
        System.out.println("1     |     |     ");
        System.out.println("  ---------------");
        System.out.println("2     |     |     ");
    }

    public static String getName(int i) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nEnter the name of the %dº player: ", i);
        return input.nextLine();
    }

    public static void playGame(char [][] board, Players player1, Players player2) {
        Board.showBoard(board);
        int over = 0;
        while (over == 0) {
            over = getShot(board, player1, over);
            if (over == 0)
                over = getShot(board, player2, over);
        }
        System.out.printf("Scoreboard: %s %d x %s %d",
                player1.name, player1.points, player2.name, player2.points);
        newGame(board, player1, player2);
    }

    public static int getShot(char [][] board, Players player, int over) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.name + " it's your turn to play (" + player.simb + "): ");
        String shot = input.nextLine();
        if (shot.length() != 2) {
            System.err.println("Enter two numbers!! Try again...\n");
            getShot(board, player, over);
        } else {
            int row = shot.charAt(0) - '0';
            int column = shot.charAt(1) - '0';
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.err.println("Invalid move!! Try again...\n");
                getShot(board, player, over);
            } else if (board[row][column] != ' ') {
                System.err.println("The square is already filled!! Try again...\n");
                getShot(board, player, over);
            } else {
                board[row][column] = player.simb;
                Board.showBoard(board);
                over = winGame(board, player, over);
            }
        }
        return over;
    }

    public static int winGame(char [][] board, Players player, int over){
        int win;

        win = Board.verifyBoard(board);
        switch (win)
        {
            case 1:
                System.out.printf("\n%s win!!\nEnd game.\n", player.name);
                player.points++;
                over = 1;
                break;
            case 2:   System.out.println("\nEnd game. Tied game.");
                        over = 1;
                        break;
            default: break;
        }
        return over;
    }

    public static void newGame(char [][] board, Players player1, Players player2) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\nPlay again? (y/n)");
        String again = input.nextLine();
        if (again.equalsIgnoreCase("y")) {
            Board.initBoard(board);
            Game.playGame(board, player1, player2);
        }
    }
}
