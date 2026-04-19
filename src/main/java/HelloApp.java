public class HelloApp {
    public static void main(String[] args) {
        String greeting = buildGreeting(args);
        System.out.println(greeting);
    }

    private static String buildGreeting(String[] args) {
        if (args == null || args.length == 0) {
            return "Hello, World!";
        }
        return "Hello, " + String.join(", ", args) + "!";
    }
}