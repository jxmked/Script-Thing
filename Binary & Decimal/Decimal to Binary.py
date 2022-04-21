#!/usr/bin/env python3

from sys import path
from math import pow

path.append(".")

from xUserInterface import xUserInterface as xui

class Decimal2Binary(xui):
    
    base = 2 #Base Number
    
    #System Variables
    isFloat = False
    
    def __init__(self):
        """
        This code is just to reverse engineer 
        the decimal number by using a table
        
        Link below is a tutorial to convert decimal to binary
        using subtraction method.
        
        Reference Video: https://youtu.be/rsxT4FfRBaM
        """
        
        """
        I recreate this thing just to add support to a decimal
        with decimal places like: 245.75, 4983.82.
        """
        pass
    
    def start(self):
        if self.isFloat:
            print("""
            To avoid the decimal separator, multiply 
            the decimal number with  the base raised 
            to the power of decimals
            in result: """, end="")
            
            sDec = str(self.decimal)
            toCalc = int(sDec[0:sDec.index("."):]) #Remove Decimal Places
            
            raised = self.getRaised() #decimal, power
            
            primary = xui.getBinary(self.createTable(toCalc))
            
            res = self.calculate(raised["decimal"]) #Table
            
            print("{} x {}^({}) = {}".format(self.decimal, self.base, raised["power"], raised["decimal"]))
            print(" " * 35, "\'-RapidTables.com\'")
            
            xui.output(res)
            
            res = xui.getBinary(res)
            
            primary = res[0:len(primary)]
            secondary = res[len(primary):]
            
            print("\n = {} / {}^({})".format(res, self.base, raised["power"]))
            print(" = Binary: {}.{}\n - Decimal: {}\n".format(primary, secondary, self.decimal))
            
            """
            Even though I figured it out (probably) how RapidTables does it, 
            it’s still a bit hard for me to explain about it. Hahaha
            """
            
            return True
        
        # *-*-*-*-*-*-*-*-*-*-*-*-*-*
        
        print("")
        
        res = self.calculate(self.decimal)
        xui.output(res)
        
        binary = xui.getBinary(res)
        decimal = xui.getDecimal(res)
        
        print("\n = Binary: {}\n - Decimal: {}\n".format(binary, decimal))
        
        return True
    
    def calculate(self, decimal):
        table = self.createTable(decimal)
        
        sub = decimal #Subtracted Value
        
        while True:
            try:
                res = self.getCloseLess(sub, table) #Decimal, Index
                table[res["index"]]["binary"] = "1"
                sub -= res["decimal"]
            except Exception:
                break
            
        return table
    
    def createTable(self, decimal):
        table = []
        power = 1
        while True:
            #Output must be even numbers
            if power > decimal and len(table) % 2 == 0:
                break
            
            table.append({
                "binary" : "0",
                "decimal" : power
            })
            
            power *= self.base
        
        table.reverse()
        return table
    
    def getRaised(self):
        for i in range(1, 9):
            res = self.decimal * pow(self.base, i)
            if xui.isInt(res) or i == 8:
                return { 
                    "decimal" : round(res),
                    "power" : i 
                }
    
    def getCloseLess(self, decimal, table):
        tlen = len(table)
        
        if decimal == 1:
            return { "decimal" : 1, "index" : tlen - 1 }
        
        for i in range(0, tlen - 1):
            if decimal >= table[i]["decimal"]:
                return {
                    "decimal" : table[i]["decimal"],
                    "index" : i
                }
            
        
        raise Exception("Decimal value is out of range!")
    
    def getUserInput(self, x=False):
        #Strictly Equal - StackOverflow
        if x == False and type(x) == type(False):
            x = super().getInput("Decimal: ", self.validator, "Decimal sabe!")
        else:
            print("Decimal: {}".format(x))
        self.isFloat = xui.isFloat(x)
        
        if self.isFloat:
            self.decimal = float(x)
        else:
            self.decimal = int(x)
            
        self.start()
        
    
    def validator(self, param):
        #Accepts int and float numbers
        try:
            if xui.isFloat(param) or xui.isInt(int(param)):
                return True
            
        except ValueError:
            pass
        
        return False
    

obj = Decimal2Binary()

while True:
    obj.getUserInput()
    print("")