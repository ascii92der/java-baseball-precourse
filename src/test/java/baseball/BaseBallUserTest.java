package baseball;

import org.junit.jupiter.api.Test;

public class BaseBallUserTest {

    @Test
    void computerGenerateTest() {
        BaseBallUser computer = new BaseBallUser();
    }

    @Test
    void UserGenerateTest() {
        BaseBallUser user = new BaseBallUser("123");
    }
}
