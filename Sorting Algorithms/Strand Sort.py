#!/usr/bin/env python3

from __ConsoleInput import ConsoleInput
from __Timer import Timer
from __helpers import *

# Strand Sort

arr = []

# Sorting Algorithm
def SortingAlgo(arr):
    a = 0
    b = [arr.pop(0)]
    
    while a < len(arr):
        if arr[a] > b[-1]:
            b.append(arr.pop(a))
        else:
            a = a + 1
        
    
    while len(arr):
        c = 0
        d = [arr.pop(0)]
        
        while c < len(arr):
            if arr[c] > d[-1]:
                d.append(arr.pop(c))
            else:
                c = c + 1
        
        e = []
        
        while len(b) and len(d):
            if b[0] < d[0]:
                e.append(b.pop(0))
            else:
                e.append(d.pop(0))
        
        e = e + b # Concat
        c = e + d # Concat
        
        b = e
        print(b, end="\n\n")
    
    arr += b # Append to Original Array
    
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
