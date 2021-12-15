package fr.client;

public class TennisMatchManager {

    private final TennisGame tennisGame;
    private final TennisSetManager tennisSetManager;

    public TennisMatchManager(TennisGame tennisGame, TennisSetManager tennisSetManager) {
        this.tennisGame = tennisGame;
        this.tennisSetManager = tennisSetManager;
    }

    // TODO give the possibility to personalize players name
    public String displayFullInformation() {
        return """
                Player 1 : nom du joueur1
                Player 2 : nom du joueur2
                %s
                %s""".formatted(tennisSetManager.displaySetScore(),
                tennisGame.displayGameScore());
    }
}
