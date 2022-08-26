
# Google interview question:
# Q: Find the first recurring character in a string?

# Pseudo code for this problem:

from asyncio.windows_events import NULL
from logging import NullHandler

# Python program to find the first
# repeated character in a string
def first_recurring(given_string):
    #Create empty Hash / Map
     counts = {}
     # Traverse each character in String
     for char in given_string:
        print('counts' , counts)
        
        #If character is already in Hash, 
        # return that char.
        if char in counts:
            return char
        # Add char to counts Hash
        else: 
            counts[char] = 1
    # if nothing found return null as string
     return 'null'

value = first_recurring('DACTC')
print('value: ' , value)
