package QuizPackages;

import java.util.Arrays;
import java.util.Scanner;

public class GeographyQuestions {
    public static int geoQuestions(String playerName) {
        System.out.println("\n\n------ GEOGRAPHY QUIZ ------");
        int geoCorrectQuestions = 0;

        Scanner myScanner = new Scanner(System.in);
        String userInput;

        // 1. question
        System.out.println("1. What is the capital city of the USA ? (Question with single answer)");
        System.out.println("a. New York");
        System.out.println("b. Washington D.C.");
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
            geoCorrectQuestions++;
        }
        System.out.println(userInput + " (user input)");
        System.out.println("the correct answer is: b");

        // 2. question
        System.out.println("\n2. What is the second-largest country in the world ? (Question with single answer)");
        System.out.println("a. Canada");
        System.out.println("b. USA");
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
        if (userInput.equals("a")) {
            geoCorrectQuestions++;
        }
        System.out.println(userInput + " (user input)");
        System.out.println("the correct answer is: a");

        // 3. question
        System.out.println("\n3. Which of these volcanoes are in Iceland ? (Question with multiple answers)");
        System.out.println("a. Eyjafjallajökull Volcano");
        System.out.println("b. Katla Volcano");
        System.out.println("c. Krakatoa Volcano");
        System.out.println("d. Hekla Volcano");
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
        System.out.println("the correct answer is: abd");

        // String userInput to char[] to sort chars
        // then, convert char[] to String again.
        char[] newCharArray = userInput.toCharArray();
        Arrays.sort(newCharArray);
        userInput = new String(newCharArray);
        if (userInput.equals("abd")) {
            geoCorrectQuestions++;
        }

        // end of this geo quiz
        System.out.println("\n\n------ SCORE AFTER GEO QUIZ ------");
        System.out.println(playerName + ", you answered " + geoCorrectQuestions +
                "/" + ConstantsQuiz.NUMBER_OF_QUESTIONS + " questions correctly in the Geography quiz.");

        return geoCorrectQuestions;
    }
}
