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
        makePlayer1Scores(1);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 15-0");
    }

    @Test
    void should_display_30_0_when_player_1_scores_twice() {
        makePlayer1Scores(2);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 30-0");
    }

    @Test
    void should_display_40_0_when_player_1_scores_three_times() {
        makePlayer1Scores(3);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 40-0");
    }

    @Test
    void should_display_0_15_when_player_2_scores() {
        makePlayer2Scores(1);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 0-15");
    }

    @Test
    void should_display_0_30_when_player_2_scores_twice() {
        makePlayer2Scores(2);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 0-30");
    }

    @Test
    void should_display_0_40_when_player_2_scores_three_times() {
        makePlayer2Scores(3);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 0-40");
    }

    @Test
    void should_display_15_40_when_player_2_scores_three_times_and_player_1_once() {
        makePlayer2Scores(3);
        makePlayer1Scores(1);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : 15-40");
    }

    @Test
    void should_display_deuce_when_player_2_and_player_1_have_40_40() {
        makePlayer2Scores(3);
        makePlayer1Scores(3);

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : deuce");
    }

    @Test
    void should_display_advantage_when_player_2_scored_5_times_and_player_1_scored_4_times() {
        makePlayer1Scores(3);
        makePlayer2Scores(4); // advantage
        makePlayer1Scores(1); // deuce
        makePlayer2Scores(1); // advantage

        String result = sut.displayGameScore();

        assertThat(result).isEqualTo("Current game status : advantage");
    }

    @Test
    void should_display_nothing_when_player_2_wins_the_game() {
        makePlayer2Scores(4);

        String result = sut.displayGameScore();

        assertThat(result).isEmpty();
    }

    @Test
    void should_display_nothing_when_player_1_wins_the_game() {
        makePlayer1Scores(4);

        String result = sut.displayGameScore();

        assertThat(result).isEmpty();
    }

    @Test
    void should_display_nothing_when_player_1_wins_the_game_by_scoring_6_times_and_player_2_4_times() {
        makePlayer1Scores(6);
        makePlayer2Scores(4);

        String result = sut.displayGameScore();

        assertThat(result).isEmpty();
    }

    @Test
    void should_reset_players_scores_when_player_1_wins_the_game() {
        makePlayer1Scores(4);

        var result = sut.displayGameScore();

        assertThat(result).isEmpty();
        assertThat(sut.getPlayer1Score()).isZero();
    }

    @Test
    void should_reset_players_scores_when_player_2_wins_the_game() {
        makePlayer2Scores(4);

        var result = sut.displayGameScore();

        assertThat(result).isEmpty();
        assertThat(sut.getPlayer2Score()).isZero();
    }

    private void makePlayer1Scores(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            sut.player1Scores();
        }
    }

    private void makePlayer2Scores(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            sut.player2Scores();
        }
    }
}
