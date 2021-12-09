package fr.client;

public class TennisMatchManager {
    private static final String SYSTEM_LINE_SEPARATOR = System.getProperty("line.separator");

    private final TennisGame tennisGame;
    private final TennisSetManager tennisSetManager;

    public TennisMatchManager(TennisGame tennisGame, TennisSetManager tennisSetManager) {
        this.tennisGame = tennisGame;
        this.tennisSetManager = tennisSetManager;
    }

    public String displayFullInformation() {
        return """
                Player 1 : nom du joueur1
                Player 2 : nom du joueur2"""
                + SYSTEM_LINE_SEPARATOR
                + tennisSetManager.displaySetScore()
                + SYSTEM_LINE_SEPARATOR
                + tennisGame.displayGameScore();
    }
}
