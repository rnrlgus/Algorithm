n = int(input())
for i in range(n):
    r, s = input().split()
    for i in s:
        for _ in range(int(r)):
            print(i, end="")
    print()