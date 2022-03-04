# name: TemperatureCalc
# description:
# Simple Temperature Converter in Python
#
# 
# author: @TheGoogleRider
# version: 1.0
# date: 04/03/2022

from secrets import choice



n = int(input("Enter the unit you want to convert: "))
print("Enter '1' for Celsius")
print("Enter '2' for Fahrenheit")
print("Enter '3' for Kelvin")

for i in range(0,n):
    
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
    elif (choice == 2):
        k = float(input("Input Kelvin: "))
        print()
        print("Kelvin Input = ",k)
        #Kelvin to Celcius
        c = k - 273.15
        print("Celsius = ",c)
        f = k - 273.15 * 9/5 + 32
        print("Fahrenheit = ",f)
    elif (choice == 3):
        print("PooPoo")    

    else:
        print("Please enter an option from the screen")
          