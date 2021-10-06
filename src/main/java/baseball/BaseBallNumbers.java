package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BaseBallNumbers {
    public static final String INVALID_BASEBALL_NUMBERS_LENGTH = "3자리 숫자를 입력해야합니다.";
    public static final String DUPLICATED_BASEBALL_NUMBERS = "중복되지 않은 숫자를 입력해야합니다.";
    private final List<BaseBallNumber> baseBallNumberList;


    public BaseBallNumbers(List<BaseBallNumber> baseBallNumberList) {
        this.baseBallNumberList = baseBallNumberList;

        if (!validBaseBallNumbersLength()) {
            throw new IllegalArgumentException(INVALID_BASEBALL_NUMBERS_LENGTH);
        }

        if (!validBaseBallNumbersDuplication()) {
            throw new IllegalArgumentException(DUPLICATED_BASEBALL_NUMBERS);
        }

    }

    private boolean validBaseBallNumbersLength() {
        return baseBallNumberList.size() == 3;
    }

    private boolean validBaseBallNumbersDuplication() {
        return (new HashSet<>(baseBallNumberList)).size() == 3;
    }

    public int matchBalls(BaseBallNumbers baseBallNumbers) {
        int ballCount = 0;
        for (int i = 0; i < baseBallNumbers.baseBallNumberList.size(); i++) {
            ballCount = this.baseBallNumberList.contains(baseBallNumbers.baseBallNumberList.get(i)) ? ballCount + 1 : ballCount;
        }
        return ballCount;
    }

    public int matchStrikes(BaseBallNumbers baseBallNumbers) {
        if (matchBalls(baseBallNumbers) == 0) {
            return 0;
        }

        int strikeCount = 0;
        for (int i = 0; i < baseBallNumbers.baseBallNumberList.size(); i++) {
            strikeCount = this.baseBallNumberList.get(i).equals(baseBallNumbers.baseBallNumberList.get(i)) ? strikeCount + 1 : strikeCount;
        }
        return strikeCount;
    }

    public static BaseBallNumbers generateBaseBallNumbers() {
        List<BaseBallNumber> baseBallNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            baseBallNumberList.add(BaseBallNumber.generateBaseBallNumber());
        }
        BaseBallNumbers baseBallNumbers;
        try {
            baseBallNumbers = new BaseBallNumbers(baseBallNumberList);
        } catch (IllegalArgumentException e) {
            baseBallNumbers = BaseBallNumbers.generateBaseBallNumbers();
        }
        return baseBallNumbers;
    }
}
