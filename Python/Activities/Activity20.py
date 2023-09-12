import pandas
import pytest

dataframeexcel = pandas.read_excel('employees.xlsx')
print(dataframeexcel)

print("The Shape of the employee table is " , dataframeexcel.shape)
print("The email column values are ")
print(dataframeexcel["Email"])
print("The Sorted values are ")
print(dataframeexcel.sort_values('FirstName',ascending=True))


