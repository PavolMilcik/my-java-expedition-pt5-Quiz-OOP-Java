package QuizPackages;

import java.util.Scanner;

public class ScanQuizDuringGame {
    public static String chosenNextQuiz(String actualQuiz) {
        System.out.println("\n\n------ QUIZ CHOICE ------");
        Scanner myScanner = new Scanner(System.in);
        String whatNextToDo = "";

        if (actualQuiz.equals(ConstantsQuiz.FIRST_QUIZ_NAME)) {
            System.out.println("To start another quiz - " + ConstantsQuiz.SECOND_QUIZ_NAME + " quiz, enter number 2.\n" +
                    "To quit, enter letter 'q'.");
            while (true) {
                try {
                    whatNextToDo = myScanner.nextLine();
                    if (whatNextToDo.equals("2") || whatNextToDo.equals("q")) {
                        break;
                    } else {
                        System.out.println("Write number 2, or to quit, letter 'q'.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid/Wrong input!");
                    System.out.println("Write number 2, or to quit, letter 'q'.");
                    myScanner.nextLine();
                }
            }
        } else if (actualQuiz.equals(ConstantsQuiz.SECOND_QUIZ_NAME)) {
            System.out.println("To start another quiz - " + ConstantsQuiz.FIRST_QUIZ_NAME + " quiz, enter number 1.\n" +
                    "To quit, enter letter 'q'.");
            while (true) {
                try {
                    whatNextToDo = myScanner.nextLine();
                    if (whatNextToDo.equals("1") || whatNextToDo.equals("q")) {
                        break;
                    } else {
                        System.out.println("Write number 1, or to quit, letter 'q'.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid/Wrong input!");
                    System.out.println("Write number 1, or to quit, letter 'q'.");
                    myScanner.nextLine();
                }
            }
        }

        switch (whatNextToDo) {
            case "1" -> {
                return ConstantsQuiz.FIRST_QUIZ_NAME;
            }
            case "2" -> {
                return ConstantsQuiz.SECOND_QUIZ_NAME;
            }
        }
        return whatNextToDo;
    }
}
