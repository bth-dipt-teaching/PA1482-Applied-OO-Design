#ifndef RAT_HH
#define RAT_HH

#include <iostream>
#include <string>
using namespace std;

enum Gender {female=1, male=2, other=3, unspecified=99};

class Rat {
public:
  // Good practice to always include default constructor, copy constructor, and destructor
  Rat();
  Rat(Rat& original);
  virtual ~Rat();  // virtual so that sub-classes' destructors will also be called

  Rat(string name, Gender gender);

  // Some overloaded operators
  // The return type can often be anything we want but some make more sense than others.
  Rat& operator=(const Rat& other);
  bool operator==(const Rat& other) const;
  Rat* operator*(const Rat& other) const;

  friend ostream& operator<<(ostream& os, const Rat& theRat); 
  // Yet another weird C++ quirk: friends can access the internals of a class
  // In this case, it is needed to get the << operator to work since the first
  // parameter is of another type than the class itself.
private:
  string name;
  Gender gender;
};

#endif
