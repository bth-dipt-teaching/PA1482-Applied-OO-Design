#include <iostream>
using namespace std;

#include "cat.hh"

void testCat(void) {
  cout << "Testing cat" << endl;
  string colours[] = {"Red", "Orange", "White", ""};

  Cat* tabby = new Cat("Tabby", colours);
  cout << "Printing " << tabby->toString() << endl;

  Cat* copycat = tabby; // This just copies the pointer, no copy constructor is called.

  Cat bob = Cat("Bob", colours);
  Cat steve = bob;
  cout << "Printing Steve " << steve.toString() << endl;
  steve.setName("Steve");
  cout << "Printing Steve and Bob " << steve.toString() << bob.toString() << endl;

  steve = *tabby; // Get the object referred to by the pointer 'tabby', assign it to steve.
                  // We would hope that this had invoked a copy constructor.
                  // It doesn't, since we are not *creating* objects, merely re-assigning them.
  steve = Cat(*tabby); // Creates a new Cat object using the copy constructor, and assigns it to steve.

  colours[0] = "grey"; // We copy each colour, not just the array reference, so this will not have any effect.
  cout << "Printing Steve " << steve.toString() << endl;


  cout << "Done Testing cat" << endl;
}
