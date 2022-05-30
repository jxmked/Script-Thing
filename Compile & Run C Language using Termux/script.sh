#!/bin/bash

EXECUTABLE_DIR="/data/data/com.termux/files/usr"

FNAME=$1

# Compiled filename
# Default output of Compiler.
# Do not change.
OUTPUT="a.out" 

if [[ ! $1 ]]; then
    echo "x-clang %filename% [-e[-c[-d]]]"
    echo "-d = Prevent clearing the terminal by default"
    echo "-c = Compile only. This mode will print warnings if possible"
    echo "-e = Compile without displaying warnings. Only errors will triggered"
    echo "-r = Execute current a.out file in current directory"
    exit 0
fi


# =)
function onError(){
    echo ""
    echo "Unable to Execute!"
    echo ""
    exit 1
}

function Execute(){
    echo "Preparing..."

    # Moving it into executable directory
    cp $OUTPUT "${EXECUTABLE_DIR}/" || { onError 1; }

    #Change permission to executable
    chmod +x "${EXECUTABLE_DIR}/${OUTPUT}" || { onError 1; }


    echo "Executing..."

    # Clear screen first before executing.
    # Just to add focus on the current program
    if [[ ! $2 == '-d' ]]; then
        clear
    fi

    # Execute
    "${EXECUTABLE_DIR}/./${OUTPUT}"

    echo ""
    echo ""

    # Remove the file when we're done!
    rm "${EXECUTABLE_DIR}/${OUTPUT}" || {
        echo "Something Went Wrong."
        exit 1;
    }
    
    exit 0
}

if [[ "$1" == '-r' ]]; then
    Execute 1
fi


# Compile before...
echo "Compiling..."
echo " "

if [[ $2 == '-e' ]]; then
    clang "${FNAME[@]}" || { onError 1; }
else
    # Display all errors and warning and more...
    clang -Weverything "${FNAME[@]}" || { onError 1; }
fi

if [[ $2 == '-c' ]]; then
    echo ""
    echo "Compiled"
    exit 0
fi

Execute 1

# # # # # # # # # # # # # # #
#  Written by Jovan De Guia #
#  Github Username: jxmked  #
# # # # # # # # # # # # # # #