# <동작방식>
# 먼저 스택을 2개 사용했다.
# 1번 스택에는 일반 스택처럼 push해준다.
# 2번 스택의 경우 push의 인자를 매번 maximum 변수에 저장하고 
# push할 때 2번 스택의 top 값과 비교해 최대값을 업데이트해준 후 push한다.
# 결론적으로 1번 스택에는 push한 값들이 그대로 삽입되고, 2번 스택에는 메번 최대값을 삽입하는 것이다.
# 이렇게 하면 최대값을 찾을 때 2번 스택의 top값을 꺼내기만 하면 된다.

# <수행시간 분석>
# O(1)
# 2번 스택의 경우 매번 push를 할 때 단순히 값을 비교한 후 삽입하는 방식이기 때문에 상수시간에 실행 가능하다.
# getMax함수 또한 스택의 top함수를 호출해 값을 가져오기 때문에 상수시간에 실행 가능하다.


class Stack:
    def __init__(self):
        self.items = []
        
    # 모든 함수 O(1)
    def push(self, val):
        self.items.append(val)
        
    def pop(self):
        return self.items.pop()

    def top(self):
        try:
            return self.items[-1]
        except IndexError:
            print("EMPTY")
            
    def __len__(self):
        return len(self.items)
    
    def isEmpty(self):
        return self.__len__() == 0     
    
    
class MaxStack():
    def __init__(self):
        self.maximum = None
        self.stk = Stack()
        self.maxStk = Stack()
        
    def push(self, val):
        self.maximum = val
        if not self.maxStk.isEmpty() and self.maximum < self.maxStk.top():
            self.maximum = self.maxStk.top()
            
        self.stk.push(val)
        self.maxStk.push(self.maximum)
        
    def getMax(self):
        if self.maxStk.isEmpty():
            print("EMPTY")
        else:
            print(self.maxStk.top())
    
    def pop(self):
        try:
            print(self.stk.pop())
            self.maxStk.pop()
        except:
            print("EMPTY")
        

# main
instructions = []
while(1):
    tmp = input()
    
    if tmp == "exit":
        break
    else:
        instructions.append(tmp)

ms = MaxStack()
for i in instructions:
    if i[1] == 'u': # push
        a, b = i.split()
        ms.push(int(b))
    if i[1] == 'o' : # pop
        ms.pop()
    if i[0] == 'm' : # max
        ms.getMax()
