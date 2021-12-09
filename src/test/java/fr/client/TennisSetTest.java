package fr.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisSetTest {

    private TennisSet sut;

    @BeforeEach
    void setUp() {
        sut = new TennisSet();
    }

    @Test
    void should_display_0_0_for_first_set_at_the_beginning() {
        String result = sut.displaySetScore();

        assertThat(result).isEqualTo("Score : (0-0)");
    }

    @Test
    void should_display_1_0_when_player_one_won_a_game() {
        makePlayer1WinGames(1);

        String result = sut.displaySetScore();

        assertThat(result).isEqualTo("Score : (1-0)");
    }

    @Test
    void should_display_0_1_when_player_two_won_a_game() {
        makePlayer2WinGames(1);

        String result = sut.displaySetScore();

        assertThat(result).isEqualTo("Score : (0-1)");
    }

    private void makePlayer1WinGames(int numberOfGames) {
        sut.setNumberOfGamesForPlayer1(numberOfGames);
    }

    private void makePlayer2WinGames(int numberOfGames) {
        sut.setNumberOfGamesForPlayer2(numberOfGames);
    }
}
