#include <vector>
#include <iostream>
using namespace std;
#include "customer.hh"
#include "ticket.hh"

void Customer::addTicket(Ticket* theTicket) {
  myTickets.push_back(theTicket);
}

int Customer::countTickets(void) {
  return myTickets.size();
}

vector<Ticket*> Customer::getTickets() {
  return myTickets;
}

void Customer::describeTicket(int theTicketNumber) {
  if (0 <= theTicketNumber && myTickets.size() > theTicketNumber) {
    cout << myTickets[theTicketNumber]->toString() << endl;
  }
}
