public class Ticket {
  private int aField;
  public Car anotherField;
  protected String aThirdField; // We will get back to what "protected" means.

  private String startStation;
  private String endStation;
  private String customerId;

  Ticket() {  // Default constructor, used when you create objects without any parameters.
    startStation = "Karlskrona";
    endStation = "anywhereElse";
    customerId = "";
  }

  Ticket(String theEndStation) {
    this();
    endStation = theEndStation;
  }

  public static void main(String[] args) {    } // Should not be needed, using this just to fool my Compiler.
}