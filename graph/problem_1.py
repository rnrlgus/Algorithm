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

n, m = map(int, input().split()) # 학생 수 / 연산 수
parent = [0] * (n+1)

for i in range(0, n+1):
    parent[i] = i
    
for i in range(m):
    oper, a, b = map(int, input().split())
    if oper == 0:
        union_parent(parent, a, b)
        
    if oper == 1:
        if find_parent(parent, a) == find_parent(parent, b):
            print("yes")
        else:
            print("no")
            
            
