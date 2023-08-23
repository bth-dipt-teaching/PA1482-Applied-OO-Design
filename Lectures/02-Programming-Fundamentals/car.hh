#ifndef CAR_H
#define CAR_H
#include <string>

class Car {
public:
  Car(std::string theLicensePlate, std::string theColour);

  std::string toString(void);

private:
  std::string myPlate;
  std::string myColour;

};
#endif
