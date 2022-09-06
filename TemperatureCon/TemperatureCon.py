# name: TemperatureCon
# description:
# Simple Temperature Converter in Python
#
# author: @TheGoogleRider
# version: 2.1
# date: 06/09/2022

print("Enter '1' for Celsius")
print("Enter '2' for Fahrenheit")
print("Enter '3' for Kelvin")
n = int(input("Enter the unit you want to convert: "))
for _ in range(n):
    if n == 1:
        c = float(input("Input Celsius: "))
        print()
        print("Celsius Input =",c)
        #Celsius to Kelvin
        k = c + 273.15
        print("Kelvin =",k)
        #Celsius to Fahrenheit
        f = c * 9/5 + 32
        print("Fahrenheit =",f)
    elif n == 2:
        f = float(input("Input Fahrenheit: "))
        print()
        print("Fahrenheit Input =",f)
        #Kelvin to Celcius
        c = (f - 32) * 5/9
        print("Celsius = ",c)
        #Fahrenheit to Kelvin
        k = (f - 32) * 5/9 + 273.15
        print("Kelvin = ",k)
    elif n == 3:
        k = float(input("Input Kelvin: "))
        print()
        print("Kelvin Input =",k)
        #Kelvin to Celcius
        c = k - 273.15
        print("Celsius =",c)
        #Kelvin to Fahrenheit
        f = (k - 273.15) * 9/5 + 32
        print("Fahrenheit =",f)
    else:
        print("Please enter an option from the screen")
    exit()
#By TheGoogleRider