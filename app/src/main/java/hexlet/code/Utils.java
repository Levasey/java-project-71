package hexlet.code;

import hexlet.code.parser.ParserFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Utils {
    public static Map<String, Object> load(String filePath) throws Exception {
        byte[] content = Files.readAllBytes(Path.of(filePath));
        return ParserFactory.getParser(filePath).parse(content);
    }

    public static String getFileExtension(String filePath) {
        int lastDotIndex = filePath.lastIndexOf('.');
        if (lastDotIndex == -1) {
            throw new RuntimeException("File has no extension: " + filePath);
        }
        return filePath.substring(lastDotIndex + 1).toLowerCase();
    }
}
