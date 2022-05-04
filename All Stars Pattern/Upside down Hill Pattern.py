
"""
Upside Down Hill Pattern
"""
print("")


n = 5

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