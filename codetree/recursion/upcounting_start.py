def sol(n):
    if n == 0:
        return 0
    
    sol(n-1)
    print("*" * n)

n = int(input())
sol(n)