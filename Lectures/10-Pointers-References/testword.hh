#include <iostream>
#include "word.hh"

using namespace std;

void testWord(void) {
  cout << "Testing Word..." << endl;
  Word first = Word("first",1);
  Word* second = new Word();
  Word* third = new Word("third", 1);

  // This works, but is not preferred
  Word fourth("fourth", 1);


  // Make use of the other constructors to "upgrade" a string and a char*
  Word fifth = "fifth";
  Word sixth = string("sixth");
  Word seventh = 10;  // Upgrade an int... to Word(10), which calls Word("",10)



  // Careful! This does not do what you expect (it actually declares a new function)
  Word ninety_nine();
  Word ninety_eight; // This is what you wanted to do
  Word ninety_seven = Word(); // or this, which is the same thing
  cout << "Done Testing Word..." << endl;
}
