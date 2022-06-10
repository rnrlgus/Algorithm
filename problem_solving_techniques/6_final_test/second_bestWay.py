# 다익스트라 알고리즘을 활용했다. 
# 기본적으로 다익스트라와 동일하게 최단거리로 갱신해주며 
# 2번째 최단 거리를 알아내기 위해 n * 2 크기의 이차원 배열을 활용했다.
# 위의 이차원 배열에 최단 거리 순의 경로를 삽입하고 2번째 원소를 모두 더했다.
# 또한 문제의 조건을 만족하기 위해 2번째 원소가 inf일 경우 그 노드로의 경로는 배제했다.

# 시간복잡도: O(n + m * log(n) )

import sys
from heapq import heappush, heappop

# O(n + m * log(n) )
def dijkstra():
    heappush(heap, [0, 0])
    
    while heap:    
        cost, curr = heappop(heap)
        
        if visited[curr]:
            continue
        visited[curr] = True
        
        for i, c in graph[curr]:
            if visited[i]:
                continue
            w = cost + c
            if w < distance[i][1]:
                distance[i][1] = w
                distance[i].sort()
                heappush(heap, [w,i])

#main
n = int(input()) # 노드 개수 ~500
m = int(input()) # 엣지 개수 ~10000

inf = sys.maxsize
visited = [False for _ in range(n)]
distance = [[inf]*2 for _ in range(n)]
graph = [[] for _ in range(n)]
for _ in range(m):
    u ,v, w = map(int, input().split())
    graph[u].append((v, w))
heap = []    

dijkstra()

sum = 0
for i in distance:
    if i[1] != inf:
        sum += i[1]
        
print(sum)