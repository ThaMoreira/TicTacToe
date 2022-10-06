import java.util.Scanner;

public class Game {
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
        System.out.println(player.name + " it's your turn to play you are the " + player.symb + ": ");
        System.out.println("Type the line first and then the column:" );
        String shot = input.nextLine();
        if (shot.length() != 2) {
            System.err.println("Enter two numbers without any space!! Try again...\n");
            getShot(board, player, over);
        } else {
            int row = shot.charAt(0) - '0';
            int column = shot.charAt(1) - '0';
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.err.println("Invalid move!! Try again...\n");
                getShot(board, player, over);
            } else if (board[row][column] != ' ') {
                System.err.println("This space is already filled!! Try again...\n");
                getShot(board, player, over);
            } else {
                board[row][column] = player.symb;
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
            Board.clearBoard(board);
            Game.playGame(board, player1, player2);
        }else {
            System.out.printf("Final score: %s %d x %s %d",
                    player1.name, player1.points, player2.name, player2.points);
        }
    }

}
