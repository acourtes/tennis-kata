package fr.client;

import java.util.HashMap;
import java.util.Map;

import static fr.client.TennisConstants.FIFTEEN;
import static fr.client.TennisConstants.FORTY;
import static fr.client.TennisConstants.LOVE;
import static fr.client.TennisConstants.THIRTY;

public final class TennisGameDisplay {
    private static final String CURRENT_GAME_STATUS = "Current game status : ";
    private static final String GAME_SCORE_FORMAT = "%s-%s";
    private static final String DEUCE = "deuce";
    private static final String ADVANTAGE = "advantage";

    private static final Map<Integer, String> pointsToGameScore = new HashMap<>(4);

    static {
        pointsToGameScore.put(LOVE, "0");
        pointsToGameScore.put(FIFTEEN, "15");
        pointsToGameScore.put(THIRTY, "30");
        pointsToGameScore.put(FORTY, "40");
    }

    public static String displayGameScore(int player1Score, int player2Score) {
        return CURRENT_GAME_STATUS + getGameScore(player1Score, player2Score);
    }

    private static String getGameScore(int player1Score, int player2Score) {
        if (isAdvantage(player1Score, player2Score)) {
            return ADVANTAGE;
        }

        if (isDeuce(player1Score, player2Score)) {
            return DEUCE;
        }

        return GAME_SCORE_FORMAT.formatted(pointsToGameScore.get(player1Score),
                pointsToGameScore.get(player2Score));
    }

    private static boolean isDeuce(int player1Score, int player2Score) {
        return player1Score == FORTY && player2Score == FORTY;
    }

    private static boolean isAdvantage(int player1Score, int player2Score) {
        return player1Score >= FORTY &&
                player1AndPlayer2HaveADifferenceOfOnePoint(player1Score, player2Score);
    }

    private static boolean player1AndPlayer2HaveADifferenceOfOnePoint(int player1Score, int player2Score) {
        return Math.abs(player1Score - player2Score) == 1;
    }
}
