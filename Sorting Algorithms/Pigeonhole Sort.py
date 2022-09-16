#!/usr/bin/env python3

from __ConsoleInput import ConsoleInput
from __Timer import Timer
from __helpers import *

# Pigeonhole Sort

arr = []

# Sorting Algorithm
def SortingAlgo(arr):
    a = min(arr)
    b = max(arr)
    
    c = (b - a) + 1
    
    d = [0] * c
    for e in arr:
        d[e - a] = d[e - a] + 1
    
    f = 0
    for g in range(c):
        while d[g] > 0:
            d[g] = d[g] - 1
            arr[f] = g + a
            f = f + 1
        
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
