#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.

fruit_set = {"apple":120, "banana":50, "cherry":250}
x = fruit_set.get("apple")
if (x == None):
    print("Apple Not Found in the list")
else:
    print("Apple Found in the list")


