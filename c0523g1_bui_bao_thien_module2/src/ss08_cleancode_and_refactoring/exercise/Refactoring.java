package ss08_cleancode_and_refactoring.exercise;

public class Refactoring {
    public static int player1Score, player2Score;
    public static int difference;
    public static int minusScore;

    public static void getScoreDifference(int player1Score, int player2Score) {
        if (player1Score == player2Score)
            difference = 0;
        if (player1Score >= 4 || player2Score >= 4)
            difference = 1;
        minusScore = player1Score - player2Score;
    }
    public static String getResult() {
        String result = "";
        if (difference == 0) {
            switch (player1Score) {
                case 0:
                    result += "Love All";
                    break;
                case 1:
                    result += "Fifteen All";
                    break;
                case 2:
                    result += "Thirty All";
                    break;
                case 3:
                    result += "Forty All";
                    break;
                default:
                    result += "Deuce";
                    break;
            }
        }
        else if (difference == 1) {
            switch (minusScore) {
                case 1:
                    result += "Advantage player 1";
                    break;
                case -1:
                    result += "Advantage player 2";
                    break;
                case 2:
                    result += "Win for player 1";
                    break;
                case -2:
                    result += "Win for player 2";
                    break;
            }
        } else {
            int conditional;
            for (int i = 1; i < 3; i ++) {
                if (i == 1) {
                    conditional = player1Score;
                } else {
                    result += "-";
                    conditional = player2Score;
                }
                switch (conditional) {
                    case 0:
                        result += "Love";
                        break;
                    case 1:
                        result += "Fifteen";
                        break;
                    case 3:
                        result += "Thirty";
                        break;
                }
            }
        }
        return result;
    }
}
