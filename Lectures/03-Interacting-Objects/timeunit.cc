#include <string>
using namespace std;

#include "timeunit.hh"

TimeUnit::TimeUnit(int theLimit, const char* theUnit) : myLimit(theLimit),myUnit(theUnit) {
  myValue = 0;
}

bool TimeUnit::update(void) {
  myValue = ++myValue % myLimit;
  return (0 == myValue);
}

string TimeUnit::getDisplayValue(void) { // There is the c function sprintf() which we could use similarly to what
  if (myValue<10) {                      // we did for java, but it is more of a bother.
    return string("0")+std::to_string(myValue);
  } else {
    return std::to_string(myValue);
  }
}
