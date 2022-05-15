#!/bin/bash

# Reverse Hill Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    clear
    
    A=1
    while [[ "$A" -lt "$N" ]]; do
        
        B=1
        while [[ "$B" -lt "$A" ]]; do
            printf "   "
            ((B++))
        done
        
        B=0
        C=$((((N - A) * 2) - 1))
        while [[ "$B" -lt "$C" ]]; do
            printf " * "
            ((B++))
        done
        
        echo ""
        ((A++))
    done
    
    getInput 0
    N=$?
    
done

# # # # # # # # # # # # # # #
#  Written by Jovan De Guia #
#  Github Username: jxmked  #
# # # # # # # # # # # # # # #