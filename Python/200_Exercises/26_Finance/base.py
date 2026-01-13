#Run "pip install yfinance" in a terminal

import yfinance as yf
cheese = ["COST","TGT","SGML","RBLX","INTC","AAPL","NVDA","AMD","BB","GOOGL"]
for bobber in range(0,9):
    stock = yf.Ticker(cheese[bobber])
    current_price = stock.history(period="1d")["Close"][0]
    info = stock.info
    print(info["longName"])
    print(info["website"])
    print(cheese[bobber]+" Current Price:", current_price)

bob = input("Please input a ticker symbol: ")
stock = yf.Ticker(bob)
current_price = stock.history(period="1d")["Close"][0]
info = stock.info
print(info["longName"])
print(info["website"])
print(bob+" Current Price:", current_price)