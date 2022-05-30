# Compile & Run C Language using Termux.

> This folder contains a script that allow Termux user to
> compile and run a script written in C language in an
> easy way (or shortcut).

### How to use?

```bash x-clang.sh %script.c% [-e[-b]]```

 ___Required ```clang``` package to be installed___

Parameters
- %script.c% = filename of script to run, Directory to the script to run.
- [-b] = [optional] Prevent clearing the terminal before executing the script.
> Note: If the script you wish to run has clear method on its
> starting line ```-b``` won't be effective.
- [-e] = [optional] Ignore warnings cause of ```clang -Weverything```.
- [-c] = [optional] Compile only.

> Note: Optional cannot combine or take extra space like
```bash
bash x-clang.sh -eb filename.c
bash x-clang.sh -e -b filename.c
```
> The script is written in a common way. [I actually don't know what to say =)]

### Package & Funtion has been used.

- clang
- mv
- chmod
- rm


****Enjoy****

#### Develop by Jovan De Guia

## Socials

- [Github](https://github.com/jxmked)
- [Facebook](https://www.facebook.com/deguia25)

### License under MIT License