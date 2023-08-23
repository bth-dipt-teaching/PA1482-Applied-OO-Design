public class FluxCapacitor {
  private static final int POWERCONSUMPTION = 2;
  private int startYear;// = Date.now();
  private int destinationYear = 1955;
  private int requiredPower = 0;

  FluxCapacitor(int theStartYear) { // This is not the most obvious constructor, or indeed the only one needed.
    this.startYear = theStartYear;
    this.setDestinationYear(2015);
  }

  public void setDestinationYear(int theDestinationYear) {
    this.destinationYear=theDestinationYear;

    int tripLength = startYear - destinationYear;
    requiredPower = Math.abs(tripLength * POWERCONSUMPTION);

    theDestinationYear = 1955;
  }

  public String toString() {
    return "FluxCapacitor set to " + startYear + " (start) " + destinationYear + " (destination), requiring " + requiredPower + "MJ";
  }

  public static void main(String [] args) {
    FluxCapacitor fc = new FluxCapacitor(1985);
    System.out.println(fc);
  }
}
