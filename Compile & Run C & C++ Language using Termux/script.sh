#!/bin/bash

# Execute C and C++ 

EXECUTABLE_DIR="/data/data/com.termux/files/usr"
EXECUTABLE_FOLDER="x-clang"


BNAME=$(basename -- "${1}") # Basename (main.cpP)
EXT="${BNAME##*.}" # Extension (cpP)
EXT="${EXT,,}" # Lower Case (cpp)
FNAME="${BNAME%.*}" # Filename (main)


# Compiled filename
# Default output of Compiler.
# Do not change.
OUTPUT="a.out"

# Generate Random Name. We will use it to run multiple
# Binary at the same time.
BINFNAME=$(echo $RANDOM | base64 | head -c 20)
BINFNAME="${BINFNAME}.out"

F="${EXECUTABLE_DIR}/${EXECUTABLE_FOLDER}"
    
if [[ ! $1 ]]; then
    echo "x-clang %filename% [-e[-c[-d]]]"
    echo "-d = Prevent clearing the terminal"
    echo "-c = Compile only. This things also display warnings if possie"
    echo "-r = Execute current a.out file or the given filename in current directory"
    echo "-clear = Will clear left over binary file"
    exit 0
fi


# =)
function onError(){
    echo ""
    echo "Unable to Execute!"
    echo ""
    exit 1
}

function createDir(){
    # Create if when not exists
    if [[ ! -d "${1}" ]]; then
        mkdir "${1}"
    fi
}
function _Copy(){
    echo "Preparing..."
    
    createDir $F
    
    # Moving it into executable directory
    cp "${1}" "${F}/${BINFNAME}" || { onError 1; }
    
    # Change permission to executable
    chmod +x "${F}/${BINFNAME}" || { onError 1; }
    
}
function Execute(){
    # Clear screen first before executing.
    # Just to add focus on the current program
    if [[ ! $2 == '-d' ]]; then
        clear
    fi
    
    # Execute
    "${F}/./${BINFNAME}" || {
        
        echo "${F}/${BINFNAME}"
        echo ""
        echo "Binary file deleted in tmp folder"
    }
    
    # Remove the file when we're done!
    # Binary file will not remove if `ctrl + c` has been triggered
    rm "${F}/${BINFNAME}" || {
        echo "Something Went Wrong."
        exit 1;
    }
    
    exit 0
}

if [[ "$1" == '-clear' ]]; then
    
    F="${EXECUTABLE_DIR}/${EXECUTABLE_FOLDER}"
    echo "Clearing..."
    cd $F
    A=$(ls | wc -l) # Files count
    rm -r $F
    echo "${A} file(s) has been cleared."
    
    exit 0
fi

# If we have a.out file. Just run it.
if [[ "$1" == '-r' ]]; then
    if [[ "$2" ]]; then
        _Copy "${2}"
    else
        _Copy "${OUTPUT}"
    fi
    
    Execute 1
fi


# Compile before...
echo "Compiling..."
echo " "

if [[ $EXT == 'cpp' ]]; then
    g++ -W -Wall -std=c++11 "${BNAME[@]}" || onError 1;
    
   # g++ -std=c++11 "${BNAME[@]}" || { onError 1; }
else
    gcc -std=c99 -pedantic "${BNAME[@]}" || onError 1;
    # clang -Weverything "${BNAME[@]}" || { onError 1; }
fi

if [[ $2 == '-c' ]]; then
    echo ""
    echo "Compiled"
    exit 0
fi

_Copy "${OUTPUT}"
Execute 1

# # # # # # # # # # # # # # #
#  Written by Jovan De Guia #
#  Github Username: jxmked  #
# # # # # # # # # # # # # # #
