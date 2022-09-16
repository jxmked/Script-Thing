#!/usr/bin/env python3

from __ConsoleInput import ConsoleInput
from __Timer import Timer
from __helpers import *

# Merge Sort

arr = []

# Sorting Algorithm
def SortingAlgo(arr):
    if len(arr) == 1:
        return
    
    mid = int(len(arr) / 2)
    
    r = arr[mid:]
    l = arr[:mid]
    
    SortingAlgo(r)
    SortingAlgo(l)
    
    a = 0
    b = 0
    c = 0
    
    while a < len(l) and b < len(r):
        if l[a] < r[b]:
            arr[c] = l[a]
            a = a + 1
        else:
            arr[c] = r[b]
            b = b + 1
        
        c = c + 1
    
    while a < len(l):
        arr[c] = l[a]
        a = a + 1
        c = c + 1
            
    while b < len(r):
        arr[c] = r[b]
        b = b + 1
        c = c + 1
        
    # I did not know where to put this thing
    # or what I need to create to perfectly
    # visualize this sorting algorithm
    print(l, r, end="\n\n")
    
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
