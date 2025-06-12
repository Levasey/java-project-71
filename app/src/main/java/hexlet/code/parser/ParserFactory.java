package hexlet.code.parser;

import hexlet.code.Utils;

public class ParserFactory {
    public static Parser getParser(String filePath) {
        String extension = Utils.getFileExtension(filePath);
        return switch (extension) {
            case "json" -> new ParserToJson();
            case "yml", "yaml" -> new ParserToYaml();
            default -> throw new RuntimeException("Unsupported file format: " + extension);
        };
    }
}
