#include <stdio.h>
#include <stdlib.h>

// External File
#include "../ConsoleNumInput.c"

/**
 * Right Pascal's Triangle Pattern
 * */

static int loop(int n);


int main(void){
    // Default
    int n = 5;
    
    do {
        // From External File
        clrscr();
        
        loop(n);
        
        n = inInt();
        
        // This will never trigger. 
        // System required. Hahaha
        if(! n){
            return 0;
        }
    } while(1);
}

 int loop(int n){
    int i, j, r;
    
    /**
     * I just want to make the block of code smaller
     * 
     * */
    for(i = 0; i <= (n * 2); i++){
        
        r = i;
        
        if(i > n){
            r = ((n * 2) - i);
        }
        
        for(j = 0; j <= ((n - r) - 1); j++){
            printf("   ");
        }
        
        for(j = 0; j <= r; j++){
            printf(" * ");
        }
        
        printf("\n");
    }
    
    return 0;
}

/**
 * Written by Jovan De Guia
 * Github Username: jxmked
 * */
