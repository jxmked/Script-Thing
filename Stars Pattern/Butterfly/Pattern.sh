#!/bin/bash

# Butterfly Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    clear
    
    A=1
    while [[ "$A" -lt "$N" ]]; do
        
        B=0
        while [[ "$B" -lt "$A" ]]; do
            printf " * "
            ((B++))
        done
        
        B=0
        C=$((((N - A) * 2) - 1))
        while [[ "$B" -lt "$C" ]]; do
            printf "   "
            ((B++))
        done
        
        B=0
        while [[ "$B" -lt "$A" ]]; do
            printf " * "
            ((B++))
        done
        
        echo ""
        
        ((A++))
    done
    
    A=0
    while [[ "$A" -lt "$((N * 2 - 1))" ]]; do
        printf " * "
        ((A++))
    done
    
    echo ""
    
    A=$((N - 1))
    while [[ "$A" -gt "0" ]]; do
        
        B=0
        while [[ "$B" -lt "$A" ]]; do
            printf " * "
            ((B++))
        done
        
        B=0
        C=$((((N - A) * 2) - 1))
        while [[ "$B" -lt "$C" ]]; do
            printf "   "
            ((B++))
        done
        
        B=0
        while [[ "$B" -lt "$A" ]]; do
            printf " * "
            ((B++))
        done
        
        echo ""
        
        ((A--))
    done
    
    getInput 0
    N=$?
    
done

# # # # # # # # # # # # # # #
#  Written by Jovan De Guia #
#  Github Username: jxmked  #
# # # # # # # # # # # # # # #