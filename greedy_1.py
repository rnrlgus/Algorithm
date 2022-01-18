# 거스름 돈 최소 동전 개수
n = int(input())
count = 0 # 동전 개수

coins = [500, 100, 50, 10]

for coin in coins:
    count += n // coin
    n %= coin
    
print(count)

# 포인트는 동전 단위가 서로 배수 관계이기 때문에 최적해가 될 수 있었다는 점이다.
# 배수 관계가 아니었다면? 최적해가 될 수 없을 것이다. -> 다이나믹 프로그래밍 활용