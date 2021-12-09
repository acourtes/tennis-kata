package fr.client;

import java.util.Objects;

public final class TennisSet {
    private int numberOfGamesForPlayer1;
    private int numberOfGamesForPlayer2;

    public TennisSet() {

    }

    public TennisSet(int numberOfGamesForPlayer1, int numberOfGamesForPlayer2) {
        this.numberOfGamesForPlayer1 = numberOfGamesForPlayer1;
        this.numberOfGamesForPlayer2 = numberOfGamesForPlayer2;
    }

    public int numberOfGamesForPlayer1() {
        return numberOfGamesForPlayer1;
    }

    public int numberOfGamesForPlayer2() {
        return numberOfGamesForPlayer2;
    }

    public void incrementNumberOfGamesForPlayer1() {
        numberOfGamesForPlayer1++;
    }

    public void incrementNumberOfGamesForPlayer2() {
        numberOfGamesForPlayer2++;
    }

    public boolean isSetWon() {
        return numberOfGamesIsAtLeastOfSixForAPlayer()
                && differenceOfGamesIsAtLeastOfTwo();
    }

    private boolean differenceOfGamesIsAtLeastOfTwo() {
        return Math.abs(numberOfGamesForPlayer1 - numberOfGamesForPlayer2) >= 2;
    }

    private boolean numberOfGamesIsAtLeastOfSixForAPlayer() {
        return numberOfGamesForPlayer1 >= 6 || numberOfGamesForPlayer2 >= 6;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TennisSet) obj;
        return this.numberOfGamesForPlayer1 == that.numberOfGamesForPlayer1 &&
                this.numberOfGamesForPlayer2 == that.numberOfGamesForPlayer2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfGamesForPlayer1, numberOfGamesForPlayer2);
    }

    @Override
    public String toString() {
        return "TennisSet[" +
                "numberOfGamesForPlayer1=" + numberOfGamesForPlayer1 + ", " +
                "numberOfGamesForPlayer2=" + numberOfGamesForPlayer2 + ']';
    }

}
