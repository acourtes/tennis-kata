package fr.client;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {
    private int player1Score;

    private static final Map<Integer, String> pointsToGameScore = new HashMap<>(4);

    static {
        pointsToGameScore.put(0, "0");
        pointsToGameScore.put(1, "15");
        pointsToGameScore.put(2, "30");
        pointsToGameScore.put(3, "40");
    }

    public String displayGameScore() {
        return "Current game status : " +
                pointsToGameScore.get(player1Score) +
                "-0";
    }

    public void player1Scores() {
        player1Score++;
    }
}
