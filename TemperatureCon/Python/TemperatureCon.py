# name: TemperatureCon
# description:
# Simple Temperature Converter in Python with function and loop
#
# author: @TheGoogleRider
# version: 3
# date: 06/04/2024

def convert_temperature(unit, value):
  if unit == 1:
    k = value + 273.15
    f = value * 9/5 + 32
    print("Input value = ",value)
    print("Kelvin = ",k)
    print("Fahrenheit = ",f)
    print()
  elif unit == 2:
    c = (value - 32) * 5/9
    k = (value - 32) * 5/9 + 273.15
    print("Input value = ",value)
    print("Celsius = ",c)
    print("Kelvin = ",k)
    print()
  elif unit == 3:
    c = value - 273.15
    f = (value - 273.15) * 9/5 + 32
    print("Input value = ",value)
    print("Celsius = ",c)
    print("Fahrenheit = ",f)
    print()
  else:
    print("Please enter a valid option (1, 2, or 3)")

print("TemperatureCon_2.1-Python")
print()

while True:
  print("Enter '1' for Celsius")
  print("Enter '2' for Fahrenheit")
  print("Enter '3' for Kelvin")
  print("Enter 'q' to quit")
  print()
  n = input("Enter the unit you want to convert (or 'q' to quit): ")

  if n == 'q':
    break

  try:
    n = int(n)
  except ValueError:
    print("Please enter a valid option (1, 2, 3, or 'q')")
    continue

  # Get temperature value
  value = float(input("Input value for the chosen unit: "))

  # Call the conversion function
  convert_temperature(n, value)

print("Exiting Temperature Converter...")