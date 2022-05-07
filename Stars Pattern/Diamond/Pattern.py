#!/usr/bin/env python3

"""
Diamond Pattern
"""

from sys import path

path.append("../.")


from ConsoleNumInput import inInt


#### Begin ####

n = inInt().getInput(5)

# Method 1
print("Method 1")

for a in range(n - 1): 
    
    for b in range(a, n):
        print("   ", end="")
    
    for c in range(a):
        print(" * ", end="")
    
    for d in range(a + 1):
        print(" * ", end="")
    
    print("")


for e in range(n):
    
    for f in range(e + 1):
        print("   ", end="")
    
    for g in range(e , n - 1):
        print(" * ", end="")
    
    for h in range(e, n):
        print(" * ", end="")
    
    print("")


print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")

for a in range(n - 1):
    
    print("   " * (n - a), end="")
    
    print(" * " * a, end="")
    
    print(" * " * (a + 1))


for b in range(n):
    
    print("   " * (b + 1), end="")
    
    print(" * " * (n - b - 1), end="")
    
    print(" * " * (n - b))
    
print("")

"""
Author: Jovan De Guia
Github Username: jxmked
"""