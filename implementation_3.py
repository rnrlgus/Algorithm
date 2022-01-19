position = input()
row = int(position[1])
col = ord(position[0]) - ord('a') + 1
result = 0

# nRow, nCol = 0, 0

# (row, col)
steps = [(-2,-1), (-2, 1), (-1, -2), (-1, 2), (1, -2), (1, 2), (2, -1), (2, 1)]
for step in steps:
    nRow = row + step[0]
    nCol = col + step[1]
    
    if (nRow >=1 and nRow <= 8 and nCol >=1 and nCol <= 8):
        result += 1

print(result)
print(type(steps[0]))


# ord('문자') 함수를 처음 써봤다. 이 함수는 인자로 받은 문자의 아스키 코드 값을 정수 형태로 반환해주는 기능을 한다.
# 구현할 때 위의 나이트의 동선과 같이 가지수가 많지 않은 경우 steps와 같이 리스트 형태로 만들어 사용하는 것이 편리한 듯 하다.
# 튜플의 경우 원소 값의 수정이 불가능하다. (삭제 / 값 변경 / 요소 추가)
# 여기서도 체스판 밖으로 나갈 경우들을 예외처리하기 위해 nRow, nCol 임시 변수를 사용했다.