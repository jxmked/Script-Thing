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
            raise Error("")
            
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

sub = n
for x in range(1, n - 1): 
    
    if not sub <= 0:
        for y in range(x - 1):
            print("   ", end="")
    
    for y in range(0, sub):
        print(" * ", end="")
    
    sub -= 2
    
    if not sub <= 0 or x == n - 2:
        print()
    
sub = 1
for x in range(1, n - 2):
    sub += 2
    
   # if not sub >= n:
    #    for y in range(x + 1, n - 3):
      #      print(" b ", end="")
    
    for y in range(sub):
        print(" * ", end="")
    
    print()

print("\n*~*~*~*~*~*~*~*~*~*~*~*\n")


# Method 2
print("Method 2")


print("")
"""
Author: Jovan De Guia
Github Username: jxmked
"""