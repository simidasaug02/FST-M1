Player1 = input("Enter Player1 = ")
Player2 = input("Enter Player2 = ")

Choice1 = input(Player1 + ", Enter choice: rock, paper or scissors? ")
Choice2 = input(Player2 + ", Enter choice: rock, paper or scissors? ")

while True:
  if Choice1 == Choice2:
    print("It is a tie")
  elif Choice1 == 'rock':
         if Choice2 == 'scissors':
            print(Player1 + " Rock Wins")
         else:
            print(Player2 + " Paper Wins")

  elif Choice1 == 'paper':
          if Choice2 == 'rock':
             print(Player1 + " Paper Wins")
          else:
             print(Player2 + " Scissors Wins")

  elif Choice1 == 'scissors':
          if Choice2 == 'paper':
            print(Player1 + " Scissors Wins")
          else:
            print(Player2 + " Rock Wins")

  else:
     print("Invalid Input Provided")

  repeat = input("Do you want to continue? Yes/No")
  if (repeat == "yes"):
    pass
  elif(repeat == "no"):
    raise SystemExit
  else:
       print("You entered an invalid option. Exiting now.")
       raise SystemExit

