#!/usr/bin/env python3

from sys import path

path.append(".")

from __ConsoleInput import ConsoleInput
from __Timer import Timer

# Heap Sort

arr = []

def printArr(arr):
    for i in arr:
        print(i, end=" ")
    print()

# Sorting Algorithm
def Heapify(arr, a, b):
    c = b
    l = 2 * b + 1
    r = 2 * b + 2
    
    if l < a and arr[c] < arr[l]:
        c = l
    
    if r < a and arr[c] < arr[r]:
        c = r
    
    if c == b:
        return
    
    print(arr, end="\n\n")
    
    arr[b], arr[c] = arr[c], arr[b]
    
    Heapify(arr, a, c)
 
def SortingAlgo(arr):
    a = len(arr)
    
    for b in range(int(a / 2) - 1, -1, -1):
        Heapify(arr, a, b)
    
    for c in range(a - 1, 0, -1):
        arr[c], arr[0] = arr[0], arr[c]
        Heapify(arr, c, 0)
    
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
