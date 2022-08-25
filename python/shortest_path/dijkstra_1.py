import sys
input = sys.stdin.readline
INF = int(1e9)

n, m = map(int, input().split()) # 노드, 간선 개수
start = int(input()) # 시작 노드 번호
graph = [[] for i in range(n+1)]
visited = [False]* (n+1) 
distance = [INF]* (n+1) # 최단 거리 테이블

for _ in range(m):
    a, b, c = map(int, input().split()) # a -> b 비용: c
    graph[a].append((b, c))
    

def get_smallest_node():
    min_value = INF
    index = 0 # 가장 최단거리가 짧은 노드
    for i in range(n+1):
        if distance[i] < min_value and not visited[i]:
            min_value = distance[i]
            index = i
    return index

def dijkstra(start):
    distance[start] = 0 # 시작 노드 초기화
    visited[start] = True
    for j in graph[start]:
        distance[j[0]] = j[1]
    
    # 시작 노드 제외한 n-1개의 노드에 대해 반복
    for i in range(n-1):
        now = get_smallest_node()
        visited[now] = True
        for j in graph[now]:
            cost = distance[now] + j[1]
            # 현재 노드를 거쳐 다른 노드로 이동하는 거리가 더 짧은 경우
            if cost < distance[j[0]]:
                distance[j[0]] = cost
                
                
# ---------------------------------------
for i in range(n+1):
    print(graph[i])

dijkstra(start)
print("distance list : ", distance)