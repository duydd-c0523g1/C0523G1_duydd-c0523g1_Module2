package ss8_clean_code.bai_tap;

public class Main {
    public static String drawDisplay(int playerScore){
        String resultDisplay;
        switch (playerScore) {
            case 0:
                resultDisplay = "Love-All";
                break;
            case 1:
                resultDisplay = "Fifteen-All";
                break;
            case 2:
                resultDisplay = "Thirty-All";
                break;
            case 3:
                resultDisplay = "Forty-All";
                break;
            default:
                resultDisplay = "Deuce";
                break;
        }
        return resultDisplay;
    }
    public static String winDisplay(int player1Score, int player2Score){
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) return "Advantage player1";
        else if (minusResult == -1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";
    }
    public static String matchDisplay(int playerScore){
        String result = "";
        switch(playerScore) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
        }
        return result;
    }
}
