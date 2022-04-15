from math import pow

class Binary2Decimal:
    #Formula: dn-1 ... d3 d2 d1
    
    base = 2 #Base Number. Default: 2
    
    # System Variables
    binary = "" #User input
    result = 0 # += (binary digit * (base ^ power[binary length - 1]))
    binLen = 0 #Binary Length
    
    def __init__(self):
        
        print("Binary with decimal value like '01100001.11' is not supported.")
        
    
    def getUserInput(self):
        x = str(input("Binary Digits: "))
        print("") #Just for a new line
        
        if x == "":
            
            quit("Exit.") # Quit on Empty Value
            
        
        self.binLen = len(x)
        
        # Check if containes 1s & 0s only 
        
        for i in range(0, self.binLen - 1):
            if not (x[i] == "0" or x[i] == "1"):
                print("Input must be contain only 1s & 0s.\n")
                return True
            
        
        self.binary = x
        
    
    def calculate(self):
        
        for i in self.binary:
            
            self.binLen -= 1
            
            """
            Compute: 0101
            start at first digit '0'
            
            n = x ( base ^ (binary length - 1) )
            """
            ans = int(int(i) * pow(self.base, self.binLen))
            
            self.result += ans
            
            self.display(i, ans)
            
        
    
    def display(self, digit, ans):
        print("{} * {} ^ {} = {}".format(digit, self.base, self.binLen, ans))
        
    
    def output(self):
        print("Decimal Result: {}\n".format(self.result))
        
    

# End Class Object


obj = Binary2Decimal()

while(1):
    
    if obj.getUserInput():
        continue
    
    obj.calculate()
    
    obj.output()

