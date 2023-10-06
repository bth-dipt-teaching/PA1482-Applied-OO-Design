#include <iostream>
#include <string>
#include <vector>
using namespace std;

#include <fstream>

void write(string filename) {
  ofstream out;
  out.open(filename);

  if (out.is_open()) {
    out << "You have already seen the ";
    out << "output stream" << " operator in action" << endl;
    out << "some" << endl << "more" << endl << "text" << endl;
    out.close();
  }
}

vector<string>* read(string filename) {
  ifstream in(filename);
  string line;
  vector<string>* result = new vector<string>();

  if (in.is_open()) {
    while ( getline(in, line) ) {
      result->push_back(line);
    }
    in.close();
  }

  return result;
}

int main(void) {
  write("tst-cpp.txt");
  auto result = read("tst-cpp.txt");

  for (auto line : *result) {
    cout << line << endl;
  }
}
