n, m = map(int, input().split())

graph = []
for i in range(n):
    graph.append(list(map(int, input())))


print("graph : ------------------------------------------------------------")
for i in range(n):
    print(graph[i])
    
def dfs(row, col):
    # 범위를 벗어나는 경우 종료
    if row <0 or row > n-1 or col < 0 or col > m-1:
        return False
    
    # 현재 노드가 방문하지 않은 상태라면
    if graph[row][col] == 0:
        graph[row][col] = 1
        dfs(row-1, col)
        dfs(row+1, col)
        dfs(row, col-1)
        dfs(row, col+1)
        return True
    return False

result = 0
for i in range(n):
    for j in range(m):
       # 현재 위치에서 dfs 실행
       if dfs(i, j) == True:
           print(i, j) # test
           result += 1
           
print("정답 : ", result) 
        
    
    