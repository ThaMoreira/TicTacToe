public class Board {
    public static void clearBoard(char [][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }
    public static void showBoard (char [][] board) {
        System.out.println("\n    0    1    2 ");
        for (int i = 0; i < 3; i++) {
                System.out.printf("%d  %c  |  %c  |  %c  \n", i, board[i][0], board[i][1], board[i][2]);
                System.out.println("  ---------------");
        }
    }

}