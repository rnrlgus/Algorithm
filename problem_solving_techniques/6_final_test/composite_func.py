n = int(input()) # 1 ~ 10000
fx = [0]
fx += list(map(int, input().split()))
query_num = int(input())


dp = [[fx[i]] for i in range(n+1)]
log = 14 # 2**13 = 8192

for j in range(1, log + 1):
    for i in range(1, n+1):
        dp[i].append(dp[dp[i][j-1]][j-1])

for _ in range(query_num):
    x, k = map(int, input().split())
    
    for i in range(log, -1, -1):
        if k >= 1 << i:
            k-=1 << i
            x = dp[x][i]
    print( x)
    


print("----------------------------")
# print("n: ",n)
# print("f(x): ",fx)
# print("query_num = ",query_num)
# print("x: ", x)
# print("k: ", k)

print(dp)