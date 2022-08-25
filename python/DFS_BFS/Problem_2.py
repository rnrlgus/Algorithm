from collections import deque

n, m = map(int, input().split())

graph = []
for i in range(n):
    graph.append(list(map(int, input())))
    
# 상 하 좌 우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    
    # 큐가 빌 때까지 반복
    while queue:
        x, y = queue.popleft()
        
        # 현위치에서 네 방향으로 위치 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            # 범위 벗어난 경우 무시
            if nx < 0 or nx > n-1 or ny < 0 or ny > m-1:
                continue
            
            # 벽인 경우 (0인 경우) 무시
            if graph[nx][ny] == 0:
                continue
            # 해당 노드를 최초로 방문하는 경우에만 최단 거리 기록
            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))
    return graph[n-1][m-1]

    
print(bfs(0, 0))

for i in range(n):
    print(graph[i])