
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