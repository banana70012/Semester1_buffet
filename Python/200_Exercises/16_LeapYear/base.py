bobber = (int)(input("Please enter a year you'd like to check! "))
if bobber % 4 == 0 and bobber % 100 == 0 and bobber % 400 == 0:
    print("This year is a leap year!")
elif bobber % 4 == 0 and not bobber % 100 == 0:
    print("This year is a leap year")
else:
    print("This year is not a leap year!")