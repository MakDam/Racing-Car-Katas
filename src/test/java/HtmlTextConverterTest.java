import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HtmlTextConverterTest {

    @Test
    void convertsPlainText() {
        HtmlTextConverter converter =
                new HtmlTextConverter(
                        new StringTextSource("Hello"));

        assertEquals("Hello", converter.convert());
    }

    @Test
    void escapesSpecialCharacters() {
        HtmlTextConverter converter =
                new HtmlTextConverter(
                        new StringTextSource("<Hello> & \"World\""));

        assertEquals(
                "&lt;Hello&gt; &amp; &quot;World&quot;",
                converter.convert());
    }

    @Test
    void convertsNewLinesToHtmlBreaks() {
        HtmlTextConverter converter =
                new HtmlTextConverter(
                        new StringTextSource("Hello\nWorld"));

        assertEquals(
                "Hello<br>World",
                converter.convert());
    }

    @Test
    void handlesEmptyText() {
        HtmlTextConverter converter =
                new HtmlTextConverter(
                        new StringTextSource(""));

        assertEquals("", converter.convert());
    }
}