package fr.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {
    private TennisGame sut;

    @BeforeEach
    void setUp() {
        sut = new TennisGame();
    }

    @Test
    void should_display_0_0_when_there_is_no_point_in_current_game() {
        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 0-0");
    }

    @Test
    void should_display_15_0_when_player_1_scores() {
        makePlayer1Plays(1);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 15-0");
    }

    @Test
    void should_display_30_0_when_player_1_scores_twice() {
        makePlayer1Plays(2);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 30-0");
    }

    @Test
    void should_display_40_0_when_player_1_scores_three_times() {
        makePlayer1Plays(3);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 40-0");
    }

    private void makePlayer1Plays(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            sut.player1Scores();
        }
    }
}
