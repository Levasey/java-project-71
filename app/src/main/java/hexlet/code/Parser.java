package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.util.Map;

public class Parser {
    public static Map<String, Object> parse(byte[] content, String filePath) throws IOException {
        ObjectMapper mapper = getMapper(filePath);
        return mapper.readValue(content, new TypeReference<>() {
        });
    }

    private static ObjectMapper getMapper(String filePath) {
        String extension = getFileExtension(filePath);
        return switch (extension) {
            case "json" -> new ObjectMapper();
            case "yml", "yaml" -> new ObjectMapper(new YAMLFactory());
            default -> throw new RuntimeException("Unsupported format: " + extension);
        };
    }

    private static String getFileExtension(String filePath) {
        int lastDotIndex = filePath.lastIndexOf('.');
        if (lastDotIndex == -1) {
            throw new RuntimeException("File has no extension: " + filePath);
        }
        return filePath.substring(lastDotIndex + 1).toLowerCase();
    }
}
