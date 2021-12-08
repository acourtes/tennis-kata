package fr.client;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {
    private final TennisGame sut = new TennisGame();

    @Test
    void should_display_0_0_when_there_is_no_point_in_current_game() {
        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 0-0");
    }

    @Test
    void should_display_15_0_when_player_1_scores() {
        sut.player1Scores();

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 15-0");
    }
}
