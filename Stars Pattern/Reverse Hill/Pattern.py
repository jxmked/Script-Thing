#!/usr/bin/env python3

"""
Reverse Hill Pattern
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

for a in range(n): 
    
    for b in range(a):
        print("   ", end="")
    
    for c in range(a, n):
        print(" * ", end="")
    
    for d in range(a + 1, n):
        print(" * ", end="")
    
    print("")


print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")

for a in range(n):
    
    print("   " * a, end="")
    
    print(" * " * (n - a), end="")
    
    print(" * " * (n - a - 1))



print("")

"""
Author: Jovan De Guia
Github Username: jxmked
"""