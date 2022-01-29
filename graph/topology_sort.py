# 목적: 방향 그래프의 방향성에 거스르지 않도록 순서대로 나열하는 것 ex) 선수 과목

from collections import deque

v, e = map(int, input().split()) # vertex, edge

indegree = [0]*(v+1) # 집입 차수
graph = [[] for _ in range(v+1)]


for _ in range(e):
    a, b = map(int, input().split())
    graph[a].append(b)
    indegree[b] += 1
    
def topology_sort():
    result = []
    q = deque()
    
    for i in range(1, v+1):
        if indegree[i] == 0:
            q.append(i)
            
    while(q):
        now = q.popleft()
        result.append(now)
        
        for i in graph[now]:
            indegree[i] -= 1
            if indegree[i] == 0:
                q.append(i)
                
    for i in result:
        print(i, end=' ')
        
topology_sort()