n = int(input())
data = []
for i in range(n):
    data.append(int(input()))
    
array = sorted(data, reverse=True)
for i in array:
    print(i, end=' ')