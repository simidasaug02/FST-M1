NoOfList = int(input("How Many no you want to add in the list "))
ListOfData = []
for i in range(NoOfList):
    Data = input("Enter The Data in the list ")  #[12,10,13,12]
    ListOfData.append(Data)

#print(ListOfData[0])
#print(ListOfData[-1])
#print(ListOfData[len(ListOfData)-1])
if(ListOfData[0] == ListOfData[len(ListOfData)-1]):
    print(True)
else:
    print(False)
