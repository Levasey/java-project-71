package hexlet.code;

import picocli.CommandLine;

@CommandLine.Command(
        name = "gendiff",
        description = "Compares two configuration files and shows a difference.",
        mixinStandardHelpOptions = true,
        version = "1.0"
)
public class App implements Runnable {

    @CommandLine.Option(names = { "-h", "--help" }, usageHelp = true, description = "Show this help message and exit.")
    private boolean helpRequested;

    @CommandLine.Option(names = {"-V", "--version"}, versionHelp = true, description = "Print version information and exit.")
    private boolean versionRequested;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        if (!helpRequested && !versionRequested) {
            CommandLine.usage(this, System.out);
        }
    }
}