package fr.client;

public class TennisSet {
    private static final String SCORE = "Score : ";
    private static final String SET_FORMAT = "(%d-%d)";

    private int numberOfGamesForPlayer1;
    private int numberOfGamesForPlayer2;

    public String displaySetScore() {
        return SCORE +
                SET_FORMAT.formatted(numberOfGamesForPlayer1, numberOfGamesForPlayer2);
    }

    public void setNumberOfGamesForPlayer1(int numberOfGamesForPlayer1) {
        this.numberOfGamesForPlayer1 = numberOfGamesForPlayer1;
    }

    public void setNumberOfGamesForPlayer2(int numberOfGamesForPlayer2) {
        this.numberOfGamesForPlayer2 = numberOfGamesForPlayer2;
    }
}
