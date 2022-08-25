# 먼저 입력받은 엣지들을 사용해 인접 리스트 모양의 트리를 만들었다. ([[], [2, 3, 4, 5], [6], [], [7, 8, 9], [], [], [], [], []])
# 그리고 dfs 방식으로 트리의 preorder, postorder 순회 함수를 작성했다. 
# 마지막으로 각 함수들을 통해 순회 결과를 얻은 후 조상인지 아닌지 확인하는 함수를 통해 True인 질의의 개수를 출력했다.

# 종합적인 시간복잡도 : O(n + (n-1))

# 엣지들을 통해 각 인덱스가 노드의 변호가 되고 각 자식 노드들을 원소로 갖는 리스트 만들기
def makeTree(edges): # 루트 노드는 1번 노드
    # tree = [[]]*(n+1) 이렇게 하면 모든 행이 같은 객체로 인식되기 때문에 하나의 리스트에 값을 넣어도 모든 내부 리스트에 적용됨
    # O(n)
    tree = [[] for _ in range(n+1)]
    # O(n)
    for i in edges:
        tree[i[0]].append(i[1])

    return tree

# preorder, postorder 함수의 경우 인접 리스트 형태의 그래프를 dfs를 사용해 탐색했기 때문에 둘다
# 시간복잡도의 경우 O(n+(n-1))이다. (n개의 노드, n-1개의 edges) 
def preOrder(tree, v, visited):
    visited[v] = True
    pre.append(v)
    for i in tree[v]:
        if not visited[i]:
            preOrder(tree, i, visited)

# O(n+(n-1))    
def postOrder(tree, v, visited):
    visited[v] = True
    for i in tree[v]:
        if not visited[i]:
            postOrder(tree, i, visited)
    post.append(v)

# O(n)
def solution(pre, post):
    cnt = 0
    for i in querys:
        if (pre.index(i[0]) < pre.index(i[1]) and post.index(i[0]) > post.index(i[1])) or i[0] == i[1]:
            cnt += 1
    return cnt
            

# main
n, q = map(int, input().split())
edges = []
querys = []
for i in range(n-1):
    edges.append(list(map(int, input().split())))
for i in range(q):
    querys.append(list(map(int, input().split())))

tree = makeTree(edges)

visited1 = [False]*(n+1)
visited2 = [False]*(n+1)
pre = []
post = []

preOrder(tree, 1, visited1)
postOrder(tree, 1, visited2)

print(solution(pre, post))