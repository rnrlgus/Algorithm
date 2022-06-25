def sol(n):
    if n == 0:
        return lst[0]
    return max(sol(n-1), lst[n])


n = int(input())
lst = list(map(int, input().split()))
print(sol(n-1))