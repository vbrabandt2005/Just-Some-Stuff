# name: TemperatureCalc
# description:
# Simple Temperature Converter in Python
#
# 
# author: @TheGoogleRider
# version: 1.0
# date: 04/03/2022

from secrets import choice


n = input("Enter the unit you want to convert: ")

for i in range(0,n):
    print("Enter '1' for Celsius\n")
    print("Enter '2' for Fahrenheit\n")
    print("Enter '3' for Kelvin\n")

    if (choice == 1):
        c = float(input("Input Celsius: "))
        print()
        print("Celsius Input = ",c)
        #Celsius to Kelvin
        k = c + 273.15 
        print("Kelvin = ",k)
        #Celsius to Fahrenheit
        f = c * 9/5 + 32 
        print("Fahrenheit = ",f)
    if (choice == 2):
        print("pp")
    if (choice == 3):
        print("PooPoo")    
          