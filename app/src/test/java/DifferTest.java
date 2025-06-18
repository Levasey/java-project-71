import hexlet.code.Differ;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferTest {

    private static String expectedStylish;
    private static String expectedPlain;
    private static String expectedJson;

    private static final String PATH_TO_JSON_FIRST_FILE = "src/test/resources/file1.json";
    private static final String PATH_TO_JSON_SECOND_FILE = "src/test/resources/file2.json";
    private static final String PATH_TO_YAML_FIRST_FILE = "src/test/resources/file1.yaml";
    private static final String PATH_TO_YAML_SECOND_FILE = "src/test/resources/file2.yaml";

    @BeforeAll
    public static void beforeAll() throws Exception {
        expectedStylish = Files.readString(Paths.get("src/test/resources/expected_stylish.txt"));
        expectedPlain = Files.readString(Paths.get("src/test/resources/expected_plain.txt"));
        expectedJson = Files.readString(Paths.get("src/test/resources/expected_json.txt"));
    }

    @Test
    void testDefaultJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_JSON_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_JSON_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString());
        assertEquals(expectedStylish.trim(), actual.trim());
    }

    @Test
    void testDefaultYml() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_YAML_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_YAML_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString());
        assertEquals(expectedStylish.trim(), actual.trim());
    }

    @Test
    void testStylishJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_JSON_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_JSON_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "stylish");
        assertEquals(expectedStylish.trim(), actual.trim());
    }

    @Test
    void testStylishYml() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_YAML_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_YAML_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "stylish");
        assertEquals(expectedStylish.trim(), actual.trim());
    }

    @Test
    void testPlainJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_JSON_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_JSON_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "plain");
        assertEquals(expectedPlain.trim(), actual.trim());
    }

    @Test
    void testPlainYml() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_YAML_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_YAML_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "plain");
        assertEquals(expectedPlain.trim(), actual.trim());
    }

    @Test
    void testJsonToJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_JSON_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_JSON_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "json");
        assertEquals(expectedJson.trim(), actual.trim());
    }

    @Test
    void testYamlToJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get(PATH_TO_YAML_FIRST_FILE).toAbsolutePath();
        Path file2 = Paths.get(PATH_TO_YAML_SECOND_FILE).toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "json");
        assertEquals(expectedJson.trim(), actual.trim());
    }
}
