public class Dog {
  public String name;

  public Dog() { this("Goodboy"); }
  public Dog(String theName) {
    name = theName;
    System.out.println("Create " + name);
  }

  public Dog(Dog original) { // Copy Constructor
    name = original.name;
    System.out.println("Copy " + name);
  }

  public void finalize() {
    System.out.println("Closing down and clenaing up " + name);
  }

  public static void main(String [] args) {
    Dog danny = new Dog();
    Dog clony = new Dog(danny); // This invokes the copy constructor
    clony.name = "ClonyBoy";
    System.out.println("Danny: " + danny.name +"\nClony: " + clony.name);

    Dog clonyclony = clony;

    danny = null; // No remaining references to danny, will be garbage collected
    clony = null; // ClonyBoy still has one reference.
    System.gc();
    System.out.println("Just ran the Garbage Collector");
  }
}
