# 거스름 돈 최소 동전 개수
n = int(input())
count = 0 # 동전 개수

coins = [500, 100, 50, 10]

for coin in coins:
    count += n // coin
    n %= coin
    
print(count)