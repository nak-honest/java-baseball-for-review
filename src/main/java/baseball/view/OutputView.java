package baseball.view;

import baseball.domain.RoundResult;
import java.util.StringJoiner;

public class OutputView {
    private static final String DELIMITER = " ";

    private OutputView() {}

    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printGameNumbersInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printBallAndStrikeResult(RoundResult roundResult) {
        int ballCount = roundResult.getBallCount();
        int strikeCount = roundResult.getStrikeCount();

        System.out.println(formatBallAndStrike(ballCount, strikeCount));
    }

    public static String formatBallAndStrike(int ballCount, int strikeCount) {
        StringJoiner ballAndStrikeResult = new StringJoiner(DELIMITER);

        if (ballCount > 0) {
            ballAndStrikeResult.add(String.format("%d볼", ballCount));
        }

        if (strikeCount > 0) {
            ballAndStrikeResult.add(String.format("%d스트라이크", strikeCount));
        }

        return ballAndStrikeResult.toString();
    }

    public static void printNothingResult() {
        System.out.println("낫싱");
    }

    public static void printSetEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
