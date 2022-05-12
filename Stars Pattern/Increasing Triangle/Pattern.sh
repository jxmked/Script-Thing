#!/bin/bash

# Increasing Triangle Pattern

. ../ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    while [[ "$I" -lt "$N" ]]; do
        J=0
        
        while [[ "$J" -le "$I" ]]; do
            printf  " * "
            ((J++))
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