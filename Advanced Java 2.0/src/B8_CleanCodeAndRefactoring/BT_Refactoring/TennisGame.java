package B8_CleanCodeAndRefactoring.BT_Refactoring;

public class TennisGame {

    public static final String LOVE = "Love";
    public static final String DASH = "-";
    public static final String ALL = "All";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String PLAYER_1 = "player1";
    public static final String ADVANTAGE = "Advantage";
    public static final String WIN = "Win";
    public static final String PLAYER_2 = "player2";
    public static final String FOR = "for";
    public static final String SPACE = " ";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String expectedScore = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            expectedScore = getResultWhenDrawScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            expectedScore = getResultWhenExistPlayerGreaterThanOrEqualTo40(player1Score, player2Score);
        } else {
            expectedScore = getResultForRemainCase(player1Score, player2Score);
        }
        return expectedScore;
    }

    private static String getResultForRemainCase(int player1Score, int player2Score) {
        String expectedScore = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                expectedScore += DASH;
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    expectedScore += LOVE;
                    break;
                case 1:
                    expectedScore += FIFTEEN;
                    break;
                case 2:
                    expectedScore += THIRTY;
                    break;
                case 3:
                    expectedScore += FORTY;
                    break;
            }
        }
        return expectedScore;
    }

    private static String getResultWhenExistPlayerGreaterThanOrEqualTo40(int player1Score, int player2Score) {
        String expectedScore;
        int distanceScore = player1Score - player2Score;
        if (distanceScore == 1) expectedScore = ADVANTAGE + SPACE + PLAYER_1;
        else if (distanceScore == -1) expectedScore = ADVANTAGE + SPACE + PLAYER_2;
        else if (distanceScore >= 2) expectedScore = WIN + SPACE + FOR + SPACE + PLAYER_1;
        else expectedScore = WIN + SPACE + FOR + SPACE + PLAYER_2;
        return expectedScore;
    }

    private static String getResultWhenDrawScore(int score) {
        String expectedScore;
        switch (score) {
            case 0:
                expectedScore = LOVE + DASH + ALL;
                break;
            case 1:
                expectedScore = FIFTEEN + DASH + ALL;
                break;
            case 2:
                expectedScore = THIRTY + DASH + ALL;
                break;
            case 3:
                expectedScore = FORTY + DASH + ALL;
                break;
            default:
                expectedScore = DEUCE;
                break;
        }
        return expectedScore;
    }
}
