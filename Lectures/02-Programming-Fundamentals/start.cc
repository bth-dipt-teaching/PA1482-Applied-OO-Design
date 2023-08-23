#include "car.hh"
#include <iostream>

using namespace std;


int main(void) {
  Car* c = new Car("aaa111", "red");

  cout << c->toString() << endl;
}
