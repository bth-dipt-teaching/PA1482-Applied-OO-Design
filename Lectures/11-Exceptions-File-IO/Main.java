import java.util.logging.*;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        Logger l = Logger.getLogger("se.bth.example.system.Test");
        l.entering("Main","main()");

        l.setLevel(Level.ALL);
        l.info("Current log level " + l.getLevel());


        l.config("Using default configuration");
        l.info("Starting...");

        l.log(Level.FINE, "Still here...");
        l.fine("Also still here");

        l.warning("Not sure how to proceed here");

        l.exiting("Main", "main()");
    }
}