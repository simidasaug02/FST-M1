Player1 = input("Enter Player1 = ")
Player2 = input("Enter Player2 = ")

Choice1 = input(Player1 + ", Enter choice: rock, paper or scissors? ")
Choice2 = input(Player2 + ", Enter choice: rock, paper or scissors? ")

if Choice1 == Choice2:
    print("It is a tie")
elif Choice1 == 'rock':
     if Choice2 == 'scissors':
        print(Player1 + " Wins")
     else:
        print(Player2 + " Wins")

elif Choice1 == 'rock':
    if Choice2 == 'paper':
        print(Player1 + " Wins")
    else:
        print(Player2 + " Wins")

elif Choice1 == 'paper':
    if Choice2 == 'scissors':
        print(Player1 + " Wins")
    else:
        print(Player2 + " Wins")

else:
    print("Invalid Input")

