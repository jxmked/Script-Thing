#!/usr/bin/env python3

"""
Increasing Triangle Pattern
"""

from sys import path

path.append("../.")


from ConsoleNumInput import inInt


#### Begin ####

n = inInt().getInput(5)

# Method 1
print("Method 1")

for x in range(n): 
    
    for y in range(x + 1):
        print(" * ", end="")
    
    print("")


print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")

for x in range(n):
    
    print(" * " * (x + 1))




print("")
"""
Author: Jovan De Guia
Github Username: jxmked
"""