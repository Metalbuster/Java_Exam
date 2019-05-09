def FirstFactorial(num):
    if num == 1:
        return 1 
    else: 
        return num * FirstFactorial(num - 1)

num = int(input ("Input: "))
total = FirstFactorial(num)
print("Output:",total)