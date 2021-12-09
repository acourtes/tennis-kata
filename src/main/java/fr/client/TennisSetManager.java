package fr.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TennisSetManager {
    private static final String SCORE = "Score : ";
    private static final String SET_FORMAT = "(%d-%d)";
    private static final String SPACE = " ";

    private final List<TennisSet> sets;
    private TennisSet currentTennisSet;

    public TennisSetManager() {
        sets = new ArrayList<>();
        currentTennisSet = new TennisSet();
        sets.add(currentTennisSet);
    }

    public String displaySetScore() {
        return SCORE + sets.stream()
                .map(set -> SET_FORMAT.formatted(set.numberOfGamesForPlayer1(), set.numberOfGamesForPlayer2()))
                        .collect(Collectors.joining(SPACE));
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
        if (currentTennisSet.isSetWon()) {
            currentTennisSet = new TennisSet();
            sets.add(currentTennisSet);
        }
    }
}
