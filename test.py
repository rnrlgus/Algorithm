
a = [1, 2, 3, 1, 1, 4, 2, 4, 3, 3]
b = [2, 3, 1, 1, 4]

aa = "".join(str(s) for s in a)
bb = "".join(str(s) for s in b)
print(aa, bb)

aa.replace(bb, "")
print(aa)