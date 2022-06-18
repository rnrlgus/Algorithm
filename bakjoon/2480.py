def calc(a, b, c):
    if a != b and a != c and b != c:
        return max(a, b, c) * 100
    elif a == b and a == c and b == c:
        return 10000 + a*1000
    elif a == b or a == c:
        return 1000 + 100*a
    else:
        return 1000 + 100*c

a, b, c = map(int, input().split())
print(calc(a, b, c))