package baseball;

public class BaseBallUI {

    public static final String INPUT_NUMBERS = "숫자를 입력해주세요 : ";
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";
    public static final String GAME_END = "3스트라이크\n" +
            "3개의 숫자를 모두 맞히셨습니다! 게임 끝";
    public static final String RESTART = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String NOTHING = "낫싱";
    public static final String WRONG_INPUT_END_OPTION = "[ERROR] 1 or 2를 입력해 주세요";
    public static final String ERROR = "[ERROR] ";

    public static String printError(String errorMessage) {
        return ERROR + errorMessage;
    }

    public static String printResult(int ball, int strike) {
        StringBuilder sb = new StringBuilder();
        if (strike == 3) {
            return GAME_END;
        }
        if (strike != 0) {
            sb.append(strike);
            sb.append(STRIKE);
            sb.append(" ");
        }
        if (ball != 0) {
            sb.append(ball);
            sb.append(BALL);
        }

        if (ball == 0 && strike == 0) {
            sb.append(NOTHING);
        }

        return sb.toString();
    }
}
