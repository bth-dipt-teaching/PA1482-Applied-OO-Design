#include <string>
#include "car.hh"

using namespace std;

Car::Car(string theLicensePlate, string theColour) : myPlate(theLicensePlate), myColour(theColour) {
}

string Car::toString(void) {
  string s = "a " + this->myColour + " car with license plate " + myPlate;
  return s;
}
