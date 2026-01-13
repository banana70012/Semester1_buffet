bob = int(input("Please input a number: "))
cheese = input("Please input an operation: ")
cheesey = int(input("Please input another number: "))
ans = 0
print(" ")
if cheese == "-":
    ans = bob-cheesey
    print(str(bob)+cheese+str(cheesey)+"="+str(ans))
elif cheese == "+":
    ans = bob+cheesey
    print(str(bob)+cheese+str(cheesey)+"="+str(ans))
elif cheese == "/":
    ans = bob/cheesey
    print(str(bob)+cheese+str(cheesey)+"="+str(ans))
elif cheese == "*":
    ans = bob/cheesey
    print(str(bob)+cheese+str(cheesey)+"="+str(ans))
else:
    print("Please input the correct operation!")