package hexlet.code.formatters;

import com.fasterxml.jackson.databind.ObjectMapper;
import hexlet.code.DifferItem;

import java.util.Map;

public class JsonFormatter implements Formatter  {
    @Override
    public final String format(Map<String, DifferItem> diff) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(diff);
    }
}
