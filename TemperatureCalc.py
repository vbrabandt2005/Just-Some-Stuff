# name: TemperatureCalc
# description:
# Simple Temperature Converter in Python
#
# 
# author: @TheGoogleRider
# version: 1.0
# date: 04/03/2022


c = float(input("Input Celsius: "))
print()
print("Celsius Input = ",c
)
#Celsius to Kelvin
k = c + 273.15 
print("Kelvin = ",k)

#Celsius to Fahrenheit
f = c * 9/5 + 32
print("Fahrenheit = ",f)