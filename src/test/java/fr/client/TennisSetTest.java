package fr.client;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisSetTest {

    @Test
    void should_display_0_0_for_first_set_at_the_beginning() {
        TennisSet sut = new TennisSet();

        String result = sut.displaySetScore();

        assertThat(result).isEqualTo("Score : (0-0)");
    }
}
