package fr.client;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {
    private int player1Score;
    private int player2Score;

    private static final String CURRENT_GAME_STATUS = "Current game status : ";
    private final String gameScoreDisplay = "%s-%s";
    private static final String DEUCE = "deuce";

    private static final Map<Integer, String> pointsToGameScore = new HashMap<>(4);

    static {
        pointsToGameScore.put(0, "0");
        pointsToGameScore.put(1, "15");
        pointsToGameScore.put(2, "30");
        pointsToGameScore.put(3, "40");
    }

    public String displayGameScore() {
        return CURRENT_GAME_STATUS + setGameScore();
    }

    private String setGameScore() {
        if (player1Score == 3 && player2Score == 3) {
            return DEUCE;
        }

        return gameScoreDisplay.formatted(pointsToGameScore.get(player1Score),
                pointsToGameScore.get(player2Score));
    }

    public void player1Scores() {
        player1Score++;
    }

    public void player2Scores() {
        player2Score++;
    }
}
