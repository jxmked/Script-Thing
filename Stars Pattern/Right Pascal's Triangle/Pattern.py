#!/usr/bin/env python3

"""
Right Pascal's Triangle Pattern
"""

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

for x in range(n): 
    for y in range(x + 1, n):
        print("   ", end="")
        
    for y in range(x + 1):
        print(" * ", end="")
    
    print("")

for x in range(n - 1):
    
    for y in range(x + 1):
        print("   ", end="")
        
    for y in range(x + 1, n):
        print(" * ", end="")
    
    print("")

print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")

for x in range(n):
    print("   " * (n - (x + 1)), end="")
    print(" * " * (x + 1))


for x in range(n - 1):
    print("   " * (x + 1), end="")
    print(" * " * (n - x - 1))


print("")
"""
Author: Jovan De Guia
Github Username: jxmked
"""