"""
Handle Console input

Feature:
- Targeting which parameter index to be get
- Check if number is Even or Odd
- Is String
- Is Less than or greater than
- return a default number
"""
from sys import argv

class inInt:
    
    def __init__(self, n=3, x=999, e="none", i=1):
        """
        Min
        Max
        MustBe = [even, odd, none]
        Index of parameter
        """
        
        # Check if variable 'e' has valid parameter
        if not e in (["none", "odd", "even"]):
            raise Exception("Third parameter must be one of 'none', 'even', 'odd'")
        
        # Check if min is greater than or equal to max
        if n >= x:
            raise Exception("First and second parameter must be min & max, and not equal")
        
        self.min = n
        self.max = x
        self.mustBe = e
        
        self.index = i
        
        
    
    def getInput(self, de, pos=-1):
        """
        let to raise the error without handling it.
        Just to stop the execution.
        """
        
        try:
            index = self.index
            
            if not pos == -1:
                index = pos
                
            x = int(argv[index])
            
            if x < self.min or x > self.max:
                raise Exception("\nInput must be greater than or equal to {} and less than or equal to {}".format(self.min, self.max))
                
            if not self.mustBe == "none":
                # Is Even
                if self.mustBe == "even" and self.isEven(x):
                    return x
                
                # Is Odd
                if self.mustBe == "odd" and not self.isEven(x):
                    return x
                
                raise Exception("Input must be an {} number".format(self.mustBe))
            
            # self.MustBe is set to none
            return x
        except IndexError:
            return de # Default number
        
    
    def isEven(self, num):
        return (num % 2 == 0)
    

"""
Written by Jovan De Guia
Github Username: jxmked
"""