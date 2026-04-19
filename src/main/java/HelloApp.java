public class HelloApp {
    public static void main(String[] args) {
        System.out.println(buildGreeting(args));
    }

    private static String buildGreeting(String[] args) {
        if (args == null || args.length == 0) {
            return "Hello, World!";
        }

        StringBuilder builder = new StringBuilder();
        for (String name : args) {
            builder.append(name).append(", ");
        }

        String names = builder.length() > 0
                ? builder.substring(0, builder.length() - 2)
                : "";

        return "Hello, " + names + "!";
    }
}