bobber=int(input("Please enter a number: "))
c = 1
ans = 0
for cheeses in range(0,bobber):
    ans = c+ans
    c = c+1
print("The sum from 1 to "+str(bobber)+" is "+str(ans))
ans = 0
c = 1
print(str(c), end ="")
for bobby in range(0,(bobber-1)):
   c = c+1
   print("+"+str(c), end ="") 