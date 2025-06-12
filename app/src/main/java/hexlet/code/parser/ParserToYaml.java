package hexlet.code.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.IOException;
import java.util.Map;

public class ParserToYaml implements Parser {
    @Override
    public Map<String, Object> parse(byte[] data) throws IOException {
        YAMLMapper mapper = new YAMLMapper();
        return mapper.readValue(data, new TypeReference<Map<String, Object>>() {
        });
    }
}
