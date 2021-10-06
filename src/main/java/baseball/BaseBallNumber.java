package baseball;

public class BaseBallNumber {
    public static final int BALL_NUMBER_MINIMUM = 1;
    public static final int BALL_NUMBER_MAXIMUM = 9;
    public static final String INVALID_RANGE_BALL_NUMBER = "숫자의 값이 유효하지 않습니다.";
    private final int ballNumber;

    public BaseBallNumber(int ballNumber) {
        if(!isValidBaseBallNumber()){
            throw new IllegalArgumentException(INVALID_RANGE_BALL_NUMBER);
        }
        this.ballNumber = ballNumber;
    }

    public boolean isValidBaseBallNumber() {
       return ballNumber >= BALL_NUMBER_MINIMUM && ballNumber <= BALL_NUMBER_MAXIMUM;
    }
}
