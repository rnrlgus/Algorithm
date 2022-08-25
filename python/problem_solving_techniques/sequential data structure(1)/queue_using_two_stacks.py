# 먼저 두개의 스택으로 큐를 구현하기 위해서는 하나의 스택(A)에 enqueue한 값들을 push하고
# dequeue할 때 스택 B가 비어있을 때는 스택 A에 있던 값들을 모두 차례대로 pop한 후 스택 B에 push하고 난 후
# 스택 B에서 pop을 하면 큐의 dequeue기능을 할 수 있게 된다. 스택 B가 비어있지 않을 때는 pop만 해주면 된다. 

# 즉 스택 A에 원소들을 push하고 그 값들을 차례대로 스택 B에 push 함으로써 스택의 원소들을 역순으로 만드는 것이 포인트다.

# enqueue의 경우 스택 A에 push해줬다. - O(1)
# dequeue의 경우 
#     (1) 스택 A, B 둘다 비어있을 때 : empty 출력 - O(1)
#     (2) 스택 B가 비어있지 않을 때 : 스택 B에서 pop한다. - O(1)
#     (3) 스택 B가 비어있을 때 : 스택 A의 값들을 차례대로 pop, B로 push한 후 pop - O(n)
    
# 따라서 enqueue의 경우 O(1)을 보장, dequeue의 경우 O(n)을 보장한다.
# enqueue, dequeue 둘 다 O(1)을 보장하게 하는 법은 찾지 못했습니다.
# 아무리 생각해도 스택을 역순으로 저장할 때 O(1)로 구현할 방법이 없다고 생각합니다.


class Stack:
    def __init__(self):
        self.items = []
        
    # 모든 함수 O(1)
    def push(self, val):
        self.items.append(val)
        
    def pop(self):
        try:
            return self.items.pop()
        except IndexError:
            print("Stack is empty")
            
    def top(self):
        try:
            return self.items[-1]
        except IndexError:
            print("Stack is empty")
            
    def __len__(self):
        return len(self.items)
    
    def isEmpty(self):
        return self.__len__() == 0

# enqueue : O(1), dequeue : O(n)
class Queue:
    def __init__(self):
        self.A = Stack()
        self.B = Stack()
        
    def enqueue(self,val):
        self.A.push(val)
        
    def dequeue(self):
        # 둘다 비어있을 때
        if self.A.isEmpty() and self.B.isEmpty():
            print("EMPTY")
        # B가 비어있지 않을 때
        elif not self.B.isEmpty():
            print(self.B.pop())
        
        # B가 비어있을 때
        else:
            while not self.A.isEmpty():
                tmp = self.A.pop()
                self.B.push(tmp)
            
            print(self.B.pop())
        
# 입력 리스트화
instructions = []
while(1):
    tmp = input()
    
    if tmp == "exit":
        break
    else:
        instructions.append(tmp)

# main
q = Queue()
for i in instructions:
    if i[0] == "e": # enqueue
        a, b = i.split()
        q.enqueue(int(b))
    
    elif i[0] == "d": # dequeue
        q.dequeue()