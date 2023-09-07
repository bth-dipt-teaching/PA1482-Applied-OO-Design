#include <vector>
#include <iostream>
using namespace std;
#include "ticket.hh"
#include "studentticket.hh"

int main(void) {
  vector<Ticket*> tick;
  tick.push_back(new Ticket());
  tick.push_back(new StudentTicket());

  for (auto t : tick) { cout << t->findBestSeat() << endl; }    
  for (auto t : tick) { cout << t->toString() << endl; }
}
