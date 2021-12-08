package fr.client;

public class TennisGame {
    private int player1Score;
    private int player2Score;

    public String displayGameScore() {
        return TennisGameDisplay.displayGameScore(player1Score, player2Score);
    }

    public void player1Scores() {
        player1Score++;
    }

    public void player2Scores() {
        player2Score++;
    }
}
