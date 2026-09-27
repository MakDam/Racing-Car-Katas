public class Leaderboard {

    private final ScoreFormatter formatter;

    public Leaderboard(ScoreFormatter formatter) {
        this.formatter = formatter;
    }

    public String createEntry(String playerName, int score) {
        return formatter.format(playerName, score);
    }
}