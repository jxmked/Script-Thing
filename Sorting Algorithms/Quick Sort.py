#!/usr/bin/env python3

from __ConsoleInput import ConsoleInput
from __Timer import Timer
from __helpers import *

# Quick Sort

arr = []

# Sorting Algorithm
def SortingAlgo(arr, low, high):
    if low >= high:
        return
    
    a = low - 1
    
    for b in range(low, high):
        if arr[b] <= arr[high]:
            a = a + 1
            arr[a], arr[b] = arr[b], arr[a]
    
    arr[a + 1], arr[high] = arr[high], arr[a + 1]
    
    print(arr, end="\n\n")
    
    SortingAlgo(arr, low, a)
    
    SortingAlgo(arr, a + 2, high)
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
    
    SortingAlgo(arr, 0, len(arr) - 1)
    
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
