# name: TemperatureCon
# description:
# Simple Temperature Converter in Python
#
# author: @TheGoogleRider
# version: 2.1
# date: 09/09/2022

print("TemperatureCon_2.1-Python")
print()
print("Enter '1' for Celsius")
print("Enter '2' for Fahrenheit")
print("Enter '3' for Kelvin")
print()
n = int(input("Enter the unit you want to convert: "))
print()

for _ in range(n):
    if n == 1:
        c = float(input("Input Celsius: "))
        print()
        
        k = c + 273.15
        print("Kelvin = ",k)
        f = c * 9/5 + 32
        print("Fahrenheit = ",f)

    elif n == 2:
        f = float(input("Input Fahrenheit: "))
        print()

        c = (f - 32) * 5/9
        print("Celsius = ",c)
        k = (f - 32) * 5/9 + 273.15
        print("Kelvin = ",k)
    elif n == 3:
        k = float(input("Input Kelvin: "))
        print()

        print("Kelvin Input = ",k)
        c = k - 273.15
        print("Celsius = ",c)
        f = (k - 273.15) * 9/5 + 32
        print("Fahrenheit = ",f)
    else:
        print("Please enter an option from the screen")
    exit()
    
#By TheGoogleRider