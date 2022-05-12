#!/bin/bash

# Decreasing Triangle Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    clear
    
    while [[ "$I" -lt "$N" ]]; do
        J=$(((N - I) - 1)) # Max to min
        
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