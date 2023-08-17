import pandas

data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber": ["4537829158", "5892184058", "4528727830"],

}

dataframe=pandas.read_excel('employees.xlsx')

dataframe = pandas.DataFrame(data)
# Write the data to a csv file
dataframe.to_excel("employees.xlsx", index=False)
print(dataframe)

