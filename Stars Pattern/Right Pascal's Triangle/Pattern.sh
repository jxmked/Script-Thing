#!/bin/bash

# Right Pascal's Triangle Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    clear
    
    while [[ "$I" -le "$((N * 2))" ]]; do
        
        J=$I
        
        if [[ "$I" -ge "$N" ]]; then
            J=$((((N * 2) - I))) # Max to min
        fi
        
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