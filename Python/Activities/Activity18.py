import pandas

dataframe = pandas.read_csv('C:/Users/08109U744/IdeaProjects/FSTPythonAug02/Activities/UserDetails.csv')
print("Usernames:")
print(dataframe["Usernames"])

print("Second User is ",dataframe["Usernames"][1]," and Password is ", dataframe["Passwords"][1])

print(dataframe.sort_values('Usernames', ascending=True))
print(dataframe.sort_values('Passwords', ascending=False))











