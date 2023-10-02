#include <iostream>
#include <string>
using namespace std;

#include "rat.hh"

Rat::Rat() : Rat("no-name", Gender::unspecified) {
};

Rat::Rat(Rat& original) {
  this->name = original.name;
  this->gender = original.gender;
}

Rat::~Rat() {
}

Rat::Rat(string name, Gender gender) {
  this->name = name;
  this->gender = gender;
}

Rat& Rat::operator=(const Rat& other) {
  this->name = other.name;
  this->gender = other.gender;
  cout << "Assignment: " << *this << endl;
  return *this;
}

bool Rat::operator==(const Rat& other) const {    
  cout << "Equals?: " << *this << " vs " << other << endl;
  return ((this->name == other.name) && 
          (this->gender == other.gender));
}

Rat* Rat::operator*(const Rat& other) const {
  if ((this->gender == male && other.gender == female) ||
      (this->gender == female && other.gender == male) ||
      (this->gender == unspecified || other.gender == unspecified)) {
    Rat* mischief = new Rat[5];
    return mischief;
  } else { 
    return 0;
  }
}

ostream& operator<<(ostream& os, const Rat& theRat) {
  string gender;
  switch (theRat.gender) { // friends can access private attributes
  case Gender::female:
    gender = "female";
    break;
  case Gender::male:
    gender = "male";
    break;
  case Gender::other:
    gender = "other";
    break;
  case Gender::unspecified:
  default:
    gender = "unspecified";
  }
  return os << "Rat of " << gender << " gender called " << theRat.name;
}
