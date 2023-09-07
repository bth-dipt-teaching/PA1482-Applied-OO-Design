import java.util.ArrayList;
public class Start {
  public static void main(String [] args) {
    ArrayList<Ticket> tick = new ArrayList<>();
    tick.add(new Ticket());
    tick.add(new StudentTicket());

    for(Ticket t : tick) { System.out.println(t.findBestSeat()); }
  }
}