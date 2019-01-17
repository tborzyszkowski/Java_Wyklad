package obiektowka.projekt.strategy;

import java.util.Map;

public class CommandLineWorldSizeStrategy implements WorldSizeStrategy {
    private String[] args;

    public CommandLineWorldSizeStrategy(String[] args) {
        this.args = args;
    }

    @Override
    public Map.Entry<Integer, Integer> getWorldSize() {
        if (args.length > 1) {
            try {
                var xLength = Integer.parseInt(args[0]);
                var yLength = Integer.parseInt(args[1]);

                return Map.entry(xLength, yLength);
            } catch (NumberFormatException e) {
                HandleError();
            }
        }

        try {
            var size = Integer.parseInt(args[0]);

            return Map.entry(size, size);
        } catch (NumberFormatException e) {
            HandleError();
        }

        return null;
    }

    private void HandleError() {
        System.err.println("Argument" + args[0] + " must be an integer.");
        System.exit(1);
    }
}
