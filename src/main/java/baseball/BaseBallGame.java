package baseball;

import nextstep.utils.Console;

public class BaseBallGame {

    private static ScoringBaseBall scoringBaseBall;

    public static void start() {
        BaseBallUser computer = new BaseBallUser();
        scoringBaseBall = new ScoringBaseBall(computer.myNumbers());
        while (!scoringBaseBall.isEnd()) {
            playing();
        }
        end();
    }

    private static void playing() {
        try {
            System.out.print(BaseBallUI.INPUT_NUMBERS);
            BaseBallUser user = new BaseBallUser(Console.readLine());
            System.out.println(
                    BaseBallUI.printResult(
                            scoringBaseBall.scoringBallCount(user.myNumbers()),
                            scoringBaseBall.scoringStrikeCount(user.myNumbers())));
        } catch (Exception e) {
            System.out.println(BaseBallUI.printError(e.getMessage()));
            playing();
        }

    }

    private static void end() {
        System.out.println(BaseBallUI.RESTART);
        String input = Console.readLine();
        if (input.equals("1")) {
            start();
        }

        if (!(input.equals("1") || input.equals("2"))) {
            System.out.println(BaseBallUI.WRONG_INPUT_END_OPTION);
            end();
            ;
        }
    }
}
