#!/usr/bin/env python3

from sys import path

path.append(".")

from ConsoleInput import ConsoleInput as CI
from Timer import Timer

# Selection Sort

arr = []

def printArr(arr):
    for i in arr:
        print(i, end=" ")
    print()

# Sorting Algorithm
def SortingAlgo(arr):
    for a in range(len(arr)):
        tmp = a
        
        for b in range(a + 1, len(arr)):
            if arr[tmp] > arr[b]:
                tmp = b
            
        
        print(arr,end="\n\n")
        
        # Swap
        arr[a], arr[tmp] = arr[tmp], arr[a]
        
# End Sorting Algorithm

obj = CI({
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
