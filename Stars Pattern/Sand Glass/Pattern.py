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

for x in range(0, (n * 2) + 1):
    r = x
    if x > n:
        r = (n - (x - n))
        
    for y in range(0, r):
        print("   ", end="")
    
    for y in range(0, ((n - r) * 2) + 1):
        print(" * ", end="")
    
    print("")
    

print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")

# Method 2
print("Method 2")

for x in range(0, (n * 2) + 1):
    r = x
    if x > n:
        r = (n - (x - n))
    
    print("   " * r, end="")
    print(" * " * (((n - r) * 2) + 1))
    

print("")
"""
Author: Jovan De Guia
Github Username: jxmked
"""