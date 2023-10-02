#include <string>
#include <cstring>
#include <iostream>
#include "cat.hh"
using namespace std;

Cat::Cat() { 
  string colours[] = {"grey", ""};
  Cat("youthere", colours);
}

Cat::Cat(const char* theName, string* theColours) {
  setName(theName);
  copyColours(theColours);
  cout << "Created " << toString() << endl;
}

Cat::Cat(const Cat& original) { // Could break up original and pass on to the other constructor  : Cat(original.myName, original.theColours)
  setName(original.myName);
  copyColours(original.myColours);
  cout << "Copy of " << original.toString() << endl;
}

void Cat::setName(const char* theName) {
  char* oldName = myName;
  myName = new char[strlen(theName+1)];
  strcpy(myName, theName);

  if (0 != oldName) {
    cout << oldName << " is now known as " << myName << endl;
  }
}

string Cat::toString(void) const {
  return string("a cat by the name ") + myName + " with the colours " + listColours();
}

string Cat::listColours(void) const {
  string out;
  int pos = 0;

  while ("" != myColours[pos]) {
    out += myColours[pos] + ", ";
    pos++;
  }

  return out;
}

void Cat::copyColours(const string* theColours) {
  int length=0;
  while ("" != theColours[length++]) {}
  myColours = new string[length];

  int pos=0;
  do {
    myColours[pos] = theColours[pos];
  } while ("" != theColours[pos++]); // Sometimes we want to do the loop check at the end: do {} while()
}
