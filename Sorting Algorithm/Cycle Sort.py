#!/usr/bin/env python3

from sys import path

path.append(".")

from __ConsoleInput import ConsoleInput
from __Timer import Timer

# Cycle Sort

arr = []

def printArr(arr):
    for i in arr:
        print(i, end=" ")
    print()


# Sorting Algorithm
def SortingAlgo(arr):
    a = len(arr)
    
    for b in range(0, a - 1):
        c = arr[b]
        
        d = b
        for e in range(b + 1, a):
            if arr[e] < c:
                d = d + 1
        
        if d == b:
            continue
        
        while c == arr[d]:
            d = d + 1
        
        arr[d], c = c, arr[d]
        
        while d != b:
            
            d = b
            for f in range(b + 1, a):
                if arr[f] < c:
                    d = d + 1
            
            while c == arr[d]:
                d = d + 1
                
            arr[d], c = c, arr[d]
            
            print(arr, end="\n\n")
        
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
