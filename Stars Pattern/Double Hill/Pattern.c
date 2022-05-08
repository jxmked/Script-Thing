#include <stdio.h>
#include <stdlib.h>

// External File
#include "../ConsoleNumInput.c"

/**
 * Double Hill Pattern
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
    int i, j, k, l, m;
    
    for(i = 0; i < n; i++){
        l = 1;
        
        for(k = 0; k < 2; k++){
            
            if(k == 1)
                l = 2;
            
            for(m = 0; m < l; m++){
                for(j = (n - (i + 1)); j > 0; j--){
                    printf("   ");
                }
            }
            
            for(j = 0; j <= (i * 2); j++){
                printf(" * ");
            }
        }
        printf("\n");
    }
    
    return 0;
}

/**
 * Written by Jovan De Guia
 * Github Username: jxmked
 * */
