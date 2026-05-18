public class HelloApp {
    public static void main(String[] args) {
        System.out.println(buildGreeting(args));
    }

    private static String buildGreeting(String[] args) {
        if (args == null || args.length == 0) {
            return "Hello, World!";
        }

        String names = String.join(", ", args);
        return "Hello, " + names + "!";
    }
}