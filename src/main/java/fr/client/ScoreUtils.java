package fr.client;

public class ScoreUtils {
    static boolean aPlayerWinsTheGame(int player1Score, int player2Score) {
        return atLeastAPlayerHasMoreThanForty(player1Score, player2Score)
                && playersHaveAtLeastTwoPointsOfDifference(player1Score, player2Score);
    }

    private static boolean playersHaveAtLeastTwoPointsOfDifference(int player1Score, int player2Score) {
        return Math.abs(player1Score - player2Score) >= 2;
    }

    private static boolean atLeastAPlayerHasMoreThanForty(int player1Score, int player2Score) {
        return player1Score > TennisConstants.FORTY || player2Score > TennisConstants.FORTY;
    }
}