#-------------Methods-------------
# This method should return the largest of 3 integers
def largestOfThree(x, y, z):
    ans = 0
    if x>y and x>z:
        ans = x
    elif y>x and y>z:
        ans = y
    elif z>x and z>y:
        ans = z
    else:
        ans = "nan"
    return ans

# This method should combine all the words in the list into a sentence with spaces between
def formSentence(wordList):
    sentence =""
    for item in wordList:
        sentence = sentence+item+" "
    return sentence

# This method should combine all the words in the list in reverse into a sentence with spaces between
def reverseSentence(wordList):
    legnth = len(wordList)
    sentence = ""
    for item in wordList:
        sentence = sentence+wordList[legnth-1]+" "
        legnth = legnth-1
    return sentence

#--------------Code--------------
a = int(input("Enter a number: "))
b = int(input("Enter another number: "))
c = int(input("Enter another number: "))

ans = largestOfThree(a, b, c)
print("The largest of the three numbers is " + str(ans))
print()

words = ["This", "will", "become", "the", "coolest", "sentence", "yahoo"]
sentence = formSentence(words)
print(sentence)

print()
print("The same sentence backwards!")
sentence = reverseSentence(words)
print(sentence)