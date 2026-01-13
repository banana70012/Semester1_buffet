import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
bobber = int(input("How many jokes would you want? "))
print(" ")
for cheese in range(0,bobber):
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
    print(joke["setup"])
    print(joke["delivery"])
    print(" ")