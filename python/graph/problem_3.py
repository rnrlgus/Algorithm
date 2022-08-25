from collections import deque
import copy

v = int(input())
indegree = [0]*(v+1) # 집입 차수
graph = [[] for _ in range(v+1)]
time = [0]*(v+1) # 강의 시간

for i in range(1, v):
    data = list(map(int, input().split()))
    time[i] = data[0]
    for x in data[1::-1]:
        graph[x].append(i)
    
def topology_sort():
    result = copy.deepcopy(time)
    q = deque()
    
    for i in range(1, v+1):
        if indegree[i] == 0:
            q.append(i)
            
    while(q):
        now = q.popleft()
        result.append(now)
        
        for i in graph[now]:
            result[i] = max(result[i], result[now] + time[i])
            indegree[i] -= 1
            if indegree[i] == 0:
                q.append(i)
                
    for i in result:
        print(result[i])
        
topology_sort()