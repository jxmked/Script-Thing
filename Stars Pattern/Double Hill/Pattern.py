#!/usr/bin/env python3

"""
Double Hill Pattern
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