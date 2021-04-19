import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String option;
    public static void main(String[] args) {
        /*welcomeMsg();
        initMenu(option);*/

        new Game();
    }

    // Simple welcoming msg
    static void welcomeMsg(){
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|  Welcome to the console version of the *Snake* game.  |");
        System.out.println("|-------------------------------------------------------|");
    }
    //1st menu
    static void initMenu(String option){
        System.out.println(" Write an option from below:");
        System.out.println("1.Play");
        System.out.println("2.Exit");
        option = scan.nextLine();
        switch (option){
            case "play":
                new Game();
            case "exit":
                System.exit(0);
        }
    }
}
