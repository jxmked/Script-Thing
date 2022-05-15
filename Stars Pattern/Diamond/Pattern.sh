#!/bin/bash

# Diamond Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    clear
    
    while [[ "$I" -le "$((N * 2))" ]]; do
        
        X=$((N - I)) # Max to min
        
        J=$((I * 2))
        
        if [[ "$I" -gt "$N" ]]; then
            X=$(((I - N)))
            J=$(((N - (I - N)) * 2))
        fi
        
        while [[ "$X" -gt "0" ]]; do
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