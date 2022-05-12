#!/bin/bash

# Right Sided Decreasing Triangle Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    clear
    
    while [[ "$I" -le "$N" ]]; do
        
        J=$((N - I)) # Max to min
        
        X=$((N - J))
        
        while [[ "$X" -gt 0 ]]; do
            printf "   "
            ((X--))
        done
        
        while [[ "$J" -ge "0" ]]; do
            printf  " * "
            ((J--))
        done
        
        ((I++))
        echo ""
    done
    
    getInput 0
    N=$?
done

# # # # # # # # # # # # # # #
#  Written by Jovan De Guia #
#  Github Username: jxmked  #
# # # # # # # # # # # # # # #