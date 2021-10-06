package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseBallUser {
    private final BaseBallNumbers baseBallNumbers;

    public BaseBallUser() {
        this.baseBallNumbers = BaseBallNumbers.generateBaseBallNumbers();
    }

    public BaseBallUser(String inputString) {
        List<BaseBallNumber> baseBallNumberList = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            baseBallNumberList.add(new BaseBallNumber(Integer.parseInt(inputString.charAt(i) + "")));
        }

        this.baseBallNumbers = new BaseBallNumbers(baseBallNumberList);
    }

    public BaseBallNumbers myNumbers() {
        return baseBallNumbers;
    }
}
