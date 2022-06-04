#!/usr/bin/env python3

import time

class Timer:
    
    def start(self):
        self.s = time.time() * 1000
    
    def end(self):
        self.e = time.time() * 1000
        
    
    def printLapse(self, m):
        print("{}: {:.2f}s".format(m, self.e - self.s))
    


"""
Author: Jovan De Guia
Github Username: jxmked
"""