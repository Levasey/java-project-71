package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

@CommandLine.Command(
        name = "gendiff",
        description = "Compares two configuration files and shows a difference.",
        mixinStandardHelpOptions = true,
        version = "1.0"
)
public class App implements Runnable {

    @CommandLine.Parameters(paramLabel = "filepath1", index = "0", description = "path to first file")
    private String filepath1;

    @CommandLine.Parameters(paramLabel = "filepath2", index = "1", description = "path to second file")
    private String filepath2;

    @CommandLine.Option(
            names = {"-f", "--format"},
            description = "output format [default: ${DEFAULT-VALUE}]",
            defaultValue = "stylish",
            paramLabel = "format"
    )
    private String format;

    @CommandLine.Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit.")
    private boolean helpRequested;

    @CommandLine.Option(names = {"-V", "--version"}, versionHelp = true, description = "Print version information and exit.")
    private boolean versionRequested;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        try {
            Map<String, Object> data1 = getData(filepath1);
            Map<String, Object> data2 = getData(filepath2);
            System.out.println("File data: " + data1);
            System.out.println("File data: " + data2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<String, Object> getData(String filepath) throws IOException {
        String data = new String(Files.readAllBytes(Paths.get(filepath)));

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(data, new TypeReference<Map<String, Object>>() {
        });
    }
}
