n, m = map(int, input().split())
max = -1
for i in range(n):
    cards = list(map(int, input().split()))
    cards.sort()
    if cards[0] > max:
        max = cards[0]

print(max)
    