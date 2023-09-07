#ifndef STUDENTTICKET_HH
#define STUDENTTICKET_HH

#include "ticket.hh"

class StudentTicket : public Ticket {
public:
  StudentTicket(void) : Ticket("no student movie", "no time") {}

  int findBestSeat(void) override { 
    int seat = Ticket::findBestSeat();
    mySeat = 10;
    return this->mySeat;
  }
};

#endif
