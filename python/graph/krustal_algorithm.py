# 최소 신장 트리 찾을 때 사용


# 특정 원소가 속한 집합 찾기
def find_parent(parent, x):
    # 루트 노드가 아닐 때 루트 노드를 찾을 때까지 재귀적으로 호출
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]

# 두 원소가 속한 집합 합치기
def union_parent(parent, a, b):
    a = find_parent(parent, a)
    b = find_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b
        
v, e = map(int, input().split()) # vertex, edge(간선)
parent = [0]*(v+1)

edges = []
result = 0

for i in range(1, v+1):
    parent[i] = i

for _ in range(e):
    a, b, cost = map(int, input().split())
    edges.append( (cost,a,b) ) # 비용 순으로 정렬하기 위해 앞의 순서로

edges.sort() # 비용 순으로 정렬

for edge in edges:
    cost, a, b = edge
    
    # 사이클이 발생하지 않을 때만 집합에 포함
    if find_parent(parent, a) != find_parent(parent, b):
        union_parent(parent, a, b)
        result += cost
        
print(result)
    
        