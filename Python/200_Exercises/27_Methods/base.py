def cheesefunction (lst):
    ans = 0
    for item in lst:
        ans = ans+item
    return ans
def add (x, y):
    sum = x + y
    return sum
    
def mult (x,y):
    prod = x*y
    return prod
    
def printList (lst):
    i = 1
    for item in lst:
        print(str(i)+"."+item)
        i = i + 1

ans = add(5, 3)
print(ans)


christmasList = ["$10","$100","$1000","$100000","$1000000"]
printList (christmasList)

listOfNumbers = [67, 6, 7, 21, 41, 3, 589]
print(cheesefunction(listOfNumbers))