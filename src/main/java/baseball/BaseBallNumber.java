package baseball;

import nextstep.utils.Randoms;

import java.util.Objects;

public class BaseBallNumber {
    public static final int BALL_NUMBER_MINIMUM = 1;
    public static final int BALL_NUMBER_MAXIMUM = 9;
    public static final String INVALID_RANGE_BALL_NUMBER = "숫자의 값이 유효하지 않습니다.";
    private final int ballNumber;

    public BaseBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;

        if (!isValidBaseBallNumber()) {
            throw new IllegalArgumentException(INVALID_RANGE_BALL_NUMBER);
        }
    }

    public boolean isValidBaseBallNumber() {
        return (ballNumber >= BALL_NUMBER_MINIMUM && ballNumber <= BALL_NUMBER_MAXIMUM);
    }

    public static BaseBallNumber generateBaseBallNumber() {
        return new BaseBallNumber(Randoms.pickNumberInRange(BALL_NUMBER_MINIMUM, BALL_NUMBER_MAXIMUM));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseBallNumber that = (BaseBallNumber) o;
        return ballNumber == that.ballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber);
    }
}
