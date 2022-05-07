#!/usr/bin/env python3

"""
Sand Glass Pattern
"""

from sys import path

path.append("../.")


from ConsoleNumInput import inInt


#### Begin ####

n = inInt().getInput(5)

# Method 1
print("Method 1")

"""
I tried a lot of things but the solution that I found
is about spacing 🤦‍♂️

"""
for x in range(0, n):
    for p in range(0, x):
        print(" ", end="")
    
    for y in range(x, n):
        print("* ", end="")
    
    print()

for x in range(n - 2, -1, -1):
    for y in range(0, x):
        print(" ", end="")
    
    for y in range(x, n):
        print("* ", end="")
        
    print()

print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")

for x in range(0, n):
    print(" " * x, end="")
    print("* " * (n - x))
    

for x in range(n - 2, -1, -1):
    print(" " * x, end="")
    print("* " * (n - x))
    

print("")
"""
Author: Jovan De Guia
Github Username: jxmked
"""