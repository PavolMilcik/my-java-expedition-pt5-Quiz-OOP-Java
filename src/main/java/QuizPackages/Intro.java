package QuizPackages;

public class Intro {
    public static void startQuiz() {
        System.out.println("\n\n------ QUIZ GAME ------");
        System.out.println("Welcome to the Quiz Game!\nThis quiz offers " +
                ConstantsQuiz.NUMBER_OF_QUIZZES + " options:\n" +
                "You can choose from " + ConstantsQuiz.FIRST_QUIZ_NAME +
                " quiz, and/or " + ConstantsQuiz.SECOND_QUIZ_NAME + " quiz.\n" +
                "Each quiz contains " + ConstantsQuiz.NUMBER_OF_QUESTIONS + " questions.");
    }
}
