# lambda = 익명의 함수를 지칭하는 용어
# lambda 매개변수 : 표현식
print( (lambda x : x + 10) (1))

print( (lambda x, y : x + y) (1,2))

print(list(map(lambda x: x ** 2, range(5))))

a = [8, 4, 2, 5, 2, 7, 9, 11, 26, 13]
result = list(filter(lambda x : x > 7 and x < 15, a))
print(result)


# sort 함수 prototype: <list>.sort(key = <function>, reverse = <bool>)
# sorted 함수 prototype: sorted( <list> , key = <function> , reverse = <bool>)

data = [ ["고구마",25000], ["바나나",123232], ["파인애플",4500], ["감자",3000], ["금귤",6000] ]
data.sort(key = lambda x:x[1])
print(data)


data = ["나라","가구","봄","가을","도토리","낫","혹","가을 아침","나는 밥을 먹고 있다."]
data.sort(key = lambda x: len(x) )
print(data)
