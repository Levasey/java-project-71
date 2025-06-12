package hexlet.code;

import hexlet.code.formatters.FormatFactory;

import java.util.Map;
import java.util.TreeMap;

public class Differ {
    public static String generate(String filePath1, String filePath2, String format) throws Exception {
        Map<String, Object> data1 = Utils.load(filePath1);
        Map<String, Object> data2 = Utils.load(filePath2);
        Map<String, DifferItem> diff = buildDiff(data1, data2);
        return FormatFactory.format(diff, format);
    }

    public static String generate(String filePath1, String filePath2) throws Exception {
        return generate(filePath1, filePath2, "stylish");
    }

    private static Map<String, DifferItem>  buildDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, DifferItem> diff = new TreeMap<>();

        data1.forEach((key, value1) -> {
            if (data2.containsKey(key)) {
                Object value2 = data2.get(key);
                if (isEqual(value1, value2)) {
                    diff.put(key, new DifferItem(value1, value2, "unchanged"));
                } else {
                    diff.put(key, new DifferItem(value1, value2, "updated"));
                }
            } else {
                diff.put(key, new DifferItem(value1, null, "removed"));
            }
        });

        data2.forEach((key, value2) -> {
            if (!data1.containsKey(key)) {
                diff.put(key, new DifferItem(null, value2, "added"));
            }
        });

        return diff;
    }

    private static boolean isEqual(Object value1, Object value2) {
        if (value1 == null && value2 == null) {
            return true;
        }
        if (value1 == null || value2 == null) {
            return false;
        }
        return value1.equals(value2);
    }
}
