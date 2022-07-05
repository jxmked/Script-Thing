#!/usr/bin/env python3

class ComputerGrade:
    
    def __init__(self):
        
        while True: # Infinite Loop
        
            # Handling raised 'ValueError' error from 'float' function
            try:
                # Get User Input
                value = input("Grade [0.0-1.0]: ")
                
                # Try to convert String to Float
                num = float(value)
                
                # Check if float number is in between 1.0 and 0.0
                if num > 1.0 or num < 0.0:
                    print("Bad Score")
                    exit(0)
                
                # Get the assigned grade letter
                grade = self.computerGrade(num)
                    
                print("Grade: %s" % grade)
                print("- " * 10, end="-\n\n")
            
            except KeyboardInterrupt:
                # Use 'ctrl + c' to terminate
                print("\nProgram Terminated\n")
                exit(0)
            
            except ValueError:
                # Wrong Value
                print("Invalid input\n")
                exit(0)
                
    
    def computerGrade(self, grade):
        assignedGrade = {
            "A" : 0.9,
            "B" : 0.8,
            "C" : 0.7,
            "D" : 0.6,
        }
        
        # Check each value from 'assignedGrade'
        # is equal or less than 'grade'
        for key in assignedGrade:
            if grade >= assignedGrade[key]:
                return key
        
        # If 'grade' is less than from last key-value pair in object
        return 'E'


# Init
ComputerGrade()
