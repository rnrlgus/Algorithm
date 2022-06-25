def trif(n, k):
    if n <= k:
        return n
    print(n)    
    return trif(n - 1, k) + trif(n - 2, k) + trif(n - 3, k)

print(trif(8, 4))