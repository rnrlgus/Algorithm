# 코드트리 객체정렬 마지막 문제

n = int(input())
lst = list(map(int, input().split()))
numbers = [(num, i) for i ,num in enumerate(lst, start = 1)]
tmp = numbers.copy()
result = [0 for _ in range(n)]
numbers.sort(key = lambda x: (x[0], x[1]))

for i in range(len(tmp)):
    result[i] = numbers.index(tmp[i]) +1

for i in result:
    print(i, end=" ")