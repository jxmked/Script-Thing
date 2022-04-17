"""
This object is to manage User Interface easily
and customly created for a program that inherit it. =)

"""

class xUserInterface:
    def __init__(self):
        pass
    
    def getInput(self, param, validator, fallback):
        
        while True:
            val = input(param)
            
            if val == "":
                #Always exit on this value.
                #Love this thing. Hahaha
                exit("Finished!\n")
                
            if validator(val):
                break
            
            self.rawOutput(fallback)
            
        
        #self.rawOutput("\n")
        return val
    
    @staticmethod
    def output(table):
        xUI = xUserInterface
        binary = ""
        decimal = 0
        
        xUI.rawOutput(" Bit | Decimal | Total Sum")
        
        for obj in table:
            binary += obj["binary"]
            decimal += obj["decimal"]
            
            xUI.rawOutput("  {}  | {} | {} ".format(obj["binary"], obj["decimal"], decimal))
        
        return { "binary" : binary, "decimal" : decimal }
        #xUI.rawOutput("\n Decimal: {}\n Binary: {}\n".format(decimal, binary))
    
    @staticmethod
    def getBinary(table):
        binary = ""
        for obj in table:
            binary += obj["binary"]
        return binary
    
    @staticmethod
    def getDecimal(table):
        decimal = 0
        for obj in table:
            decimal += int(obj["decimal"])
        
        return decimal
        
    #Static Helpers
    @staticmethod
    def rawOutput(arg):
        print(arg)
    
    @staticmethod
    def isFloat(arg):
        try:
            int(arg)
        except ValueError:
            try:
                float(arg)
                return True
            except ValueError:
                pass
            
        return False
    
    @staticmethod
    def isInt(arg):
        try:
            if int(arg) == arg:
                return True
        except ValueError:
            pass
        return False