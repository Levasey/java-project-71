import hexlet.code.Differ;
import org.junit.jupiter.api.Test;
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
        String file1 = "/home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/data1";
        String file2 = "/home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/data2";
        String actual = Differ.generate(file1, file2);
        assertEquals(expected.trim(), actual.trim());
    }
}
