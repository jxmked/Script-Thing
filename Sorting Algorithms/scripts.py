
arr = """
Bubble Sort.py
Cocktail Sort.py
Cycle Sort.py
Heap Sort.py
Insertion Sort.py
Merge Sort.py
Pigeonhole Sort.py
Quick Sort.py
Radix Sort.py
Selection Sort.py
Shell Sort.py
Strand Sort.py
"""

import os
import time 


tb = []

for k, spy in enumerate(arr.split("\n")):
    if len(spy) <= 0:
        continue
    
    print(spy)
    
    s = time.time()
    
    os.system("python3 \"%s\"" % spy)
    
    tb.append({
        "title" : spy,
        "time" : (time.time() - s)
    })
    

for t in tb:
    print("%s | %s" % (t["title"], t["time"]))