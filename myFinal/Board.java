package Git_Final_Project.myFinal;

public class Board {
     public static void initBoard(char [][] board) {
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
        //System.out.println('\n');
    }

    public static int verifyBoard(char [][] board) {
        int count = 0;

        for (int i = 0; i < 3; i++)
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2])
                return 1;
        for (int i = 0; i < 3; i++)
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i])
                return 1;
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
            return 1;
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
            return 1;
        else {
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i][j] != ' ')
                        count++;
            if (count == 9)
                return 2;
        }
        return 0;
    }
}
