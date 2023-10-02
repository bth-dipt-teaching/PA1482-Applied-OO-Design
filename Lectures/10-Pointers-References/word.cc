#include <string>
#include <iostream>
#include "word.hh"

using namespace std;

Word::Word() : Word("",0) {};
Word::Word(string theWord) : Word(theWord,0) {};
Word::Word(char* theWord) : Word(string(theWord)) {};

Word::Word(string theWord, int theOccurrences) : myWord(theWord),myOccurrences(theOccurrences) {
  this->print(); // print() is a side-effect, so we should avoid this.
}

Word::Word(int theOccurrences) : Word("", theOccurrences) {};

void Word::print(void) {
  cout << "Word: " << myWord << " occurrences: " << myOccurrences << endl;
}
