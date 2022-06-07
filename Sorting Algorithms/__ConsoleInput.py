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
        print("Type 'r' to rerun the last inputs")
        
        res = self.isRerun(1, 1000)
        
        if res == True:
            return
        
        self.len = res
        
        # Get the Minimum Integer
        print("\nMinimum Integer. Min 0 & Max 10,000")
        
        self.min = self.inInt(0, 10000)
        
        # Get the Maximum Integer
        print("\nGet the Maximum Integer. Min {} & Max 10,000".format(self.min + 2))
        
        self.max = self.inInt(self.min + 2, 10000)
        
        if self.len > (self.max - self.min) - 1:
            print("\nIf the length is Greater than Selection Range it will automatically generate duplicated integer")
            self.isUnique = False
            
            self.inStr("\nPress enter to continue.")
            
        else:
            # Get If Unique
            print("\nInteger Must Be Unique?")
            self.isUnique = self.Confirm("Is Unqiue?")
        
    def isRerun(self, n, x):
        while True:
            try:
                val = self.inStr("Number | Keyword: ")
                if val.lower() == 'r':
                    return True
                 
                val = int(val)
                if val >= n and val <= x:
                    return val
            except ValueError:
                pass
        
    
    def Generate(self):
        arr = []
        
        # Selection Array
        numArr = []
        for x in range(self.min, self.max + 1):
            numArr.append(x)
            
        for i in range(self.len):
            index = randint(0, len(numArr) - 1)
            
            if self.isUnique:
                arr.append(numArr.pop(index))
            else:
                arr.append(numArr[index])
        
        return arr
    
    def inStr(self, m):
        try:
            return input(m)
        except KeyboardInterrupt:
            print("\nProgram Terminated")
            exit(0)
        
    def inInt(self, n, x):
        while True:
            try:
                val = int(self.inStr("Number: "))
                
                if val >= n and val <= x:
                    return val
            except ValueError:
                pass
        
    def Confirm(self, m):
        while True:
            x = self.inStr("{} [Y/n]: ".format(m))
            
            if x == "y" or x == "Y":
                return True
            
            if x == "n" or x == "N":
                return False
            

"""
Author: Jovan De Guia
Github Username: jxmked
"""