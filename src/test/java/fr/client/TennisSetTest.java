package fr.client;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TennisSetTest {

    @Test
    void should_return_true_when_set_is_won_with_6_0() {
        var tennisSet = new TennisSet(6, 0);

        var result = tennisSet.isSetWon();

        assertThat(result).isTrue();
    }

    @Test
    void should_return_false_when_set_is_won_with_6_5() {
        var tennisSet = new TennisSet(6, 5);

        var result = tennisSet.isSetWon();

        assertThat(result).isFalse();
    }
}