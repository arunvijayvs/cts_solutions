public class Logger {

    // Step 1: Create a private static instance of the same class
    private static Logger singleInstance;

    // Step 2: Private constructor to prevent instantiation from outside
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    // Example method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
