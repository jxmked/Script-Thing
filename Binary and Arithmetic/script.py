#!/usr/bin/env python 3
import re

class BinaryArithmetic:
    number_a = 0
    number_b = 0
    arithmetic = ""
    
    def __init__(self):
        
        print("Sum, Subtract, Divide, Multiply two binary numbers")
        print()
        
        while True:
            self.getInputs()
            
            # Get Backup binary numbers
            # Eliminate extra '0' at first child
            a = int(self.number_a)
            b = int(self.number_b)
            
            self.bin_to_dec()
            self.get_arithmetic()
            res = self.do_calculate()
            
            print("\nResult: ")
            print(f"{a} {b} {self.number_b} = {res}\n")
    
    def getInputs(self):
        self.number_a = self.__input("Enter first binary")
        self.number_b = self.__input("Enter second binary")
    
    def get_arithmetic(self):
        while True:
            try:
                i = input("Choose your arithmetic [*,+,-,/÷]: ")
                
                # Check if input contain a valid arithmetic number
                # excluding some arithmetic
                if re.compile("^(\*|\+|\/|\÷|\-)$").match(i):
                    self.arithmetic = i;
                    return
                
                print("Choose valid Arithmetic\n")
                
            except KeyboardInterrupt:
                self.__keyboard_interrupt()
            
        
    def do_calculate(self):
        # JavaScript. Hahaha
        return {
            "+": lambda a, b : a + b,
            "*": lambda a, b : a * b,
            "/": lambda a, b : a / b,
            "÷": lambda a, b : a / b,
            "-": lambda a, b : a - b
        }[self.arithmetic](self.number_a, self.number_b)
    
    def bin_to_dec(self):
        try:
            #
            # Convert Binary to decimal number
            # 
            self.number_a = int(self.number_a, 2)
            self.number_b = int(self.number_b, 2)
        
        except:
            print("Looks like we have a problem!")
            exit(-1)
            
        
    def __input(self, msg):
        # do-while loop =(
        while True:
            try:
                num = input(f"{msg}: ")
                if re.compile("^([01]{2,})$").match(num):
                    return num
                    
                print("Error: Enter valid binary digits\n")
                break
                    
            except KeyboardInterrupt:
                # Handle CTRL + C command 
                self.__keyboard_interrupt()
        
    def __keyboard_interrupt(self):
        print("Program Terminated")
        exit(0)
        
    

if __name__ == '__main__':
    BinaryArithmetic()



