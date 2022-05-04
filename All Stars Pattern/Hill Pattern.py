
"""
Hill Pattern
"""
print("")


n = 5

# Method 1
print("Method 1")

for a in range(n): 
    
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
    
    print(" * " * a)


print("")

"""
Author: Jovan De Guia
Github Username: jxmked
"""