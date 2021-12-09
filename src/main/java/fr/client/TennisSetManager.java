package fr.client;

import java.util.ArrayList;
import java.util.List;

public class TennisSetManager {
    private static final int MAX_NUMBER_OF_SETS = 5;

    private final List<TennisSet> sets;
    private TennisSet currentTennisSet;

    public TennisSetManager() {
        sets = new ArrayList<>();
        currentTennisSet = new TennisSet();
        sets.add(currentTennisSet);
    }

    public String displaySetScore() {
        return TennisScoreDisplayManager.displaySetScore(sets);
    }

    public void setNumberOfGamesForPlayer1(int numberOfGamesForPlayer1) {
        for (int i = 0; i < numberOfGamesForPlayer1; i++) {
            currentTennisSet.incrementNumberOfGamesForPlayer1();
            createNewSetIfCurrentSetIsWon();
        }
    }

    public void setNumberOfGamesForPlayer2(int numberOfGamesForPlayer2) {
        for (int i = 0; i < numberOfGamesForPlayer2; i++) {
            currentTennisSet.incrementNumberOfGamesForPlayer2();
            createNewSetIfCurrentSetIsWon();
        }
    }

    private void createNewSetIfCurrentSetIsWon() {
        if (currentTennisSet.isSetWon() && maximumNumberOfSetsNotYetReached()) {
            currentTennisSet = new TennisSet();
            sets.add(currentTennisSet);
        }
    }

    private boolean maximumNumberOfSetsNotYetReached() {
        return sets.size() < MAX_NUMBER_OF_SETS;
    }
}
