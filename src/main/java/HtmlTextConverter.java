public class HtmlTextConverter {

    private final TextSource source;

    public HtmlTextConverter(TextSource source) {
        this.source = source;
    }

    public String convert() {
        return convertText(source.getText());
    }

    public String convertText(String text) {

        if (text == null || text.isEmpty()) {
            return "";
        }

        String result = escapeHtml(text);

        result = result.replace("\r\n", "\n");
        result = result.replace("\n", "<br>");

        return result;
    }

    private String escapeHtml(String text) {

        return text
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}
