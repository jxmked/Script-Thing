#include <stdio.h>
#include <stdlib.h>

// External File
#include "../ConsoleNumInput.c"

/**
 * Sand Glass Pattern
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
    int i, j, r;
    /**
     * I just recreate this and know what to do.
     * But it python code it is looks like a messy code. Hahaha
     * 
     * */
    for(i = 0; i < (n * 2); i++){
        
        r = i;
        
        if( i > n){
            r = ((n * 2) - i) - 1;
        }
        
        for(j = 0; j < r; j++){
            printf("   ");
        }
        
        for(j = 0; j < ((n * 2) - (r * 2)) - 1; j++){
            printf(" * ");
        }
        
        if( i != n - 1){
            printf("\n");
        }
    }
    
    return 0;
}

/**
 * Written by Jovan De Guia
 * Github Username: jxmked
 * */
