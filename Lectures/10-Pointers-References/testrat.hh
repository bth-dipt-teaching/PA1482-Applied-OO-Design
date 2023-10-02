#include "rat.hh"

void testRat(void) {
  cout << "----------Assignment----------" << endl;
  Rat r("Manny", Gender::male);
  Rat a,b;
  cout << a << endl; // Tests operator<<() as well;
  a=r;
  b=a=r; // This is the reason why we return a reference to *this in operator=;

  cout << a << " and " << r << endl;

  cout << "----------Equals----------" << endl;
  Rat imitator("Manny", Gender::male);
  if (imitator == r) {
    cout << imitator << " and " << r << " are the same" << endl;
  } else {
    cout << imitator << " and " << r << " are NOT the same" << endl;      
  }

  Rat imitator2("Mary", Gender::other);
  if (imitator2 == r) {
    cout << imitator2 << " and " << r << " are the same" << endl;
  } else {
    cout << imitator2 << " and " << r << " are NOT the same" << endl;      
  }

  cout << "----------Multiplication----------" << endl;
  Rat fr("Mimmi", Gender::female);
  Rat* litter = r*fr;
  if (0 != litter) { cout << "First rat in mischief is " << litter[0] << endl; }
}
