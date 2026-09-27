public class XmlScoreFormatter implements ScoreFormatter {

    @Override
    public String format(String playerName, int score) {
        return "<player>"
                + playerName
                + "</player><score>"
                + score
                + "</score>";
    }
}