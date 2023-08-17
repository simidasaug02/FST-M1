# Function to calculate sum
def calculateSum(num):
     if num:
        # Recursive function call
      num = (num + calculateSum(num-1))
      #num=num+1
      return num
     else:
        return 0

res = calculateSum(10)
print(res)