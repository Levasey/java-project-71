package hexlet.code;

import hexlet.code.parser.Parser;
import hexlet.code.parser.ParserFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeSet;

public class Differ {
    public static String generate(String filepath1, String filepath2) throws IOException {
        byte[] content1 = Files.readAllBytes(Path.of(filepath1));
        byte[] content2 = Files.readAllBytes(Path.of(filepath2));

        Parser parser1 = ParserFactory.getParser(filepath1);
        Parser parser2 = ParserFactory.getParser(filepath2);

        Map<String, Object> data1 = parser1.parse(content1);
        Map<String, Object> data2 = parser2.parse(content2);
        return buildDiff(data1, data2);
    }

    private static String buildDiff(Map<String, Object> data1, Map<String, Object> data2) {
        TreeSet<String> allKeys = new TreeSet<>(data1.keySet());
        allKeys.addAll(data2.keySet());

        StringBuilder result = new StringBuilder("{\n");

        for (String key : allKeys) {
            if (!data2.containsKey(key)) {
                result.append("  - ").append(key).append(": ").append(data1.get(key)).append("\n");
            } else if (!data1.containsKey(key)) {
                result.append("  + ").append(key).append(": ").append(data2.get(key)).append("\n");
            } else if (data1.get(key).equals(data2.get(key))) {
                result.append("    ").append(key).append(": ").append(data1.get(key)).append("\n");
            } else {
                result.append("  - ").append(key).append(": ").append(data1.get(key)).append("\n");
                result.append("  + ").append(key).append(": ").append(data2.get(key)).append("\n");
            }
        }
        return result.append("}").toString();
    }
}
