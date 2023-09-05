#ifndef CUSTOMER_HH
#define CUSTOMER_HH
#include <vector>
#include "ticket.hh"

class Customer {
public:
  Customer(void) {};
  void addTicket(Ticket* theTicket);
  int countTickets();
  std::vector<Ticket*> getTickets(); // Same caution as before, this exposes your internal structure.
  void describeTicket(int theTicketNumber);
private:
  std::vector<Ticket*> myTickets;
};
#endif
