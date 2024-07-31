package QuizPackages;

import java.util.Scanner;

public class ScanQuizAtBeginning {
    public static String chosenQuiz() {
        System.out.println("\n\n------ QUIZ CHOICE ------");
        System.out.println("To select a quiz, enter:\n1 for " + ConstantsQuiz.FIRST_QUIZ_NAME +
                "\n2 for " + ConstantsQuiz.SECOND_QUIZ_NAME + "\nThank you!");

        Scanner myScanner = new Scanner(System.in);
        int quizTypeNumber;

        while (true) {
            try {
                quizTypeNumber = myScanner.nextInt();
                if (quizTypeNumber == 1 || quizTypeNumber == 2) {
                    break;
                } else {
                    System.out.println("Write only number 1 or 2.");
                }
            } catch (Exception e) {
                System.out.println("Invalid/Wrong input!");
                System.out.println("Write only number 1 or 2.");
                myScanner.nextLine();
            }
        }

        if (quizTypeNumber == 1) {
            return ConstantsQuiz.FIRST_QUIZ_NAME;
        } else {
            return ConstantsQuiz.SECOND_QUIZ_NAME;
        }
    }
}
