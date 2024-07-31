package QuizPackages;

import java.util.Scanner;

public class ScanPlayerName {
    public static String playerName() {
        System.out.println("\n\n------ PLAYER NAME ------");
        System.out.println("Please enter your 'username' first:");
        Scanner myScanner = new Scanner(System.in);
        String userName = "";

        do {
            try {
                userName = myScanner.nextLine();
                if (userName.isEmpty()) {
                    System.out.println("Write something!");
                }
            } catch (Exception e) {
                System.out.println("Hmm, error!");
                System.out.println("Write something!");
            }
        } while (userName.isEmpty());

        return userName;
    }
}
