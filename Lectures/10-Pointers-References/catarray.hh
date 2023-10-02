#include <iostream>
using namespace std;

#include "cat.hh"
#include "dog.hh"

void testCatarray() {
  cout << "Testing array delete" << endl;

  Dog* d = new Dog();
  delete d;

  Dog* myDogs = new Dog[5];
  // delete myDogs; // This only tries to delete the first of the five dog objects. 
                    // NOT any memory allocated by these objects.

  Dog* myDogs2 = new Dog[5];
  delete [] myDogs2;
  // This first calls delete on every object in the array
  // Then it deletes the array itself.

  cout << "Done Testing array delete" << endl;
}
