def solution(n, L, k, zombies):
    pass


# main
n, L, k = map(int, input().split()) # 좀비 수 / 길의 길이 / k번째로 떨어질 좀비 id 출력
zombies = []
for i in range(n):
    zombies.append(list(map(int, input().split())))
    
print(n, L, k)
print(zombies)