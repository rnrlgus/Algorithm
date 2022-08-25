# preOrder 순회를 통해 얻은 preorder 리스트와 이를 통해 얻은 preorder 순서의 cost 리스트를 구한 뒤
# k번 노드의 subtree를 구하기 위해 dfs 탐색을 진행해 subtree의 노드 수 를 구했다.
# 앞의 정보들을 활용해 subtree의 코스트를 계산했다. 
# update 쿼리의 경우 preorder 리스트에서 업데이트할 노드의 인덱스를 찾은 뒤 cost 리스트에서 update해줬다. 
# 총 시간복잡도: O(n + n-1)


# 엣지들을 통해 각 인덱스가 노드의 변호가 되고 각 자식 노드들을 원소로 갖는 리스트 만들기
def makeTree(edges): # 루트 노드는 1번 노드
    # O(n)
    tree = [[] for _ in range(n+1)]
    # O(n)
    for i in edges:
        tree[i[0]].append(i[1])

    return tree

# preorder 함수의 경우 인접 리스트 형태의 그래프를 dfs를 사용해 탐색했기 때문에 둘다
# 시간복잡도의 경우 O(n+(n-1))이다. (n개의 노드, n-1개의 edges)   
def preOrder(tree, v, visited):
    visited[v] = True
    pre.append(v)
    for i in tree[v]:
        if not visited[i]:
            preOrder(tree, i, visited)
            
def getSubnum(tree, k, visited):
    global tmp
    visited[k] = True
    pathSum[k] = tmp + cost[k]
    
    for i in tree[k]:
        if not visited[i]:
            tmp += cost[k]
            
            getSubnum(tree, i, visited)
    tmp = 0

#main

#input
n, q = map(int, input().split())
cost = [0]
cost += list(map(int, input().split()))
edges = []
for i in range(n-1):
    edges.append(list(map(int, input().split())))
queries = []
for i in range(q):
    queries.append(input())

# variables
pre = [0]
pathSum = [0 for _ in range(n+1)]
tmp = 0

tree = makeTree(edges)
visited = [False]*(n+1)
preOrder(tree, 1, visited)

print("-------------")
print("cost: ",cost)
print("pre: ",pre)
print("-------------")
visited = [False]*(n+1)
getSubnum(tree, 1, visited)
print(pathSum)

#print(queries)
# for i in queries:
#     if i[0] == "s":
#         #print("query: ",i)
#         s, root = i.split()
#         tmp = []
#         print(getSubcost(tree, int(root)))
#     else:
#         u, f, t = i.split()
#         preCost[pre.index(int(f))] += int(t)