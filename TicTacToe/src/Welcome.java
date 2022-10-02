public class Welcome {

    public void welcome() {
        System.out.println("Welcome to the Tic-Tac-Toe!");
    }

    public void rules() {
        System.out.println("RULES");
        System.out.println("The game is played on a grid that's 3 squares by 3 squares.\n" +
                "The player 1 is O and the player 2 is the X. Players take turns putting their marks in empty squares.\n" +
                "The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.\n" +
                "When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.\n");
        System.out.println("To play, enter a number for row and column." +
                " For example:\nPlayer: 02" +
                "\n\n   *** Board ***\n");
        System.out.println("    0    1    2 ");
        System.out.println("0     |     | X   ");
        System.out.println("  ---------------");
        System.out.println("1     |     |     ");
        System.out.println("  ---------------");
        System.out.println("2     |     |     ");
    }
}
