a = input()
b = input()
a = list(a)
b = list(b)
a.sort()
b.sort()
"".join(a)
"".join(b)

result = True
for i, j in zip(a, b):
    print(i, j)
    if i != j:
        result = False
if result == True:
    print("Yes")
else:
    print("No")

a.remo