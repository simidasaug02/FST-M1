
# Given tuple
#No_tuple = (10, 20, 33, 46, 55)
No_tuple = ()
NoOfData = int(input("Enter the Number Of data "))
for i in range(NoOfData):
    Data = input("Enter The Tuple Data in the list ")
    No_tuple = No_tuple+(Data,)
print(No_tuple)

# Print elements that are divisible by 5
#print("Elements that are divisible by 5:")
for num in No_tuple:
    if (int(num) % 5 == 0):
       print(num)
