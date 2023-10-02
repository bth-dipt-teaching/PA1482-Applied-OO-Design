#ifndef CAT_HH
#define CAT_HH
#include <string>
#include <cstring>
using namespace std;

class Cat {
public:
  Cat();
  Cat(const char* theName, string* theColours);
  Cat(const Cat& original);

  void setName(const char* theName);

  string toString(void) const;
  string listColours(void) const;
private:
  void copyColours(const string* theColours);

  string* myColours = 0; // Give attributes a default value. 
  char* myName = 0;      // Otherwise, they get whatever junk value that happened to be in that memory location
};
#endif
