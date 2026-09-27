public class JsonScoreFormatter implements ScoreFormatter {

    @Override
    public String format(String playerName, int score) {
        return "{\"player\":\""
                + playerName
                + "\",\"score\":"
                + score
                + "}";
    }
}