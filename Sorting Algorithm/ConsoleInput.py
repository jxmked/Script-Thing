#!/usr/bin/env python3

from random import randint

class ConsoleInput:
    
    # Takes
    # Length of array
    # Range. Min & Max Integer
    # Unique. Boolean
    
    def __init__(self, obj):
        self.len = obj["length"]
        self.min = obj["min"]
        self.max = obj["max"]
        self.isUnique = obj["is_unique"]
        
    def getAttributes(self):
        print("Create New Array\n")
        
        # Get the Length of an Array
        print("Length of an Array. Min 1 & Max 1,000")
        
        self.len = self.inInt(1, 1000)
        
        # Get the Minimum Integer
        print("\nMinimum Integer. Min 0 & Max 10,000")
        
        self.min = self.inInt(0, 10000)
        
        # Get the Maximum Integer
        print("\nGet the Maximum Integer. Min {} & Max 10,000".format(self.min + 2))
        
        self.max = self.inInt(self.min + 2, 10000)
        
        if self.len >= self.max - self.min:
            print("\nWith Length of {} and Selection Range of {} is automatically generate duplicated integer".format(self.len, self.max - self.min))
            self.isUnique = False
            
            try:
                input("\nPress enter to continue.")
            except KeyboardInterrupt:
                print("\nProgram Terminated")
                exit(0)
        else:
            # Get If Unique
            print("\nInteger Must Be Unique?")
            self.isUnique = self.Confirm("Is Unqiue?")
        
    
    def Generate(self):
        arr = []
        
        # Selection Array
        numArr = []
        for x in range(self.min, self.max):
            numArr.append(x)
            
        for i in range(self.len - 1):
            index = randint(0, len(numArr) - 1)
            arr.append(numArr[index])
            
            if self.isUnique:
                numArr.pop(index)
        
        return arr
    
    def inInt(self, n, x):
        while True:
            try:
                val = int(input("Number: "))
                
                if val >= n and val <= x:
                    return val
            except ValueError:
                pass
            except KeyboardInterrupt:
                print("\nProgram Terminated")
                exit(0)
        
    def Confirm(self, m):
        while True:
            try:
                x = input("{} [Y/n]: ".format(m))
                
                if x == "y" or x == "Y":
                    return True
                
                if x == "n" or x == "N":
                    return False
            except KeyboardInterrupt:
                print("\nProgram Terminated")
                exit(0)

"""
Author: Jovan De Guia
Github Username: jxmked
"""