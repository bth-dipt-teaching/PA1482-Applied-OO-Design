public class Ticket {
  private String movieName;
  private String showTime;

  public Ticket() {
    this("-- not specified -- ", "-- not specified --");
  }

  public Ticket(String theName, String theTime) {
    movieName = theName;
    showTime = theTime;
  }

  public String toString() {
    return "Ticket for " + movieName + " at " + showTime;
  }
}