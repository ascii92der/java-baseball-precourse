package baseball;

public class ScoringBaseBall {
    private final BaseBallNumbers answerBaseBall;

    public ScoringBaseBall(BaseBallNumbers answerBaseBall) {
        this.answerBaseBall = answerBaseBall;
    }

    public int scoringBallCount(BaseBallNumbers baseBallNumbers) {
        return answerBaseBall.matchBalls(baseBallNumbers);
    }

    public int scoringStrikeCount(BaseBallNumbers baseBallNumbers) {
        return answerBaseBall.matchStrikes(baseBallNumbers);
    }
}
