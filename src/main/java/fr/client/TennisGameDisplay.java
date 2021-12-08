package fr.client;

import java.util.HashMap;
import java.util.Map;

public final class TennisGameDisplay {
    private static final String CURRENT_GAME_STATUS = "Current game status : ";
    private static final String gameScoreDisplay = "%s-%s";
    private static final String DEUCE = "deuce";
    private static final String ADVANTAGE = "advantage";

    private static final Map<Integer, String> pointsToGameScore = new HashMap<>(4);

    static {
        pointsToGameScore.put(0, "0");
        pointsToGameScore.put(1, "15");
        pointsToGameScore.put(2, "30");
        pointsToGameScore.put(3, "40");
    }

    public static String displayGameScore(int player1Score, int player2Score) {
        return CURRENT_GAME_STATUS + getGameScore(player1Score, player2Score);
    }

    private static String getGameScore(int player1Score, int player2Score) {
        if (player1Score == 4 && player2Score == 3) {
            return ADVANTAGE;
        }
        if (player1Score == 3 && player2Score == 3) {
            return DEUCE;
        }

        return gameScoreDisplay.formatted(pointsToGameScore.get(player1Score),
                pointsToGameScore.get(player2Score));
    }
}
