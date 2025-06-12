import hexlet.code.Differ;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferTest {

    private static String expected;

    @BeforeAll
    public static void beforeAll() throws Exception {
        expected = Files.readString(Paths.get("src/test/resources/expected_stylish.txt"));
    }

    @Test
    void testJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get("src", "test", "resources", "file1.json").toAbsolutePath();
        Path file2 = Paths.get("src", "test", "resources", "file2.json").toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString());
        assertEquals(expected.trim(), actual.trim());
    }

    @Test
    void testYml() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get("src", "test", "resources", "file1.yaml").toAbsolutePath();
        Path file2 = Paths.get("src", "test", "resources", "file2.yaml").toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString());
        assertEquals(expected.trim(), actual.trim());
    }
}
