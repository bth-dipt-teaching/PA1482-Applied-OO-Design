#pragma once     // A more modern way (but not standard) instead of the #ifndef below
#ifndef WORD_HH
#define WORD_HH
#include <string>
using namespace std;

class Word {
public:
  Word();
  Word(string theWord, int theOccurrences);
  Word(string theWord);
  Word(char* theWord);
  Word(int theOccurrences);

  void print(void);
private:
  string myWord;
  int myOccurrences;
};

#endif
