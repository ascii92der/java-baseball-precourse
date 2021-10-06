package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ScoringBaseBallTest {

    private BaseBallNumbers answer;

    private BaseBallNumbers userBaseBallNumbers;

    @BeforeEach
    void setUp() {

        answer = new BaseBallNumbers(Arrays.asList(new BaseBallNumber(1), new BaseBallNumber(2), new BaseBallNumber(3)));

        userBaseBallNumbers = new BaseBallNumbers(Arrays.asList(new BaseBallNumber(3), new BaseBallNumber(2), new BaseBallNumber(5)));
    }

    @Test
    void scoringBalls() {
        ScoringBaseBall scoringBaseBall = new ScoringBaseBall(answer);

        assertThat(scoringBaseBall.scoringBallCount(userBaseBallNumbers)).isEqualTo(1);
    }

    @Test
    void scoringStrikes() {
        ScoringBaseBall scoringBaseBall = new ScoringBaseBall(answer);

        assertThat(scoringBaseBall.scoringStrikeCount(userBaseBallNumbers)).isEqualTo(1);
    }
}
