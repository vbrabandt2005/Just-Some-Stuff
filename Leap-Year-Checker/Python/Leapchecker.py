# name: LeapChecker
# description:
# Simple Leap-Year-Checker written in Python
# (Made for School)
#
# author: @TheGoogleRider
# version: v1.0
# date: 12/09/2022


print("Leap-Year-Checker_V.1")
print()
print("Please enter a year between 1582 - 3000")
year = int(input("Enter the year: "))
print()

a = 1582
b = 3000

if year >= a and b >= year:
    if year%4 == 0 and year%100 != 0 or year%400 == 0:
        print(year,"is a leap year")
    else:
        print(year,"is not a leap year")
else:
    print("Please Try AGAIN!!!")        

#By TheGoogleRider    