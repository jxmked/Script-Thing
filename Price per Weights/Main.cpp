#include <iostream>

using namespace std;

class __Weights {
    public: 
        string unit;
        string acr;
        float base;
};

string __units[50];

int _len = 0;
__Weights units[50];
__Weights df; //Current Default weight.

float PRICE = 0; // Grams 
float WEIGHT = 0; // Grams
string _line_ = "-------------------------";

void clrscr(void);
void addUnit(string u, string k, float b);
void pressToContinue(void);
void getPriceInWeight(void);
void setDefaultBase(void);
float inFloat(string param);

int main(/** int argc, char **argv **/){
     
    /** The multiplier are based on grams conversation **/
    addUnit("Milligram", "mg", 0.001);
    addUnit("Centigram",  "cg", 0.01);
    addUnit("Decigram", "dg", 0.1);
    addUnit("Gram", "g", 1.0);
    addUnit("Decagram", "dag", 10.0);
    addUnit("Hectogram", "hg", 1e2);
    addUnit("Kilogram", "kg", 1e3);
    addUnit("Tonne", "t", 1e6);
    
    cout << "Price per Weight" << endl << endl;
    
    getPriceInWeight();
    cout << endl << _line_ << endl;
    setDefaultBase();
    
    cout << endl << "Your inputs has been defined." << endl
        << "Console will be cleared." << endl;
    
    pressToContinue();
    
    clrscr();
    
    float inp;
    
    cout << "Price and Weight in Grams: " << PRICE 
        << " | " << WEIGHT << endl << endl
        << "Enter 0 to exit" << endl << _line_ << endl;
    
    while (true) {
        cout << endl;
        
        inp = inFloat("Weight (" + df.acr + ")");
        
        if(inp == 0) {
            cout << endl << "Ended" << endl;
            exit(0);
        }
        
        printf("Price: %.5f\n", (inp * df.base) *  (PRICE / WEIGHT));
        
    }
    
    return 0;
}

void getPriceInWeight(void){
    string unit;
    float price = inFloat("Price per Weight");
    float weight = inFloat("Weight per price");
    
    do {
        cout << endl << "Unit [" << __units[0] << flush;
        for(int i = 1; i < _len; ++i){
            cout << ", " << __units[i] << flush;
        }
        cout << "]: " << flush;
        
        cin >> unit;
        
        // to Lowercase
        transform(unit.begin(), unit.end(), unit.begin(), ::tolower);
        
        // Check if exists in array
    }while(! (count(begin(__units), end(__units), unit) > 0));
    
    /** If the unit weight is not in grams.
     * Convert it **/
    
    for(int i = 0; i < _len; ++i){
        if(units[i].acr.compare(unit) == 0) {
            WEIGHT = weight * units[i].base;
            PRICE = price;
            break;
        }
    }
    
    cout << endl << _line_ << endl 
        << "Price and Weights in different Units" << endl << endl;
    
    /** Print the Weights and Price in different units **/
    for (int i = 0; i < _len; ++i){
        printf("%s (%s): %.5f\nPrice: %.5f\n\n", 
            units[i].unit.c_str(),
            units[i].acr.c_str(),
            WEIGHT / units[i].base,
            PRICE
        );
    }
    
    pressToContinue();
}

void setDefaultBase(void) {
    // Set default base for next entries of weight
    /**
     * Instead of asking what weight are the given input
     * ask once and change later when needed
     * */
    
    string unit;
    bool flag = false;
    
    do {
        cout << endl << "Set default unit for weights" << endl
            << "Unit [" << __units[0] << flush;
        for(int i = 1; i < _len; ++i){
            cout << ", " << __units[i] << flush;
        }
        cout << "]: " << flush;
        
        cin >> unit;
        
        // to Lowercase
        transform(unit.begin(), unit.end(), unit.begin(), ::tolower);
        
        for(int i = 0; i < _len; ++i){
            if(units[i].acr.compare(unit) == 0) {
                df = units[i];
                
                flag = true;
                
                break;
            }
        }
    } while (! flag);
}

/**
 * Helpers
 * */
void clrscr(void) {
    system("clear");
}

void addUnit(string u, string k, float b){
    units[_len].unit = u;
    units[_len].acr = k;
    units[_len].base = b;
    __units[_len] = k;
    _len++;
}

void pressToContinue(void){
    do{
        cout << endl << "Press enter to continue..." << flush;
    } while (cin.get() != '\n' || cin.get() != '\n');
}

float inFloat(string param){
    
    string str;
    bool flag;
    bool gotPoint;
    
    while(true){
        cout << param << " [Number]: " << flush;
        cin >> str;
        
        flag = false; // Is not a number?
        gotPoint = false; // Already reach decimal?
        
        for(char c : str) {
            if ( c == '.' && ! gotPoint){
                gotPoint = true;
            } else if(! isdigit(c)){
                flag = true;
                break;
            }
        }
        
        if(! flag) {
            return stof(str);
        }
    }
}

/**
 * Author: Jovan De Guia
 * Github Username: jxmked
 * 
 * License Under MIT License
 * 
 * ~ Price per Weight - Written in C++ Language ~
 * */
