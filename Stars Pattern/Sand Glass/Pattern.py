#!/usr/bin/env python3

"""
Sand Glass Pattern
"""

# Must be an Odd Integer
num = 5

try:
    try:
        from sys import argv
        
        tmp = int(argv[1])
        
        if tmp % 2 == 0 or tmp <= 3:
            raise Exception("")
            
        num = tmp
    except IndexError:
        pass
except:
    print("Must be an Odd Integer\n")
    
print("")

#### Begin ####

n = num

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