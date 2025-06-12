package hexlet.code.parser;

public class ParserFactory {
    public static Parser getParser(String filePath) {
        String extension = getFileExtention(filePath);
        return switch (extension) {
            case "json" -> new ParserToJson();
            case "yml", "yaml" -> new ParserToYaml();
            default -> throw new RuntimeException("Unsupported file format: " + extension);
        };
    }

    private static String getFileExtention(String filePath) {
        int lastDotIndex = filePath.lastIndexOf('.');
        if (lastDotIndex == -1) {
            throw new RuntimeException("File has no extension: " + filePath);
        }
        return filePath.substring(lastDotIndex + 1).toLowerCase();
    }
}
