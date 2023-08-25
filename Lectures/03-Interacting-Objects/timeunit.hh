#ifndef TIMEUNIT_HH
#define TIMEUNIT_HH
#include <string>

class TimeUnit {
public:
  TimeUnit() : TimeUnit(60) {};                         // It is allowed but mostly inadvisable
  TimeUnit(int theLimit) : TimeUnit(theLimit, "") {};   // to inline code in the class declaration.
  TimeUnit(int theLimit, const char* theUnit);
  bool update(void);
  std::string getDisplayValue(void);
private:
  int myLimit;
  int myValue;
  const char* myUnit; // Old-school form for a string.
};

#endif
