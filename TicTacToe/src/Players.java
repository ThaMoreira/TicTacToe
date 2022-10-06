import java.util.Scanner;

public class Players {
    String name, player1,player2;
    char symb;
    int points = 0;

    public String setPlayer(int i) {
        Scanner input = new Scanner(System.in);
        if(i == 1) {
            System.out.printf("\nEnter the name of the %dº player: ", i);
            player1 = input.nextLine();
            return player1;
        }
        System.out.printf("\nEnter the name of the %dº player: ", i);
        player2 = input.nextLine();
        return player2;
    }
    public Character setSymbol(int i){
        if(i == 1) {
            return 'O';
        }
        return 'X';
    }
}
