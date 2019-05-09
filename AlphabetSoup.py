def AlphabetSoup(str):
    split = list(str)
    split = sorted(split)
    split = "".join(split)
    return split

str = input ("Input: ")
rev = AlphabetSoup(str)
print("Output:",rev)