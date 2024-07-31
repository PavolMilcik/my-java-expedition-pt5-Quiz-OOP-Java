package QuizPackages;

import java.util.Arrays;
import java.util.Scanner;

public class MathematicsQuestions {
    public static int mathQuestions(String playerName) {
        System.out.println("\n\n------ MATHEMATIC QUIZ ------");
        int mathCorrectQuestions = 0;

        Scanner myScanner = new Scanner(System.in);
        String userInput;

        // 1. question
        System.out.println("1. What is 2 + 2 ? (Question with single answer)");
        System.out.println("a. 5");
        System.out.println("b. 4");
        while (true) {
            try {
                userInput = myScanner.nextLine();
                if (userInput.contains("a") || userInput.contains("b")) {
                    if (userInput.length() == 1) {
                        break;
                    }
                }
                System.out.println("Try again.");
            } catch (Exception e) {
                System.out.println("Invalid/Wrong input! Try again.");
            }
        }
        if (userInput.equals("b")) {
            mathCorrectQuestions++;
        }
        System.out.println(userInput + " (user input)");
        System.out.println("the correct answer is: b");

        // 2. question
        System.out.println("\n2. What is 5! ? (Question with single answer)");
        System.out.println("a. 24");
        System.out.println("b. 120");
        while (true) {
            try {
                userInput = myScanner.nextLine();
                if (userInput.contains("a") || userInput.contains("b")) {
                    if (userInput.length() == 1) {
                        break;
                    }
                }
                System.out.println("Try again.");
            } catch (Exception e) {
                System.out.println("Invalid/Wrong input! Try again.");
            }
        }
        if (userInput.equals("b")) {
            mathCorrectQuestions++;
        }
        System.out.println(userInput + " (user input)");
        System.out.println("the correct answer is: b");

        // 3. question
        System.out.println("\n3. 4 = ? (Question with multiple answers)");
        System.out.println("a. 2^2");
        System.out.println("b. -2^2");
        System.out.println("c. 1 + 3");
        System.out.println("d. 4^1");
        while (true) {
            try {
                userInput = myScanner.nextLine();
                if (userInput.contains("a") && userInput.contains("b") &&
                        userInput.contains("c") && userInput.contains("d") && userInput.length() == 4) {
                    break;
                } else if (userInput.contains("a") && userInput.contains("b") &&
                        userInput.contains("c") && userInput.length() == 3) {
                    break;
                } else if (userInput.contains("a") && userInput.contains("b") &&
                        userInput.contains("d") && userInput.length() == 3) {
                    break;
                } else if (userInput.contains("a") && userInput.contains("c") &&
                        userInput.contains("d") && userInput.length() == 3) {
                    break;
                } else if (userInput.contains("b") && userInput.contains("c") &&
                        userInput.contains("d") && userInput.length() == 3) {
                    break;
                } else if (userInput.contains("b") && userInput.contains("a") &&
                        userInput.contains("c") && userInput.length() == 3) {
                    break;
                } else if (userInput.contains("a") && userInput.contains("b") && userInput.length() == 2) {
                    break;
                } else if (userInput.contains("a") && userInput.contains("c") && userInput.length() == 2) {
                    break;
                } else if (userInput.contains("a") && userInput.contains("d") && userInput.length() == 2) {
                    break;
                } else if (userInput.contains("b") && userInput.contains("c") && userInput.length() == 2) {
                    break;
                } else if (userInput.contains("b") && userInput.contains("d") && userInput.length() == 2) {
                    break;
                } else if (userInput.contains("c") && userInput.contains("d") && userInput.length() == 2) {
                    break;
                }
                System.out.println("Question with multiple answers! Try again.");
            } catch (Exception e) {
                System.out.println("Invalid/Wrong input! Try again.");
            }
        }
        System.out.println(userInput + " (user input)");
        System.out.println("the correct answer is: abcd");

        // String userInput to char[] to sort chars
        // then, convert char[] to String again.
        char[] newCharArray = userInput.toCharArray();
        Arrays.sort(newCharArray);
        userInput = new String(newCharArray);
        if (userInput.equals("abcd")) {
            mathCorrectQuestions++;
        }

        // end of this math quiz
        System.out.println("\n\n------ SCORE AFTER MATH QUIZ ------");
        System.out.println(playerName + ", you answered " + mathCorrectQuestions +
                "/" + ConstantsQuiz.NUMBER_OF_QUESTIONS + " questions correctly in the Math quiz.");

        return mathCorrectQuestions;
    }
}
