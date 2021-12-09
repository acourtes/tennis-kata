package fr.client;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisMatchManagerTest {

    @Test
    void should_display_full_information_about_a_beginning_match() {
        TennisMatchManager sut = new TennisMatchManager(new TennisGame(), new TennisSetManager());

        String result = sut.displayFullInformation();

        assertThat(result).isEqualTo("""
                Player 1 : nom du joueur1
                Player 2 : nom du joueur2
                Score : (0-0)
                Current game status : 0-0""");
    }

    @Test
    void should_display_full_information_about_a_match() {
        var tennisSetManager = new TennisSetManager();
        var tennisGame = new TennisGame();
        TennisMatchManager sut = new TennisMatchManager(tennisGame, tennisSetManager);

        tennisGame.player1Scores(1);
        tennisGame.player2Scores(2);

        tennisSetManager.setNumberOfGamesForPlayer1(5);
        tennisSetManager.setNumberOfGamesForPlayer2(1);
        tennisSetManager.setNumberOfGamesForPlayer1(1);

        tennisSetManager.setNumberOfGamesForPlayer1(5);
        tennisSetManager.setNumberOfGamesForPlayer2(5);
        tennisSetManager.setNumberOfGamesForPlayer1(2);

        tennisSetManager.setNumberOfGamesForPlayer1(1);

        String result = sut.displayFullInformation();

        assertThat(result).isEqualTo("""
                Player 1 : nom du joueur1
                Player 2 : nom du joueur2
                Score : (6-1) (7-5) (1-0)
                Current game status : 15-30""");
    }
}
