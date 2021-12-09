package fr.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisSetManagerTest {

    private TennisSetManager sut;

    @BeforeEach
    void setUp() {
        sut = new TennisSetManager();
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

    @Test
    void should_display_6_0_0_0_when_player_one_won_the_first_set() {
        makePlayer1WinGames(6);

        String result = sut.displaySetScore();

        assertThat(result).isEqualTo("Score : (6-0) (0-0)");
    }

    @Test
    void should_display_6_0_1_0_when_player_one_won_the_first_set_and_a_game_in_second_set() {
        makePlayer1WinGames(6);
        makePlayer1WinGames(1);

        String result = sut.displaySetScore();

        assertThat(result).isEqualTo("Score : (6-0) (1-0)");
    }

    private void makePlayer1WinGames(int numberOfGames) {
        sut.setNumberOfGamesForPlayer1(numberOfGames);
    }

    private void makePlayer2WinGames(int numberOfGames) {
        sut.setNumberOfGamesForPlayer2(numberOfGames);
    }
}
