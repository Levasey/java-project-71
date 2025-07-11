package hexlet.code.formatters;

import hexlet.code.DifferItem;

import java.util.Map;

public class Stylish implements Formatter {

    public final String format(Map<String, DifferItem> diff) {
        StringBuilder result = new StringBuilder("{\n");

        diff.forEach((key, item) -> {
            switch (item.getStatus()) {
                case "added" -> appendLine(result, "+", key, item.getNewValue());
                case "removed" -> appendLine(result, "-", key, item.getOldValue());
                case "updated" -> {
                    appendLine(result, "-", key, item.getOldValue());
                    appendLine(result, "+", key, item.getNewValue());
                }
                default -> appendLine(result, " ", key, item.getOldValue());
            }
        });

        return result.append("}").toString();
    }

    private void appendLine(StringBuilder builder, String prefix, String key, Object value) {
        builder.append("  ")
                .append(prefix)
                .append(" ")
                .append(key)
                .append(": ")
                .append(value)
                .append("\n");
    }
}
