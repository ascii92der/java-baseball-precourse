package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseBallNumbersTest {

    @Test
    void validBaseBallNumbersLength() {
        List<BaseBallNumber> baseBallNumberList = Arrays.asList(new BaseBallNumber(1), new BaseBallNumber(2));
        assertThatThrownBy(() -> new BaseBallNumbers(baseBallNumberList)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validBaseBallNumbersDuplication() {
        List<BaseBallNumber> baseBallNumberList = Arrays.asList(new BaseBallNumber(2), new BaseBallNumber(2), new BaseBallNumber(3));
        assertThatThrownBy(() -> new BaseBallNumbers(baseBallNumberList)).isInstanceOf(IllegalArgumentException.class);
    }
}
