package hexlet.code.formatters;

import hexlet.code.DifferItem;

import java.util.Map;

public class FormatFactory {
    public static String format(Map<String, DifferItem> diff, String format) throws Exception {
        return switch (format) {
            case "stylish" -> new Stylish().format(diff);
            case "plain" -> new Plain().format(diff);
            case "json" -> new JsonFormatter().format(diff);
            default -> throw new IllegalArgumentException("Unknown format: " + format);
        };
    }
}
