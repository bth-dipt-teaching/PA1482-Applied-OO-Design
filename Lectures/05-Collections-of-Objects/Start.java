public class Start {
  public static void main(String [] args) {
    Customer c = new Customer();
    Ticket t = new Ticket("Spartacus", "19:00 tonight");

    c.addTicket(t);
    c.addTicket(new Ticket("Ben Hur", "15:00 this afternoon"));

    System.out.println(c.countTickets());
    c.describeTicket(0);
    c.describeTicket(1);
    c.describeTicket(3); // Will not print anything, since 3 is currently out of bounds. 
  }
}
