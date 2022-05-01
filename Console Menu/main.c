#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*Global Variables*/
static const int SIZE = 5; //Min:1, Max: 511
static int USED = 0; //System Variable

/** 
 * It should be
 * static int ARR[SIZE] = {};
 * */
static int ARR[512] = {0}; //System Database

/*Declare Functions*/
int mainMenu(void);
int Arithmetic(void);
int Arrays(void);
int Recursion(void); /**/
int Strings(void);

/*Helpers*/
static int Message(char str[512]);
static int displayMenu(char arr[512][128], int len);
static int Confirm(char str[64]);
static int inInt(void);
static int inStr(char *str[128]);
static void array_print(int arr[512], int len);

/**
 * Found on StackOverflow but modify slightly
 * */
#define CLEAR(x) memset(x,'\0',sizeof(x))

/** Subtitute Function **/
static void clrscr(){
    system("clear");
} 

int main() {
    clrscr();
    
    printf("Welcome User!\n");
    
    printf("\nThe current max size of Database Array is %d\n", SIZE);
    /*Some Notes or Messages here */
    
    if (!Confirm("Do You Want to Continue?")) {
        printf("Goodbye!\n");
        return 0;
    }
    
    while (mainMenu());
    
    clrscr();
    
    printf("Thanks for using our program!");
    
    return 0;
}

int mainMenu(void) {
    char menu[512][128] = {
        "Arithmetic",
        "Array",
        "Recursion",
        "String",
        "End the program"
    };
    int action;
    
    clrscr();
    
    printf("Welcome! Choose a program to run.\n");
    
    Message("");
    
    action = displayMenu(menu, 5);
    
    if (action == 1)
        while (Arithmetic());
        
    if (action == 2)
        while (Arrays());
        
    if (action == 3)
        while (Recursion());
        
    if (action == 4)
        Strings();
        
    if (action == 5)
        return 0; //Stop Execution
        
    return 1;
}

static void getTwoInputs(int *x, int *y) {
    printf("Enter first number: ");
    *x = inInt();
    
    printf("Enter second number: ");
    *y = inInt();
}

int Arithmetic(void) {
    int x, y;
    char menu[512][128] = {
        "Add two Numbers", 
        "Subtract two Numbers", 
        "Multiply two Numbers", 
        "Divide two Numbers", 
        "Get the Area of Rectangle", 
        "Back"
    };
    
    clrscr();
    
    printf("Welcome to Arithmetic World\n");
    
    switch (displayMenu(menu, 6)) {
        case 1:
            clrscr();
            
            printf("Add two Numbers\n");
            
            do {
                getTwoInputs(&x, &y);
                printf("%d + %d = %d", x, y, x + y);
            } while (Confirm("\nDo You want to add two numbers again?"));
            break;
            
        case 2:
            clrscr();
            
            printf("Subtract two numbers\n");
            
            do {
                getTwoInputs(&x, &y);
                printf("%d - %d = %d", x, y, x - y);
            } while (Confirm("\nDo you want to subtract two numbrrs again?"));
            break;
            
        case 3:
            clrscr();
            
            printf("Multiply two numbers\n");
            
            do {
                getTwoInputs(&x, &y);
                printf("%d × %d = %d", x, y, x * y);
            } while (Confirm("\nDo you want to multiply two numbers again?"));
            break;
            
        case 4:
            clrscr();
            
            printf("Divide two numbers\n");
            
            do {
                getTwoInputs(&x, &y);
                printf("%d ÷ %d = %d", x, y, x / y);
            } while (Confirm("\nDo you want to divide two numbers again?"));
            break;
            
        case 5:
            clrscr();
            
            printf("Get the Area of a Rectangle\n");
            
            do {
                printf("Enter the height of a rectangle: ");
                x = inInt();
                printf("Enter the width of a rectangle: ");
                y = inInt();
                
                printf("The Area of a rectangle is %d", x * y);
            } while (Confirm("\nDo you want to calculate again?"));
            break;
            
        case 6:
            return 0;
    }
        
    return 1;
}

/* Array Part*/
static void array_print(int arr[512], int len) {
    for (int i = 0; i < len; i++) {
        printf("\n%d -> %d", i + 1, arr[i]);
    }
}

static int array_push(int num) {
    if (USED > SIZE)
        return 0;
        
    ARR[USED] = num;
    USED = USED + 1;
    
    return 1;
}

static void array_sort(int arr[], int len) {
    //Bubble sort
    int i = 0, j = 0, tmp;
    for (i = 0; i < len; i++) {
        for (j = 0; j < (len - i) - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}

static void array_reverse(int arr[], int len) {
    int num, i;
    for (i = 0; i <= (len / 2) - 1; i++) {
        num = arr[i];
        arr[i] = arr[(len - i) - 1];
        arr[(len - i) - 1] = num;
    }
}

static int Arrays_One() {   //Array Add
    
    int i, newLen, tmpArr[256] = {0}, err = 0;
    char strRes[4096], str[4096], tmpStr[4096];
    
    clrscr();
    
    if (0 >= SIZE - USED) {
        Message("Out of memory!\n\n");
        return 0;
    }
    
    printf("Add New Value\n");
    
    Message("");
    
    printf("\nEnter the length of new value you wish to add.");
    printf("Enter 0 to cancel. Max number is %d.\n", SIZE - USED);
    
    printf("Number: ");
    
    newLen = inInt(); 
    
    if (newLen > SIZE - USED) {
        Message("That number may overflow the array");
        clrscr();
        return 1;
    }
    
    if (newLen <= 0) {
        return 0;
    }
    
    clrscr();
    
    printf("Enter a number you wish to add then enter.\n");
    
    for (i = 0; i < newLen; i++) {
        printf("No. %d - Number:", i + 1);
        tmpArr[i] = inInt();
    }
    
    clrscr();
    
    for (i = 0; i < newLen; i++) {
        if (!array_push(tmpArr[i]))
            err = 1;
            
        if (i < newLen - 1) {
            sprintf(strRes, "%s%d, ", strRes, tmpArr[i]);
        } else {
            sprintf(strRes, "%s%d", strRes, tmpArr[i]);
        }
    }
    
    if (err) {
        sprintf(str, "Some data has not been stored. Data entered: %s\n", strRes);
    } else {
        sprintf(str, "Newly added value: %s\n", strRes);
    }
    
    sprintf(strRes, "%s", "");
    
    if (SIZE - USED < 1) {
        sprintf(tmpStr, "\n%s\nYou used %d out of %d capacity.", str, USED, SIZE);
        sprintf(tmpStr, "%s", "Delete or Edit some data\n");
        Message(tmpStr);
        
        return 0;
    }
    
    sprintf(str, "%sYou only have %d out of %d left space!\n", str, SIZE - USED, SIZE);
    
    Message(str);
    
    return 1;
}

static int Arrays_Two() { //Edit Array
    
    int num, newVal, tmp;
    char str[512];
    
    clrscr();
    
    if (USED <= 0) {
        Message("\nNothing to edit\n\n");
        return 0;
    }
    
    printf("Edit value from array.\n");
    
    Message("");
    
    array_print(ARR, USED);
    
    printf("\nWhich index you wish to edit?.\nEnter 0 to cancel.\nNumber: ");
    
    num = inInt();
    tmp = ARR[num - 1];
    
    if (num <= 0) {
        return 0;
    }
    
    if (num > USED) {
        Message("Out of index!");
        return 1;
    }
    
    do {
        clrscr();
        printf("Selected index: %d. Selected value: %d.", num, tmp);
        Message("");
        
        printf("\nEnter new value for given index.\nNumber: ");
        newVal = inInt();
        
        sprintf(str, "\n%d is same as before!\n", newVal);
        Message(str);
    } while (newVal == tmp);
    
    Message("+clear"); //Empty Message.
    
    sprintf(str, "Are you sure to replace %d with %d from index?", tmp, newVal);
    
    if ( ! Confirm(str)) {
        Message("\nTransaction declined!\n");
        return 1;
    }
    
    clrscr();
    
    // Transaction
    ARR[num - 1] = newVal;
    
    CLEAR(str);
    
    sprintf(str, "%s\n%d has been replaced with %d from index %d",str, tmp, newVal, num);
    sprintf(str, "\n%sArray database has been change.\n", str);
    
    Message(str);
    
    return 1;
}

static int Arrays_Three() { //Delete Value from Array
    int num, targetNum, i;
    char str[128];
    
    clrscr();
    
    if (USED <= 0) {
        Message("\nNothing to delete.\n\n");
        return 0;
    }
    
    printf("Delete value from array.\n");
    
    Message("");
    
    array_print(ARR, USED);
    
    printf("\nWhich index you wish to delete?\nEnter 0 to cancel.\nNumber: ");
    
    num = inInt();
    
    if (num <= 0) {
        return 0;
    }
    
    if (num > USED) {
        Message("Out of index!");
        return 1;
    }
    
    clrscr();
    
    targetNum = ARR[num - 1];
    
    sprintf(str, "Are you sure to delete index %d and its value %d?", num, targetNum);
    if (!Confirm(str)) {
        Message("\nTransaction cancelled!\n");
        return 1;
    }
    
    if (num == SIZE) {
        ARR[num - 1] = 0;
    } else {
        for (i = num; i < USED; i++) {
            ARR[i - 1] = ARR[i];
        }
    }
    
    USED = USED - 1;
    
    clrscr();
    
    sprintf(str, "Value %d has been deleted!\n", targetNum);
    
    Message(str);
    
    array_print(ARR, USED);
    
    return 1;
}

static int Arrays_Four() { // Array Print
    int tmp[512], i, action;
    char menu[512][128] = {
        "Print in Reverse",
        "Sort and Print",
        "Save changes to database",
        "Back"
    };
    
    clrscr();
    
    if (USED <= 0) {
        Message("\nNothing to print\n\n");
        return 0;
    }
    
    for (i = 0; i < USED; i++) {
        tmp[i] = ARR[i];
    }
    
    while (1) {
        clrscr();
        
        printf("Array print\n");
        
        array_print(tmp, USED);
        
        printf("\n");
        
        action = displayMenu(menu, 4);
        
        switch(action){
            case 1:
                array_reverse(tmp, USED);
                break;
                
            case 2:
                array_sort(tmp, USED);
                break;
                
            case 3:
                if (Confirm("Are you sure to save changes to database?")) {
                    for (i = 0; i < USED; i++) {
                        ARR[i] = tmp[i];
                    }
                    
                    return 0;
                }
                break;
                
            case 4:
                return 0;
                
        }
    }
}

int Arrays(void) {
    int action;
    char menu[512][128] = {
        "Add",
        "Edit",
        "Delete",
        "Print",
        "Back"
    };
    
    
    clrscr();
    
    printf("Welcome to Array World\n");
    
    if (Message(""))
        printf("\n");
        
    printf("%d out of %d capacity has been used!\n", USED, SIZE);
        
    action = displayMenu(menu, 5);
        
    // This is better than switch
    if (action == 1)
        while (Arrays_One()); //Add
        
    if (action == 2)
        while (Arrays_Two()); //Edit
        
    if (action == 3)
        while (Arrays_Three()); //Delete
            
    if (action == 4)
        while (Arrays_Four()); //Print
            
    if (action == 5)
        return 0; //To Main menu
    
    return 1;
}

/*End Array Part*/
/*Recursion Part*/
static long int Recursion_Factor(int num) {
    if (num <= 1)
        return num;
    
    return num * Recursion_Factor(num - 1);
}

static long int Recursion_Fibonacci(int num) {
    if (num <= 1)
        return num;
        
    return Recursion_Fibonacci(num - 1) + Recursion_Fibonacci(num - 2);
}

int Recursion(void) {
    int num;
    char menu[512][128] = {
        "Find Factors of a Number",
        "Find the nth term of Fibonacci",
        "Back"
    };
    
    clrscr();
    
    printf("Welcome to Recursion World\n");
    
    switch (displayMenu(menu, 3)) {
        case 1:
            clrscr();
            
            printf("Find factors of a number\n");
            
            do {
                printf("Enter a number to find its factors.\nEnter 0 to back: ");
                
                num = inInt();
                
                if (num <= 1)
                    break;
                
                printf("Factor: %ld\n", Recursion_Factor(num));
            } while (1);
            break;
            
        case 2:
            clrscr();
            
            printf("Find the nth term of Fibonacci\n");
            
            do {
                printf("Enter a number to find its sequence in Fibonacci.");
                printf("\nEnter 0 to back: ");
                
                num = inInt();
                
                if (num <= 1)
                    break;
                    
                printf("Fibonacci Sequence: %ld\n", Recursion_Fibonacci(num));
            } while (1);
            break;
            
        case 3:
            return 0;
    }
    
    return 1;
}

/*End Recursion part*/
/*String part*/

int Strings(void) {
    int action, itmp;
    char strA[128], strB[128], boolStr[8];
    char *tmp;
    
    char menu[512][128] = {
        "Re-enter first string",
        "Compare with another string",
        "Back"
    };
    
    //Some compiler trigger an error when printing strlen with size_t type of value.
    while (1) {
        clrscr();
        
        printf("Welcome to String World!\n");
        printf("Enter a string that would not exceeded to 128 characters.");
        printf("\nEnter 0 to cancel.");
        printf("String: ");
        
        inStr(&tmp);
        
        sprintf(strA, "%s", tmp);
        
        if(!strcmp(strA, "0")) {
            return 0;
        }
        
        itmp = (int) strlen(strA);
        
        printf("String A length: %d\n\n", itmp);
        
        while (1) {
            action = displayMenu(menu, 3);
            
            if (action == 1)
                break;
            
            if (action == 2) {
                clrscr();
                
                itmp = (int) strlen(strA);
                
                printf("Welcome to String World!\n");
                printf("Enter a string that would not exceeded to 128 characters.");
                printf("\nString: ");
                printf("%s\nString A length: %d\n\n", strA, itmp);
                
                printf("Enter second string to compare with.\nString: ");
                
                inStr(&tmp);
                
                sprintf(strB, "%s", tmp);
                
                itmp = (int) strlen(strB);
                
                printf("String B length: %d\n\n", itmp);
                
                if (strcmp(strA, strB)){
                    sprintf(boolStr, "%s", "False");
                } else {
                    sprintf(boolStr, "%s", "True");
                } 
                
                printf("Is same with another string? : %s\n\n", boolStr);
            }
            
            if (action == 3) {
                if(Confirm("Do you want to cancel this transaction?")){
                    return 0;
                }
                
                clrscr();
                    
                itmp = (int) strlen(strA);
                
                printf("Welcome to String World!\n");
                printf("Enter a string that would not exceeded to 128 characters.");
                printf("\nString: ");
                printf("%s\nString A length: %d\n\n", strA, itmp);
                
                continue;
            } 
        }
    }
}

/** Helpers **/
static int Message(char str[512]) {
    static char MESS[2048];
    static int num = 0;
    
    if (!strcmp(str, "+clear")) {
        CLEAR(MESS);
        num = 0;
        return 1;
    }
    
    if (num && strcmp(MESS, "")) {
        printf("%s", MESS);
        sprintf(MESS, "%s", "");
        num = 0;
        return 1;
    }
    
    num = 1;
    sprintf(MESS, "%s", str);
    return 0;
}

static int displayMenu(char menus[512][128], int len) {
    char border[64] = "*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*";
    int num, i;
    char *err;
    char str[4];
    
    printf("%s\n", border);
    
    for (i = 0; i < len; i++) {
        printf("%d: %s\n", i + 1, menus[i]);
    }
    
    printf("%s\n", border);
    
    // Check if an input is valid
    // If not, re-enter
    do {
        if (strcmp(str, ""))
            printf("Select a number from given list: ");
        else
            printf("Which program you wish to run: ");
        
        scanf(" %3s", str);
        num = (int) strtol(str, &err, 10);
        
    } while(!(*err == 0 && (num > 0 && num <= len)));
    
    return num;
}

static int inInt() {
    int num;
    char str[8];
    char *err;
    
    do {
        scanf(" %7s", str);
        num = (int) strtol(str, &err, 10);
    } while (*err);
    
    return num;
}

static int inStr(char *str[128]) {
    char tmp[128];
    
    scanf(" %[^\n]%*c", tmp);
    
    *str = tmp;
    
    return 1;
}

static int Confirm(char str[64]) {
    char ans;
    
    printf("\n%s [Y/N]: ", str);
    
    while (1) {
        
        scanf(" %1c", &ans);
        
        if (ans == 'y' || ans == 'Y')
            return 1;
        
        if (ans == 'n' || ans == 'N')
            return 0;
    }
}

/**
 * Author: Jovan De Guia
 * Github Username: jxmked
 * 
 * License Under MIT License
 * 
 * ~ Console Menu - Written in C Language ~
 * */
