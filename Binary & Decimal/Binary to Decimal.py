from math import pow

class Binary2Decimal:
    #Formula: dn-1 ... d3 d2 d1
    
    base = 2 #Base Number. Default: 2
    validChar = ["0", "1", "."] #Input must contain only
    
    # System Variables
    binary = "" #User input
    result = 0 #Output result
    binLen = 0 #Binary Length
    hasDecimal = False
    
    def __init__(self):
        """
         
        """
        print("Binary with decimal value like '01100001.11' is now supported.")
        
    
    def getUserInput(self, x):
        print("") #Just for a new line
        
        if x == "":
            quit("Exit.") # Quit on Empty Value
            
        # Check if containes 1s, 0s & . only
        try:
            decimalIndex = x.index(".")
            
            #Having extra dot is not valid
            if not decimalIndex == x.rfind("."):
                print("Decimal places has been doubled.")
                return False
            self.hasDecimal = True
            self.binLen = decimalIndex
        except:
            #No Decimal Places
            self.binLen = len(x)
        
        for i in x:
            if not i in self.validChar:
                print("Input must contain only {}.\n".format(self.validChar))
                return False
            
        
        self.binary = x
        return True
    
    def calculate(self):
        print(" n = b ( x^(y) ) \n")
        for i in self.binary:
            if i == ".":
                continue
            
            self.binLen -= 1
            
            ans = int(i) * pow(self.base, self.binLen)
            
            self.result += ans
            
            self.display(i, self.finalize(ans))
            
        
    
    def display(self, digit, ans):
        
        print(" {}( {}^({}) ) = {}".format(digit, self.base, self.binLen, ans))
        
    
    def output(self):
        
        print("\nDecimal Result: {}\n".format(self.finalize(self.result)))
    
    def finalize(self, val):
        if self.hasDecimal:
            return val
        return int(val)
    
    
    def reset(self):
        self.result = 0
        self.binLen = 0
        self.binary = ""
        self.hasDecimal = False
    

# End Class Object


obj = Binary2Decimal()

while(1):
    x = input("Binary Digits: ")
    
    if not obj.getUserInput(x):
        continue
    
    obj.calculate()
    
    obj.output()
    
    obj.reset()