#include "ticket.hh"

int main(void) {
  Ticket *tst = new Ticket[2];

  Ticket **myTickets = new Ticket*[5];
  myTickets[0] = new Ticket("Spartacus", "tonight");
  myTickets[2] = new Ticket("Ben Hur", "tomorrow");
  myTickets[4] = new Ticket("Also Spartacus", "tomorrow");

  myTickets[0]->toString();
}
