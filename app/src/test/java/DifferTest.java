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

    @BeforeAll
    public static void beforeAll() throws Exception {
        expectedStylish = Files.readString(Paths.get("src/test/resources/expected_stylish.txt"));
        expectedPlain = Files.readString(Paths.get("src/test/resources/expected_plain.txt"));
    }

    @Test
    void testStylishJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get("src", "test", "resources", "file1.json").toAbsolutePath();
        Path file2 = Paths.get("src", "test", "resources", "file2.json").toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString());
        assertEquals(expectedStylish.trim(), actual.trim());
    }

    @Test
    void testStylishYml() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get("src", "test", "resources", "file1.yaml").toAbsolutePath();
        Path file2 = Paths.get("src", "test", "resources", "file2.yaml").toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString());
        assertEquals(expectedStylish.trim(), actual.trim());
    }

    @Test
    void testPlainJson() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get("src", "test", "resources", "file1.json").toAbsolutePath();
        Path file2 = Paths.get("src", "test", "resources", "file2.json").toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "plain");
        assertEquals(expectedPlain.trim(), actual.trim());
    }

    @Test
    void testPlainYml() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get("src", "test", "resources", "file1.yaml").toAbsolutePath();
        Path file2 = Paths.get("src", "test", "resources", "file2.yaml").toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString(), "plain");
        assertEquals(expectedPlain.trim(), actual.trim());
    }
}
