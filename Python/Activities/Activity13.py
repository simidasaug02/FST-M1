def SumCalc(ListOfData):
    sum=0
    for i in ListOfData:
        sum = sum + int(i)
    return sum

ListOfData = [10, 20, 33, 46, 55]
call = SumCalc(ListOfData)
print(call)

