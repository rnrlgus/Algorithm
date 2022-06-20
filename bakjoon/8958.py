n = int(input())

for _ in range(n):
    result = 0
    cnt = 0
    line = input()
    for i in line:
        if i == "O":
           cnt += 1
           result += cnt
        else: cnt = 0
    print(result) 