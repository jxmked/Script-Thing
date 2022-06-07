#!/usr/bin/env python3

from sys import path

path.append(".")

from __ConsoleInput import ConsoleInput
from __Timer import Timer

# Cocktail Sort

arr = []

def printArr(arr):
    for i in arr:
        print(i, end=" ")
    print()


# Sorting Algorithm
def SortingAlgo(arr):
    a = 0
    b = len(arr) - 1
    c = True
    while c:
        c = False
        
        for d in range(a, b):
            if (arr[d] > arr[d + 1]):
                arr[d], arr[d + 1] = arr[d + 1], arr[d]
                
                print(arr, end="\n\n")
                
                c = True
                
        if not c:
            break
        
        c = False
        
        b = b - 1
        
        for e in range(b - 1, a - 1, -1):
            if (arr[e] > arr[e + 1]):
                arr[e], arr[e + 1] = arr[e + 1], arr[e]
                
                print(arr, end=" - \n\n")
                
                c = True
        
        a = a + 1
    
# End Sorting Algorithm

obj = ConsoleInput({
    "length" : 10,
    "min" : 1,
    "max" : 10,
    "is_unique" : True
})


t = Timer()


while True:
    
    arr = obj.Generate()
    
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
