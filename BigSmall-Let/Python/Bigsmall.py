
print("BigSmall v1-Python")
print()

sen = (input("Give me sentence: "))
unit = (input("Upper or Lower: "))
print()


if unit == "Upper" or "upper":
    print("Input:",sen)
    print("Output:",sen.upper())
elif unit == "Lower" or "lower":
    print("Input:",sen)  
    print("Output:",sen.lower())
