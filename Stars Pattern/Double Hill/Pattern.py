#!/usr/bin/env python3

"""
Double Hill Pattern
"""

from sys import path

path.append("../.")


from ConsoleNumInput import inInt


#### Begin ####

n = inInt().getInput(5)

# Method 1
print("Method 1")

for a in range(n): 
    
    for b in range(a, n):
        print("   ", end="")
    
    for c in range(a + 1):
        print(" * ", end="")
    
    for d in range(a):
        print(" * ", end="")
    
    for x in range(a, n - 1):
        print("   ", end="")
    
    for b in range(a, n):
        print("   ", end="")
    
    for c in range(a + 1):
        print(" * ", end="")
    
    for d in range(a):
        print(" * ", end="")
    
    print("")

print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")

for a in range(n):
    
    print("   " * (n - a), end="")
    
    print(" * " * (a + 1), end="")
    
    print(" * " * a, end="")
    
    print("   " * (n - a - 1), end="")
    
    print("   " * (n - a), end="")
    
    print(" * " * (a + 1), end="")
    
    print(" * " * a)


print("")

"""
Author: Jovan De Guia
Github Username: jxmked
"""