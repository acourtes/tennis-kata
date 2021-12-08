package fr.client;

public class TennisGame {
    private static final String EMPTY_STRING = "";

    private int player1Score;
    private int player2Score;

    public String displayGameScore() {
        if (ScoreUtils.aPlayerWinsTheGame(player1Score, player2Score)) {
            resetPlayersScore();
            return EMPTY_STRING;
        }

        return TennisGameDisplay.displayGameScore(player1Score, player2Score);
    }

    private void resetPlayersScore() {
        player1Score = 0;
        player2Score = 0;
    }

    public void player1Scores() {
        player1Score++;
    }

    public void player2Scores() {
        player2Score++;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }
}
