#!/bin/bash

# Double Hill Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    clear
    
    while [[ "$I" -le "$N" ]]; do
        
        X=$((N - I)) # Max to min
        
        J=$((I * 2))
        
        while [[ "$X" -gt "0" ]]; do
            printf "   "
            ((X--))
        done
        
        while [[ "$J" -ge "0" ]]; do
            printf  " * "
            ((J--))
        done
        
        X=$(((N - I) * 2)) # Max to min
        
        while [[ "$X" -gt "0" ]]; do
            printf "   "
            ((X--))
        done
        
        J=$((I * 2))
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