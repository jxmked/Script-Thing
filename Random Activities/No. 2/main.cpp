#include <iostream>

using namespace std;

struct Units {
    string unit;
    float measure;
};

int Unit_Len = 0;
struct Units Defined_Units[50];

void addUnit(string unit, float measure) {
    // Add new unit with value
    
    Defined_Units[Unit_Len].unit = unit;
    Defined_Units[Unit_Len].measure = measure;
    
    // Increase The Length of Global Defined Struct Unit
    Unit_Len = Unit_Len + 1;
}

int main() {
    // From Google
    // Equivalent to 1 Meter
    addUnit("Foot", 3.28084);
    addUnit("Inches", 39.3701);
    addUnit("Centimeter", 100);
    addUnit("Kilometer", 0.0001);
    addUnit("Millimeter", 1000);
    addUnit("Mile", 0.000621371);
    addUnit("Yard", 1.09361);
    addUnit("Nautical Mile", 0.000539957);
    
    float base = 1;
    int i;
    
    struct Units obj;
    
    while (1) {
        cout << "Enter in Meter: " << flush;
        cin >> base;
        cout << "\n\n" << flush;
        
        for(i = 0; i < Unit_Len; ++i){
            obj = Defined_Units[i];
            
            cout << "Meter in " << flush;
            // Print Unit
            cout << obj.unit << flush;
            
            cout << "\n: " << flush;
            
            // Convert & Print. Base * Measure
            cout << (base * obj.measure) << flush;
            
            cout << "\n\n" << flush;
        }
        
        cout << "\n\n" << flush;
    }
    
    return 0;
}
