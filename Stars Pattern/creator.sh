#!/bin/bash

# Hill Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    clear
    
    M=$((N * 2))
    
    while [[ "$I" -le "$M" ]]; do
        
        J=$((N - I)) # Max to min
        
        if [[ "$N" -lt "$I" ]]; then
            J=$((I - N))
        fi
        
        S=$((N - J))
        while [[ "$S" -ge "0" ]]; do
            printf  " * "
            ((S--))
        done
        
        
        while [[ "$J" -gt "$N" ]]; do
            printf "   "
            ((J++))
        done        
        
        S=$((N - J))
        while [[ "$S" -gt "0" ]]; do
            printf  " * "
            ((S--))
        done
        
        ((I++))
        echo ""
    done
    
   # getInput 0
   # N=$?
   exit 0
done

# # # # # # # # # # # # # # #
#  Written by Jovan De Guia #
#  Github Username: jxmked  #
# # # # # # # # # # # # # # #