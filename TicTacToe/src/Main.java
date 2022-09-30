import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Welcome welcome = new Welcome();


        welcome.welcome();
        System.out.println("Do you wanna to hear the rules? (y/n)");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            welcome.rules();
        }
        System.out.println("Let's play!! ");

    }
}