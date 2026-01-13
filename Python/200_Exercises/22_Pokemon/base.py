import requests
loopy=0
sigma= input("which Pokemon would you like to learn about? ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/"+sigma).json()
print("Name: ", end="")
for char in pokemon["name"]:
    if loopy == 0:
        print(char.upper(), end="")
    else:
        print(char.lower(), end="")
    loopy = loopy + 1
print(" ")
print("Weight:"+str(pokemon["weight"]))
print("Height:"+str(pokemon["height"]))