import sys
from heapq import heappush, heappop

def dijkstra():
    #visited[0]=True
    
    
    heappush(heap, [0, 0])
    
    while heap:    
        cost, curr = heappop(heap)
        
        if visited[curr]:
            continue
        visited[curr] = True
        
        for i, c in graph[curr]:
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

print(distance)