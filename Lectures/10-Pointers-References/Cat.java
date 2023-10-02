import java.util.ArrayList;
public class Cat {
  public String name;
  public ArrayList<String> colours;
  public final int x = 0;

  Cat() { // Default constructor
    colours = new ArrayList<>();
    colours.add("Brown");
    name = "youthere";
    System.out.println("Default Constructor " + name);
  }

  Cat(String theName, ArrayList<String> theColours) {
    name = theName;
    colours = theColours;
    System.out.println("Constructor " + name);
  }

  Cat(Cat original) { // Copy constructor
    name = original.name; // Strings are special, so this one behaves as expected
    colours = original.colours; // But be careful with other object references. See in the main function below...
    System.out.println("Copy Constructor " + name);
  }

  public String toString() {
    return "a cat with the name " + name + " and the colours " +colours.toString();
  }

  public static void doSomething(Cat theCat) {
    System.out.println("Doing something with " + theCat.toString());
  }

  public static void main(String [] args) {
    Cat stray = new Cat();
    System.out.println("Stray: " + stray.toString());

    //Cat mongrel = stray; // Create a new reference 'mongrel', and points it at the same object as 'stray'
    Cat mongrel = new Cat(stray); // Invoke the copy constructor

    mongrel.name="Manny";
    mongrel.colours.add("White"); // This is where the "Just copy the reference" will bite us!
    System.out.println("Mongrel: " + mongrel.toString());
    System.out.println("Stray, as it is now: " + stray.toString());

    doSomething(mongrel); // Will only pass the reference, less risk of accidentally copying the object
  }
}