package hexlet.code;

import picocli.CommandLine;

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

    @CommandLine.Option(names = {"-V", "--version"},
            versionHelp = true, description = "Print version information and exit.")
    private boolean versionRequested;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    /**
     * Executes the comparison of two files and prints the difference.
     * When extending this class, ensure to handle exceptions appropriately
     * and maintain the expected behavior of printing the diff result.
     */
    public void run() {
        try {
            String diff = Differ.generate(filepath1, filepath2, format);
            System.out.println(diff);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
