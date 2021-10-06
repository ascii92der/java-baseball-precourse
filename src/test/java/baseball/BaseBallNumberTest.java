package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseBallNumberTest {

    @Test
    void validBaseBallNumber() {
        assertThatThrownBy(() -> new BaseBallNumber(-1)).isInstanceOf(IllegalArgumentException.class);
    }
}
