package hexlet.code.formatters;

import hexlet.code.DifferItem;

import java.util.Map;

public interface Formatter {
    String format(Map<String, DifferItem> diff);
}
