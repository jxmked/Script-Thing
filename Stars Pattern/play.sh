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
    
    while [ 1 ]; do
        echo "Enter a number to resize the output or"
        echo "enter [0, exit, quit] or use CTRL + C to exit"
        
        read -p "Input: " val
        
        exitMode $val
        
        val=$($val + 1)
        if [[ $val -gt $($MIN + 1) && $($MAX + 1) -gt $val ]]; then
            
            echo "Done"
            break
        fi
        echo
        echo "Input must be greater and less than or equal to ${MIN} and ${MAX}"
        
    done
    
    echo "Done"
}


getInput 0