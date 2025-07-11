package hexlet.code.formatters;

import hexlet.code.DifferItem;

import java.util.Map;

public class Plain implements Formatter {
    @Override
    public final String format(Map<String, DifferItem> diff) {
        StringBuilder result = new StringBuilder();

        diff.forEach((key, item) -> {
            switch (item.getStatus()) {
                case "added" ->
                        result.append(String.format("Property '%s' was added with value: %s\n",
                                key, formatValue(item.getNewValue())));
                case "removed" ->
                        result.append(String.format("Property '%s' was removed\n", key));
                case "updated" ->
                        result.append(String.format("Property '%s' was updated. From %s to %s\n",
                                key, formatValue(item.getOldValue()), formatValue(item.getNewValue())));
                default -> { /* unchanged - не выводим */ }
            }
        });

        return result.toString().trim();
    }

    private static String formatValue(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof Map || value instanceof Iterable) {
            return "[complex value]";
        }
        if (value instanceof String) {
            return "'" + value + "'";
        }
        return value.toString();
    }
}
