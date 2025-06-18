package hexlet.code;

import hexlet.code.formatters.FormatFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Differ {
    public static String generate(String filePath1, String filePath2, String format) throws Exception {
        Map<String, Object> data1 = load(filePath1);
        Map<String, Object> data2 = load(filePath2);
        Map<String, DifferItem> diff = Tree.buildDiff(data1, data2);
        return FormatFactory.format(diff, format);
    }

    public static String generate(String filePath1, String filePath2) throws Exception {
        return generate(filePath1, filePath2, "stylish");
    }

    private static Map<String, Object> load(String filePath) throws Exception {
        byte[] content = Files.readAllBytes(Path.of(filePath));
        return Parser.parse(content, filePath);
    }
}
