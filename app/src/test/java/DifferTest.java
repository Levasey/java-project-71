import hexlet.code.Differ;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferTest {
    private final String expected = """
            {
              - follow: false
                host: hexlet.io
              - proxy: 123.234.53.22
              - timeout: 50
              + timeout: 20
              + verbose: true
            }""";

    @Test
    public void testGenerate() throws Exception {
        // Get the path relative to the project root
        Path file1 = Paths.get("src", "test", "resources", "data1").toAbsolutePath();
        Path file2 = Paths.get("src", "test", "resources", "data2").toAbsolutePath();

        String actual = Differ.generate(file1.toString(), file2.toString());
        assertEquals(expected.trim(), actual.trim());
    }
}
