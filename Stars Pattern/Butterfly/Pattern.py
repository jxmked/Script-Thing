#!/usr/bin/env python3

"""
Butterfly Pattern
"""

from sys import path

path.append("../.")


from ConsoleNumInput import inInt


#### Begin ####

n = inInt().getInput(5)

# Method 1
print("Method 1")

# Upper Part 
for x in range(1, n): 
    for y in range(x):
        print(" * ", end="")
            
    for y in range(((n * 2) - (x * 2)) - 1):
        print("   ", end="")
    
    for y in range(x):
        print(" * ", end="")
    
    print("")

# Middle Part
for x in range((n * 2) - 1):
    print(" * ", end="")

print("")

# Lower Part. Printed in Reverse
for x in range(n - 1, -1, -1): 
    for y in range(x):
        print(" * ", end="")
            
    for y in range(((n * 2) - (x * 2)) - 1):
        print("   ", end="")
    
    for y in range(x):
        print(" * ", end="")
    
    print("")


print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2

print("Method 2")

for x in range(1, n):
    
    print(" * " * x, end="")
    print("   " * ((n * 2) - (x * 2) - 1), end="")
    print(" * " * x)

print(" * " * ((n * 2) - 1))

for x in range(n - 1, -1, - 1):
    
    print(" * " * x, end="")
    print("   " * ((n * 2) - (x * 2) - 1), end="")
    print(" * " * x)


print("")
"""
Author: Jovan De Guia
Github Username: jxmked
"""