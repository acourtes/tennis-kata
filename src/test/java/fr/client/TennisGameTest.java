package fr.client;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisGameTest {

    @Test
    void should_display_0_0_when_there_is_no_point_in_current_game() {
        var sut = new TennisGame();

        String result = sut.displayGameScore();

        Assertions.assertThat(result).isEqualTo("Current game status : 0-0");
    }
}
