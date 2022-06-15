# Compile & Run C/C++ Language using Termux.

> This folder contains a script that allow Termux user to
> compile and run a script written in C/C++ language in an
> easy way (or shortcut).

### How to use?

```bash x-clang.sh %script.c% [-e[-b]]```

 ___Required ```clang``` & ```gcc``` package to be installed___

Parameters
- "-d = Prevent clearing the terminal"
- "-c = Compile only. This things also display warnings if possie"
- "-r = Execute current a.out file or the given filename in current directory"
- "-clear = Will clear left over binary file from temp directory"

```bash
$ bash script.sh myscript.c # Compile and Run C Language
$ bash script.sh myscript.cpp # Compile and Run C++ Language
$ bash script.sh myscript.c -c # Compile C Language Only
$ bash script.sh myscript.cpp -c # Compile C++ Language Only
$ bash script.sh myscript.c # Compile, clear the screen and run C Language
$ bash script.sh myscript.cpp # Compile, clear the screen and Run C++ Language
$ bash script.sh -r # Run the a.out binary file from current directory
$ bash script.sh -r %binaryfile% # Run the custom named binary file
```

> The script is written in a common way. [I actually don't know what to say =)]

### Package & Funtion has been used.

- clang
- g++
- gcc
- mv
- chmod
- rm
- cp
- clear
- exit


----

****Enjoy****
#### Written by Jovan De Guia

## Socials

- [Github](https://github.com/jxmked)
- [Facebook](https://www.facebook.com/deguia25)
- [Buy me some Coffee](https://www.buymeacoffee.com/jxmked)

### License under MIT License