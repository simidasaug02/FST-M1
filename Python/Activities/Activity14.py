def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

numberforseries = int(input("Enter a number for which you want a series: "))

if numberforseries <= 0:
    print("Please enter a positive number")
else:
    print("Below is the Fibonacci Series : ")
    for i in range(numberforseries):
        print(fibonacci(i))