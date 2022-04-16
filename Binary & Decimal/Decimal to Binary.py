class Decimal2Binary:
    
    base = 2 #Base Number
    
    #System Variables
    decimal = 0
    table = []
    binary = ""
    
    def __init__(self):
        """
        This code is just to reverse engineer 
        the decimal number by using a table
        """
        pass
    
    
    def getUserInput(self, x):
        print("")
        
        if x == "":
            quit("Exit.") # Quit on Empty Value
            
        if not self.isInt(x):
            print("Input must be a decimal number.")
            return False
        
        return True
    
    def createTable(self):
        bit = 1
        
        while True:
            #Length of binary must be even
            if bit > self.decimal and len(self.table) % 2 == 0:
                break
            
            self.table.append({
                "binary" : "0",
                "decimal" : bit
            })
            
            bit *= self.base
            
        
        self.table.reverse()
        
    
    def process(self):
        
        while True:
            
            cl = self.getCloseLess()
            
            self.table[cl["index"]]["binary"] = '1'
            
            self.decimal -= cl["decimal"]
            
            if self.decimal <= 0:
                break
            
        #After this, Everything is ready to print out
    
    def output(self):
        for obj in self.table:
            self.binary += obj["binary"]
            
        
        print("Binary: {}\n\n".format(self.binary))
        
    
    def display(self):
        sumInt = 0
        
        print("Bits | Decimal | Total Sum")
        
        for obj in self.table:
            flag = "Reject"
            
            if obj["binary"] == "1":
                sumInt += obj["decimal"]
                flag = str(sumInt)
            
            print("  {}  | {} | {}".format(obj["binary"], obj["decimal"], flag))
            
        
        print("\nDecimal: {}".format(sumInt))
        
    def reset(self):
        del self.table[:] #Supported by lower version of python
        self.binary = ""
        
    
    # Helpers
    def getCloseLess(self):
        if self.decimal == 1:
            return { "decimal" : 1, "index" : (len(self.table) - 1) }
        
        for i in range(0, len(self.table) - 1):
            if self.decimal >= self.table[i]["decimal"]:
                return { "decimal" : self.table[i]["decimal"], "index" : i }
            
        
    
    def isInt(self, arg):
        try:
            self.decimal = int(arg)
            return True
        except ValueError:
            pass
        
        return False
    



obj = Decimal2Binary()

while True:
    x = input("Decimal: ")
            
    if not obj.getUserInput(x):
        continue
    
    obj.createTable()
    
    obj.process()
    
    #Print Decimal and its table
    obj.display()
    
    #Print Binary
    obj.output()
    
    obj.reset()
