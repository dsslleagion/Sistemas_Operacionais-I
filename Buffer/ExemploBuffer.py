list = []

for n in range(10):
    letra = input("digite uma letra: ")
    list.append(letra)


print(''.join(map(str, list)))

list.clear()

print(list)