#!/usr/bin/env python3

from __ConsoleInput import ConsoleInput
from __Timer import Timer
from __helpers import *

# Shell Sort

arr = []

# Sorting Algorithm
def SortingAlgo(arr):
    a = len(arr)
    b = a // 2
     
     
    while b > 0:
        c = b
        
        while c < a:
            d = c - b
             
            while d >= 0:
                if arr[d + b] > arr[d]:
                    break
                
                arr[d + b], arr[d] = arr[d], arr[d + b]
                d = d - b
            c = c + 1
            
            print(arr, end="\n\n")
        
        # print(arr, end="\n\n")
        
        b = b // 2
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
