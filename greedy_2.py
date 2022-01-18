# 5 8 3
# 2 4 5 4 6
N, M, K = map(int, input().split())
data = list(map(int, input().split()))
data.sort(reverse= True)

first = data[0]
second = data[1]

oneCycle = K * first + second
cNum = M // (K+1)
cElse = M % (K+1)

result = cNum * oneCycle + cElse * first
print(result)