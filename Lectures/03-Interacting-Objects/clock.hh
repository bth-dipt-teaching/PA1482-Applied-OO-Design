#ifndef CLOCK_HH
#define CLOCK_HH
#include "timeunit.hh"

class Clock {
public:
  Clock(void);
  void update(void);
  void display(void);    
private:
  TimeUnit* hours;    // The objects will be created in the constructor.
  TimeUnit* minutes;
  TimeUnit* seconds;
};
#endif
