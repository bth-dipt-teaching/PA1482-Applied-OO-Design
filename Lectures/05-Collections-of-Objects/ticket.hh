#ifndef TICKET_HH
#define TICKET_HH
#include <string>


class Ticket {
public:
  Ticket(void) : Ticket("-- not specified -- ", "-- not specified --") {}
  Ticket(std::string theName, std::string theTime) : movieName(theName),showTime(theTime) {}
  std::string toString(void) { 
    return "Ticket for " + movieName + " at " + showTime;
  }
private:
  std::string movieName;
  std::string showTime;
};

#endif
