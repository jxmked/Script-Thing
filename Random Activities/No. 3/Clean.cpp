#include <iostream>
#include <ctime>

using namespace std;

int qLen = 0;
struct Questions {
    string question;
    string choices;
    string answer;
    int wPoint; // Winning Point
};

struct Questions qs[50];
int life = 5;
int tScore = 0;

int getRandom(int num);
void askQuestions(void);
bool compare(string ans, string cAns);
void addQuestion(string a, string b, string c, int d);

int main(void){
    
    addQuestion(
        "Which month comes next ?", 
        "August, September, October, November, ______",
        "december",
        133
    );
    
    addQuestion(
        "Which month would you expect to be coldest?", 
        "null",
        "december",
        135
    );
    
    addQuestion(
        "How many months begin with the letter 'J'?",
        "null",
        "3",
        128
    );
    
    addQuestion(
        "Which of the below option is an odd number?",
        "A. 1\nB. 4\nC. 12\nD. 22",
        "a",
        118
    );
    
    addQuestion(
        "3/4 is an example of which of these?",
        "A. Decimal\nB. Fraction\nC. Odd Number\nD. Rational Number",
        "b",
        131
    );
    
    addQuestion(
        "The planet closest to the sun is ... ?",
        "null",
        "mercury",
        126
    );
    
    addQuestion(
        "Which of the world's oceans is the largest?",
        "A. Atlantic\nB. Pacific\nC. Indian\nD. Southern",
        "b",
        139
    );
    
    addQuestion(
        "The Earth has a crust, a mantle, and what else?",
        "A. Basin\nB. Sink\nC. Range\nD. Core",
        "d",
        137
    );
    
    addQuestion(
        "Which of these words means \"to set up\"?",
        "A. Correct\nB. Establish\nC. Dissemble\nD. Articulate",
        "b",
        148
    );
    
    addQuestion(
        "When written as a percent, 4/5 is which of these?",
        "A. 5%\nB. 45%\nC. 80%\nD. 55%",
        "c",
        141
    );
    
    addQuestion(
        "Which one of these characters is not friends with Harry Potter?",
        "A. Ron Weasley\nB. Neville Longbottom\nC. Draco Malfoy\nD. Hermione Granger",
        "b",
        121
    );
    
    addQuestion(
        "How many colors in the Rainbow?",
        "A. 1\nB. 5\nC. 7\nD. 9",
        "c",
        100
    );
    
    addQuestion(
        "What term is used for sweet dishes in English?",
        "A. Savory\nB. Sour\nC. Dessert",
        "c",
        123
    );
    
    addQuestion(
        "What does independence mean?",
        "A. Permission\nB. Freedom\nC. Goodwill",
        "b",
        99
    );
    
    askQuestions();
    
    return 0;
}

void askQuestions(void){
    struct Questions q; // Current Question Variable
    int count = 0; // Count correct guesses
    int rdm = -1, trdm; //Current question Index. Temp question Index
    string ans; // Your Answer in Current Question
    
    srand(time(0)); // Set Current Timestamp as Seed
    
    while(life != 0) {
        // Prevent reasking the current question 
        do {
            trdm = getRandom(qLen);
        } while(rdm != -1 && trdm == rdm);
        
        rdm = trdm;
        q = qs[rdm];
        
        cout << q.question << endl;
        
        if(! compare(q.choices, "null")) {
            cout << q.choices << "\n" << flush;
        }
        
        cout << "\nYour Answer: " << flush;
        
        cin >> ans;
        
        cout << "\n\n";
        
        if(compare(ans, q.answer)){
            // Correct
            
            cout << "Your answer is correct ! \n";
            
            tScore = (tScore + q.wPoint);
            
            cout << "+" << q.wPoint << " points" << endl;
            cout << "New score: " << tScore << endl;
            cout << "Your remaining life : " << life << endl;
            
            count++;
        } else {
            // Incorrect
            
            cout << "Sorry, your answer is wrong!" << endl;
            cout << "-1 life \n\n";
            life--;
            cout << "Your remaining life : " << life << endl;
            cout << "Your score: " << tScore << endl;
        }
        
        cout << "••••••••••••••••••••••••••••••••••••••••••••\n\n\n" << endl;	
        
    }
    
    cout << "You Ended Your Life. :(" << endl;
    cout << "Your Total Score: " << tScore << endl;
    cout << "You guesses " << count << " correct answer." << endl; 
    
}

void addQuestion(string a, string b, string c, int d){
    qs[qLen].question = a;
    qs[qLen].choices = b;
    qs[qLen].answer = c;
    
    qs[qLen].wPoint = d;
    
    qLen = qLen + 1;
}

int getRandom(int num){
    if (num < 2) {
        return 0;
    }
    
    return rand() % num;
}

bool compare(string ans, string cAns) {
    // Transform to LowerCases
    transform(ans.begin(), ans.end(), ans.begin(), ::tolower);
    transform(cAns.begin(), cAns.end(), cAns.begin(), ::tolower);
    
    return (ans.compare(cAns) == 0);
}
