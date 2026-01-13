bobby = (int)(input("Please enter line length! "))
cheese = input("Would you like it vertical or horizontal? ")
print(" ")
if cheese == "vertical" or cheese == "Vertical":
    for soda in range(0,bobby):
        print("*")
elif cheese == "horizontal" or cheese == "Horizontal":
    for cheeseburger in range(0,bobby):
        print(" ", end="")
        print("*", end="")