ListOne = [2, 3, 4, 5, 6]
ListTwo = [7, 8, 9, 10, 11]
FinalList = []

for i in ListOne:
    print(i)
    divisibleby = i%2
    if divisibleby > 0:
        FinalList.append(i)
print(FinalList)
 #   print("Odd number")

for i in ListTwo:
    print(i)
    divisibleby = i%2
    if divisibleby == 0:
        FinalList.append(i)
print(FinalList)


