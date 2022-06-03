#!/usr/bin/env python3

import time

class Timer:
    
    def start(self):
        self.s = round(time.time() * 1000)
    
    def end(self):
        self.e = round(time.time() * 1000)
        
    
    def printLapse(self, m):
        print("{}: {}ms".format(m, self.e - self.s))
    


"""
Author: Jovan De Guia
Github Username: jxmked
"""