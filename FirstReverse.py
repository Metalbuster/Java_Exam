def FirstReverse(str):
    split = list(str)
    split = split[::-1]
    split = "".join(split)
    return split

str = input ("Input: ")
rev = FirstReverse(str)
print("Output:",rev)