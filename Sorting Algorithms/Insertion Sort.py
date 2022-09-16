#!/usr/bin/env python3

from __ConsoleInput import ConsoleInput
from __Timer import Timer
from __helpers import *

# Insertion Sort

arr = []

# Sorting Algorithm
def SortingAlgo(arr):
    for a in range(1, len(arr)):
        
        k = arr[a]
        b = a - 1
        
        while b >= 0 and k < arr[b]:
            arr[b + 1] = arr[b]
            b = b - 1
        
        arr[b + 1] = k
        print(arr,end="\n\n")
        
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
