def makeTree(graph):
    for i in range(len(edges)):
        if edges[i][0] not in graph:
            graph[edges[i][0]] = [edges[i][1]]
        else: graph[edges[i][0]].append(edges[i][1])
    return graph

def solution(graph, start_node):
    visit = []
    stack = []
    
    stack.append(start_node)
    
    while(stack):
        node = stack.pop()
        if node not in visit:
            visit.append(visit)
            stack.extend(graph[node])
    return visit

# main
n, q = map(int, input().split())
edges = []
querys = []
for i in range(n-1):
    edges.append(list(map(int, input().split())))
for i in range(q):
    querys.append(list(map(int, input().split())))
    

graph = {} # 트리
graph = makeTree(graph)
print(graph)
keys = list(graph.keys())

print(solution(graph, keys[0]))
