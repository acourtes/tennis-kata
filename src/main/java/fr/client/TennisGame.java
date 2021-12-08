package fr.client;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {
    private int player1Score;
    private int player2Score;

    private final String gameScoreDisplay = "Current game status : %s-%s";

    private static final Map<Integer, String> pointsToGameScore = new HashMap<>(4);

    static {
        pointsToGameScore.put(0, "0");
        pointsToGameScore.put(1, "15");
        pointsToGameScore.put(2, "30");
        pointsToGameScore.put(3, "40");
    }

    public String displayGameScore() {
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
