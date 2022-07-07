#include <stdio.h>
#include <stdlib.h>

// External File
#include "../ConsoleNumInput.c"

/**
 * Butterfly Pattern
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

static int loop(int n){
    int i, j;
    
    for(i = 0; i < n; i++){
        for(j = 0; j < (i + 1); j++){
            printf(" * ");
        }
        
        for(j = (i * 2); j < ((n * 2) - 1); j++){
            printf("   ");
        }
        
        for(j = 0; j < (i + 1); j++){
            printf(" * ");
        }
        
        printf("\n");
    }
    
    for(i = 0; i < ((n * 2) + 1); i++){
        printf(" * ");
    }
    
    printf("\n");
    
    for(i = n - 1; i >= 0; i--){
        for(j = 0; j < (i + 1); j++){
            printf(" * ");
        }
        
        for(j = (i * 2); j < ((n * 2) - 1); j++){
            printf("   ");
        }
        
        for(j = 0; j < (i + 1); j++){
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
