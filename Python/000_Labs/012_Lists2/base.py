import random
listoid = []
bobber = int(input("How many random numbers would you like to create? "))
for cheeses in range(0,bobber):
    listoid.append(str(int(random.randrange(0,11))))
print("Your numbers are: ", end="")
for cheese in range(0,bobber-1):
    print(listoid[cheese]+",", end="")
print(listoid[cheese], end="")