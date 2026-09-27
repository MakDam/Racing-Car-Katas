import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTextSource implements TextSource {

    private final Path file;

    public FileTextSource(Path file) {
        this.file = file;
    }

    @Override
    public String getText() {
        try {
            return Files.readString(file);
        } catch (IOException e) {
            throw new RuntimeException("Не удалось прочитать файл", e);
        }
    }
}