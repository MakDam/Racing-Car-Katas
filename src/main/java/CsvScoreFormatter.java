public class CsvScoreFormatter implements ScoreFormatter {

    @Override
    public String format(String playerName, int score) {
        return playerName + "," + score;
    }
}