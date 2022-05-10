#!/bin/bash

# Butterfly Pattern

. ConsoleNumInput.sh

N=5

while [ 1 ]; do
    I=0
    
    while [[ "$I" -lt "$N" ]]; do
        
        
        ((I++))
    done
    
    getInput 0
    N=$?
done