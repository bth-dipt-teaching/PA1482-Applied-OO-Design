#ifndef TICKET_HH
#define TICKET_HH
#include <string>


class Ticket {
public:
  Ticket(void) : Ticket("-- not specified -- ", "-- not specified --") {}
  Ticket(std::string theName, std::string theTime) : movieName(theName),showTime(theTime) {}
	virtual int findBestSeat() { mySeat=0; return mySeat; }
  std::string toString(void) { 
    return "Ticket for " + movieName + " at " + showTime + " sitting in seat " + std::to_string(mySeat);
  }
protected:
	int mySeat;
private:
  std::string movieName;
  std::string showTime;
};

#endif
