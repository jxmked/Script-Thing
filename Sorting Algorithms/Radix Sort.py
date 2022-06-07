#!/usr/bin/env python3

from sys import path

path.append(".")

from __ConsoleInput import ConsoleInput
from __Timer import Timer

# Radix Sort

"""
There was a bug (I think) where max integer at
the beginning of an array
"""


arr = []

def printArr(arr):
    for i in arr:
        print(i, end=" ")
    print()


# Sorting Algorithm
def SortingAlgo(arr):
    a = max(arr)
    b = len(arr)
    
    c = 1
    
    d = [0] * b
    e = [0] * 10
    
    while a / c > 1:
        for f in range(0, b):
            e[(arr[f] // c) % 10] = e[(arr[f] // c) % 10] + 1
        
        for g in range(1, 10):
            e[g] = e[g] + e[g - 1]
        
        h = b - 1
        while h >= 0:
            d[e[(arr[h] // c) % 10] - 1] = arr[h]
            
            print(d, end="\n\n")
            
            e[(arr[h] // c) % 10] = e[(arr[h] // c) % 10] - 1
            h = h - 1
        
        for j in range(0, b):
            arr[j] = d[j]
        
        c = c * 10
    
    # Temporary fix
    if (arr[0] >= arr[b - 1]):
        arr.append(arr.pop(0))
    
# End Sorting Algorithm

obj = ConsoleInput({
    "length" : 10,
    "min" : 1,
    "max" : 10,
    "is_unique" : True
})


t = Timer()


while True:
    
    arr = obj.Generate() # Auto Bug. Hahaha
    
    # Perfectly fine. 
    # From https://www.geeksforgeeks.org/radix-sort/
    #arr = [170, 45, 75, 90, 802, 24, 2, 66]
    
    print("Array to Sort")
    
    printArr(arr)
    print("")
    
    t.start()
    
    SortingAlgo(arr)
    
    t.end()
    
    print("Sorted Array")
    
    
    printArr(arr)
    
    print("")
    t.printLapse("Sorting took")
    
    print("\n")
    print("-*" * 10, end="-\n\n")
    
    obj.getAttributes()
    
    print("\n" * 5)



"""
Author: Jovan De Guia
Github Username: jxmked
"""
