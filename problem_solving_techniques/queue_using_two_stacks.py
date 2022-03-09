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


class Queue:
    def __init__(self):
        self.A = Stack()
        self.B = Stack()
        
    def enqueue(self,val):
        self.A.push(val)
        print("enq ", val)
        
    def dequeue(self):
        if self.A.isEmpty() and self.B.isEmpty():
            print("EMPTY")
        
        elif not self.B.isEmpty():
            print("디큐 ", self.B.pop())
            
        else:
            while not self.A.isEmpty():
                tmp = self.A.pop()
                self.B.push(tmp)
            print("디큐 ", self.B.pop())

        
    
        
        
        
# 입력 리스트화
instructions = []
while(1):
    tmp = input()
    
    if tmp == "exit":
        break
    else:
        instructions.append(tmp)

# main
print("---------------------------------")
q = Queue()
for i in instructions:
    if i[0] == "e": # enqueue
        q.enqueue(i[-1])
    
    elif i[0] == "d": # dequeue
        q.dequeue()

