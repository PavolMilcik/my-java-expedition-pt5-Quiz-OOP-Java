import QuizPackages.*;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an empty list of players.
        ArrayList<Player> allPlayers = new ArrayList<>();


        // Create the first player and play the quiz.
        // After the quiz, print the statistics about the game.
        Player firstPlayer = PlayQuiz.playTheQuiz();
        // Add a Player object to the empty List.
        allPlayers.add(firstPlayer);

        // The second player...
        Player secondPlayer = PlayQuiz.playTheQuiz();
        allPlayers.add(secondPlayer);


        // Compare the correct answers of two players.
        System.out.println("\n\n------ COMPARE CORRECT ANSWERS ------");
        if (firstPlayer.getCorrectAnswers() > secondPlayer.getCorrectAnswers()) {
            System.out.println("And the winner is " + firstPlayer.getPlayerName().toUpperCase() +
                    " with " + firstPlayer.getCorrectAnswers() + "/6 correct answers!");
        } else if (firstPlayer.getCorrectAnswers() < secondPlayer.getCorrectAnswers()) {
            System.out.println("And the winner is " + secondPlayer.getPlayerName().toUpperCase() +
                    " with " + secondPlayer.getCorrectAnswers() + "/6 correct answers!");

        } else {
            System.out.println("--- Tie! ---");
        }


        // Create a JSON file of the players' statistics.
        String allPlayersJson = new GsonBuilder().setPrettyPrinting().create().toJson(allPlayers);
        System.out.println("\n\n\n--------------------------------------------------------------------");
        System.out.println("Players' statistics:");
        System.out.println(allPlayersJson);

    }
}
