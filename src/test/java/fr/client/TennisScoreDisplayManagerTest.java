package fr.client;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TennisScoreDisplayManagerTest {

    @Test
    void should_display_deuce_when_players_scored_three_times_each() {
        var result = TennisScoreDisplayManager.displayGameScore(3, 3);

        assertThat(result).isEqualTo("Current game status : deuce");
    }

    @Test
    void should_display_15_30_when_player_1_scored_once_and_player_2_scored_twice() {
        var result = TennisScoreDisplayManager.displayGameScore(1, 2);

        assertThat(result).isEqualTo("Current game status : 15-30");
    }

    @Test
    void should_display_advantage_when_player_1_scored_4_times_and_player_2_3_times() {
        var result = TennisScoreDisplayManager.displayGameScore(4, 3);

        assertThat(result).isEqualTo("Current game status : advantage");
    }

    @Test
    void should_display_advantage_when_player_2_scored_4_times_and_player_1_3_times() {
        var result = TennisScoreDisplayManager.displayGameScore(3, 4);

        assertThat(result).isEqualTo("Current game status : advantage");
    }
}