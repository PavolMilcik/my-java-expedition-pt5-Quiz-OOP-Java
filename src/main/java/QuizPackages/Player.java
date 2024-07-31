package QuizPackages;

public class Player {
    private String playerName;
    private String chosenQuizType;
    private int correctAnswers;

    public Player(String playerName, String chosenQuizType, int correctAnswers) {
        this.playerName = playerName;
        this.chosenQuizType = chosenQuizType;
        this.correctAnswers = correctAnswers;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getChosenQuizType() {
        return this.chosenQuizType;
    }

    public int getCorrectAnswers() {
        return this.correctAnswers;
    }
}
