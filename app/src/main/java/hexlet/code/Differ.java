package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Differ {
    public static String generate(String filepath1, String filepath2) throws IOException {
        Map<String, Object> data1 = getData(filepath1);
        Map<String, Object> data2 = getData(filepath2);
        return buildDiff(data1, data2);
    }

    private static Map<String, Object> getData(String filepath) throws IOException {
        String data = new String(Files.readAllBytes(Paths.get(filepath)));

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(data, new TypeReference<Map<String, Object>>() {
        });
    }

    private static String buildDiff(Map<String, Object> data1, Map<String, Object> data2) {
        TreeSet<String> allKeys = new TreeSet<>();
        allKeys.addAll(data1.keySet());
        allKeys.addAll(data2.keySet());

        return allKeys.stream().map(key -> {
            if (!data2.containsKey(key)) {
                return " - " + key + ": " + data1.get(key);
            } else if (!data1.containsKey(key)) {
                return " + " + key + ": " + data2.get(key);
            } else if (data1.get(key).equals(data2.get(key))) {
                return "   " + key + ": " + data1.get(key);
            } else {
                return " - " + key + ": " + data1.get(key) + "\n + " + key + ": " + data2.get(key);
            }
        }).collect(Collectors.joining("\n", "{\n", "\n}"));
    }
}
