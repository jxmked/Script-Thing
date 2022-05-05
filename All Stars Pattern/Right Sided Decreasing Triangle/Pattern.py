#!/usr/bin/env python3

"""
Right Sided Decreasing Triangle Pattern
"""
print("")


n = 5

# Method 1
print("Method 1")

for x in range(n): 
    
    for y in range(x + 1):
        print("   ", end="")
        
    for z in range(x, n):
        print(" * ", end="")
    
    print("")


print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")

for x in range(n):
    
    print("   " * (x + 1), end="")
    
    print(" * " * (n - x))



print("")

"""
Author: Jovan De Guia
Github Username: jxmked
"""