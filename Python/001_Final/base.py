# Type "pip install sklearn" into the terminal
import json
import random
import joblib
from datetime import datetime
import requests

model = joblib.load("./Buffet_Poole26/Python/001_Final/intents.pkl")

with open("./Buffet_Poole26/Python/001_Final/intents.json") as file:
    intents = json.load(file)["intents"]
    
def get_response(tag):
    i = []
    for intent in intents:
        if intent["tag"] == tag:
            i = intent
            break
        
    response = random.choice(i["responses"])
    return response

print("Hello, welcome to Radium AI")

while True:
    userInput = input("You: ")
    
    if userInput.lower() == "exit":
        print("Good bye!")
        break
    predictedTag = model.predict([userInput])[0]
    response = get_response(predictedTag)
    
    print("Radium: " + response)