package baseball;

public class ScoringBaseBall {
    private final BaseBallNumbers answerBaseBall;
    private boolean isEnd;

    public ScoringBaseBall(BaseBallNumbers answerBaseBall) {
        this.answerBaseBall = answerBaseBall;
        isEnd = false;
    }

    public int scoringBallCount(BaseBallNumbers baseBallNumbers) {
        return answerBaseBall.matchBalls(baseBallNumbers) - answerBaseBall.matchStrikes(baseBallNumbers);
    }

    public int scoringStrikeCount(BaseBallNumbers baseBallNumbers) {
        int strike = answerBaseBall.matchStrikes(baseBallNumbers);
        if (strike == 3) {
            isEnd = true;
        }
        return strike;
    }

    public boolean isEnd() {
        return isEnd;
    }
}
