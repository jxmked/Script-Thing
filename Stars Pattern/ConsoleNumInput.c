#include <stdio.h>
#include <stdlib.h>

// Declare the header
#ifndef ININT_H
#define ININT_H

static int inInt(void);

#endif

//Function to execute

static int exitMode(char *str);

/**
 * This is design for specific feature
 * 
 * Feature:
 * - Check if the input is string or integer
 * - exit when the input value is "Exit" or "Quit"
 * 
 * */
 
static int inInt(void) {
    int num;
    char str[8];
    char *err;
    
    int min = 3, max = 99;
    
    printf("\n\n\n");
    
    
    printf("Enter a number to resize the output or enter [0, exit, quit] to exit");
    
    do {
        printf("\nNumber: ");
        
        scanf(" %7s", str);
        
        exitMode(str);
        
        num = (int) strtol(str, &err, 10);
        
        if(! *err){
            if(num >= min && max >= num){
                return num;
            }
            printf("\nValue must be greater than or equal to %d or lessthan or equal to %d", min, max);
        }
        
    } while (1);
} 

static int exitMode(char *str){
    // Exit keywords.
    char *kw[3] = {"exit", "quit", "0"};
    int i, len = 3;
    
    for(i = len; i > 0; i--){
        if(! strcmp(kw[i - 1], str)){
            exit(0);
        }
    }
    
    return 0;
}

static void clrscr(void){
    system("clear");
}
/**
 * Written by Jovan De Guia
 * Github Username: jxmked
 * */
