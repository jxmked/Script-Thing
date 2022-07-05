#!/usr/bin/env python3

class NumberList:
    nList = []
    nMax = 0
    nMin = 0
    nLen = 0
    nTotal = 0
    
    def __init__(self):
        while True:
            val = input("Number: ")
            
            try:
                if val.lower() == "done":
                    seld.printOut()
                    break
                
                num = int(val)
                
                # Sum all entered numbers
                self.nTotal += num
                
                # Append All Entered Number into Array
                self.nList.append(num)
            
            except ValueError:
                print("\n%s is not a number.\n" % val)
            
            except KeyboardInterrupt:
                print("Program Terminated.")
                exit(0)
            
        
    
    def printOut(self):
        # Get max
        self.nMax = max(self.nList)
        
        # Get Min
        self.nMin = min(self.nList)
        
        # Get Length
        self.nLen = len(self.nList)
        
        print("\n-------------\n")
        print("You entered a total of %s numbers" % self.nLen)
        print("The minimum number is %s" % self.nMin)
        print("The maximum number is %s" % self.nMax)
        print("The sum of all entered numbers is %s" % self.nTotal)
        
    

obj = NumberList()
obj.printOut()


"""
Author: Jovan De Guia
Github Username: jxmked
"""