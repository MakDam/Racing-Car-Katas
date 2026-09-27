import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeaderboardTest {

    @Test
    void createsPlainEntry() {
        Leaderboard leaderboard =
                new Leaderboard(
                        new PlainScoreFormatter());

        assertEquals(
                "Alice: 100",
                leaderboard.createEntry("Alice", 100));
    }

    @Test
    void createsJsonEntry() {
        Leaderboard leaderboard =
                new Leaderboard(
                        new JsonScoreFormatter());

        assertEquals(
                "{\"player\":\"Alice\",\"score\":100}",
                leaderboard.createEntry("Alice", 100));
    }

    @Test
    void createsXmlEntry() {
        Leaderboard leaderboard =
                new Leaderboard(
                        new XmlScoreFormatter());

        assertEquals(
                "<player>Alice</player><score>100</score>",
                leaderboard.createEntry("Alice", 100));
    }

    @Test
    void createsCsvEntry() {
        Leaderboard leaderboard =
                new Leaderboard(
                        new CsvScoreFormatter());

        assertEquals(
                "Alice,100",
                leaderboard.createEntry("Alice", 100));
    }
}