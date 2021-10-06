package baseball;

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
}
