public class ScoreFormatterFactory {

    public static ScoreFormatter create(String type) {

        switch (type.toLowerCase()) {

            case "plain":
                return new PlainScoreFormatter();

            case "json":
                return new JsonScoreFormatter();

            case "xml":
                return new XmlScoreFormatter();

            case "csv":
                return new CsvScoreFormatter();

            default:
                throw new IllegalArgumentException(
                        "Неизвестный формат: " + type
                );
        }
    }
}