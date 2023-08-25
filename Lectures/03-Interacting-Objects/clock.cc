#include <iostream>
#include <string>
#include <chrono>
#include <thread>
using namespace std;


#include "clock.hh"
#include "timeunit.hh"

Clock::Clock(void) {
  hours = new TimeUnit(24, "h");    // If we remove the Clock object, these will be
  minutes = new TimeUnit(60, "m");  // floating around as allocated but unaddressable memory
  seconds = new TimeUnit(60, "s");  // In C++ we need a ~destructor() for our class.
}

void Clock::update(void) {
  if (seconds->update()) {   // Pointers, so arrow notation.
    if (minutes->update()) {
      hours->update();
    }
  }
}

void Clock::display(void) {
  cout << hours->getDisplayValue() << ":"
    << minutes->getDisplayValue() << "."
    << seconds->getDisplayValue() << endl;
}

int main(void) {
  Clock* theClock = new Clock();

  for (int i = 0; i < 10; i++) {
    theClock->update();
    theClock->display();

    this_thread::sleep_for(chrono::milliseconds(1000));
  }
}
