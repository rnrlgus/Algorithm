# 단순하게 DP로 구현했을 때 시간 복잡도의 비 효율성을 고려해 sparse table을 만들고
# 활용하는 방식으로 시간 복잡도를 효율적으로 만들었다.
# 시간복잡도: O(log(n))

n = int(input()) # 1 ~ 10000
fx = [0]
fx += list(map(int, input().split()))
query_num = int(input())


dp = [[fx[i]] for i in range(n+1)]
log = 14 # 2**13 = 8192

for j in range(1, log + 1):
    for i in range(1, n+1):
        dp[i].append(dp[dp[i][j-1]][j-1]) # 점화식

for _ in range(query_num):
    x, k = map(int, input().split())
    
    # 매 쿼리 때마다 shift를 해주며 값이 0이 되기 전까지 반복
    for i in range(log, -1, -1):
        if k >= 1 << i:
            k-=1 << i
            x = dp[x][i]
    print( x)
    

