package fr.client;

public class TennisGame {
    boolean player1Scored;

    public String displayGameScore() {
        if (player1Scored) {
            return "Current game status : 15-0";
        }
        return "Current game status : 0-0";
    }

    public void player1Scores() {
        player1Scored = true;
    }
}
