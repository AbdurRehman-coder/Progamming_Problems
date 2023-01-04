import math
import os
import random
import re
import sys

# HACKERRANK

# Task
# Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
# and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
#  Round the result to the nearest integer.

# Example
# A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.


#
# Complete the 'solve' function below.
#
# The function accepts following parameters:
#  1. DOUBLE meal_cost
#  2. INTEGER tip_percent
#  3. INTEGER tax_percent
#

def solve(meal_cost, tip_percent, tax_percent):
    # Write your code here

#   if __name__ == '__main__':
    meal_cost = float(input('Enter your meal cost: '))

    tip_percent = int(input('Enter your tip percentage: '))

    tax_percent = int(input('Enter your tax_percentage: '))
    
    tip = (tip_percent / 100) * meal_cost;
    tax = (tax_percent / 100) * meal_cost;
    
    total_cost = meal_cost + tip + tax
    
    print('your total Meal cost: ', round(total_cost));

solve(15.00, 8, 12)