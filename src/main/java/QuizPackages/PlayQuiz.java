package QuizPackages;

public class PlayQuiz {
    public static Player playTheQuiz() {
        Intro.startQuiz();

        String playerName = ScanPlayerName.playerName();
        String chosenQuiz = ScanQuizAtBeginning.chosenQuiz();

        int correctAnswersFrstQz = 0;
        int correctAnswersScndQz = 0;
        String whatNext = "";

        if (chosenQuiz.equals(ConstantsQuiz.FIRST_QUIZ_NAME)) {
            correctAnswersFrstQz = MathematicsQuestions.mathQuestions(playerName);
            whatNext = ScanQuizDuringGame.chosenNextQuiz(ConstantsQuiz.FIRST_QUIZ_NAME);
            if (whatNext.equals(ConstantsQuiz.SECOND_QUIZ_NAME)) {
                correctAnswersScndQz = GeographyQuestions.geoQuestions(playerName);
                chosenQuiz += ", " + whatNext;
            }
        } else if (chosenQuiz.equals(ConstantsQuiz.SECOND_QUIZ_NAME)) {
            correctAnswersScndQz = GeographyQuestions.geoQuestions(playerName);
            whatNext = ScanQuizDuringGame.chosenNextQuiz(ConstantsQuiz.SECOND_QUIZ_NAME);
            if (whatNext.equals(ConstantsQuiz.FIRST_QUIZ_NAME)) {
                correctAnswersFrstQz = MathematicsQuestions.mathQuestions(playerName);
                chosenQuiz += ", " + whatNext;
            }
        }

        System.out.println("\n\n------ OVERALL SCORE ------");
        System.out.println(playerName + ", your summary:");
        System.out.println("Number of correct answers in the first " +
                ConstantsQuiz.FIRST_QUIZ_NAME + " quiz: " + correctAnswersFrstQz + "/3");
        System.out.println("Number of correct answers in the second " +
                ConstantsQuiz.SECOND_QUIZ_NAME + " quiz: " + correctAnswersScndQz + "/3");

        int correctAnswersAll = correctAnswersFrstQz + correctAnswersScndQz;
        System.out.println("\n\n------ END OF QUIZ ------");
        System.out.println(playerName + ", your total correct answers across all quizzes: " + correctAnswersAll + "/6");
        System.out.println("--------------------------------------------------------------------\n");

        return new Player(playerName, chosenQuiz, correctAnswersAll);
    }
}
