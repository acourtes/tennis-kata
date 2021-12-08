package fr.client;

public class TennisGame {
    short player1Score;

    public String displayGameScore() {
        if (player1Score == 1) {
            return "Current game status : 15-0";
        } else if (player1Score == 2) {
            return "Current game status : 30-0";
        }
        return "Current game status : 0-0";
    }

    public void player1Scores() {
        player1Score++;
    }
}
