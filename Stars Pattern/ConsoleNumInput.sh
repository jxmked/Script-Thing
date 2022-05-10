#!/bin/bash

## Designed for specific program
## Get input fron user

# list of keycode in string separated with spaces
KEYCODES="0 exit quit"

# Defaults
MIN=3
MAX=99
# ~*~*~*~*~

function exitMode(){
    for val in $KEYCODES; do
        if [[ "${val,,}" == "${1,,}" ]]; then
            echo
            echo "Ended"
            exit 0
        fi
    done
    
}

function getInput(){
    echo ""
    
    while [ 1 ]; do
        
        echo "Enter a number to resize the output or"
        echo "enter [0, exit, quit] or use CTRL + C to exit"
        
        read -p "Input: " ARG
        
        exitMode $ARG
        
        val=$((val + 1))
        
        if [[ "$ARG" -ge "$MIN" && "$MAX" -ge "$ARG" ]]; then
            return $ARG
        fi
        
        echo
        echo "Input must be greater and less than or equal to ${MIN} and ${MAX}"
        
    done
    
}
