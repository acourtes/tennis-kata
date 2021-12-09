package fr.client;

// TODO make this class update the number of games in tennis set manager
public class TennisGame {
    private static final String EMPTY_STRING = "";

    private int player1Score;
    private int player2Score;

    public String displayGameScore() {
        if (ScoreUtils.aPlayerWinsTheGame(player1Score, player2Score)) {
            resetPlayersScore();
            return EMPTY_STRING;
        }

        return TennisScoreDisplayManager.displayGameScore(player1Score, player2Score);
    }

    private void resetPlayersScore() {
        player1Score = 0;
        player2Score = 0;
    }

    public void player1Scores(int numberOfTimes) {
        player1Score += numberOfTimes;
    }

    public void player2Scores(int numberOfTimes) {
        player2Score += numberOfTimes;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }
}
