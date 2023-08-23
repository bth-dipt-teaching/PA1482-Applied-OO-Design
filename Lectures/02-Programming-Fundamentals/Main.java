import java.io.*;

public class Main {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter your name: ");
        String name = con.readLine();
        System.out.println("Hello " + name);

        // Or, shorter
        name = con.readLine("Please enter your name again: ");
        System.out.println("Hello again, " + name);

        // We can complicate things
        String lastname = con.readLine("What is your lastname, o %s? ", name);
        con.printf("Greetings, %s %s!\n", name, lastname);
    }
}