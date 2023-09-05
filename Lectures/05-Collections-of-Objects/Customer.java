import java.util.ArrayList;

public class Customer {
  private ArrayList<Ticket> myTickets; 

  public Customer() {
    myTickets = new ArrayList<>(); 
  }

  public void addTicket(Ticket theTicket) {
    myTickets.add(theTicket); // Note that we no longer need a dedicated variable for theTicket
  }

  public int countTickets() {
    return myTickets.size();
  }

  public ArrayList<Ticket> getTickets() { // CAREFUL HERE
    return myTickets;                     // This is *not* a good idea to return
  }                                       // your internal and private attributes

  public void describeTicket(int ticketNumber) {
    if (0 <= ticketNumber   // We start at index 0
        && myTickets.size() > ticketNumber) { // size() is just outside of the collection.
      String details = myTickets.get(ticketNumber).toString();
      System.out.println(details);
    }
  }
}
