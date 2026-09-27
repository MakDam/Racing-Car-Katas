public class StringTextSource implements TextSource {

    private final String text;

    public StringTextSource(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}