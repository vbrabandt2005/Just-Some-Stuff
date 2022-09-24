# name: BigSmall-py
# description:
# Simple BigSmall written in Python
# (Made for School)
#
# author: @TheGoogleRider
# version: v1.3
# date: 24/09/2022

print("BigSmall v1-Python")
print()

sen = (input("Give me sentence: "))
unit = int(input("Upper = 1 or Lower = 2: "))
print()

if unit == 1:
    print("Input:",sen)
    print("Output:",sen.upper())
    
elif unit == 2:
    print("Input:",sen)  
    print("Output:",sen.lower())

#By TheGoogleRider