package fr.client;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisMatchManagerTest {

    @Test
    void should_display_full_information_about_a_beginning_match() {
        TennisMatchManager sut = new TennisMatchManager();

        String result = sut.displayFullInformation();

        assertThat(result).isEqualTo("""
                Player 1 : nom du joueur1
                Player 2 : nom du joueur2
                Score : (0-0)
                Current game status : 0-0""");
    }
}
