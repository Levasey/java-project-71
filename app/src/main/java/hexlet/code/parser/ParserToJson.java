package hexlet.code.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class ParserToJson implements Parser {
    @Override
    public Map<String, Object> parse(byte[] data) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(data, new TypeReference<Map<String, Object>>() {
        });
    }
}
