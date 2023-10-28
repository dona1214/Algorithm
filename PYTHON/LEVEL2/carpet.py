def solution(brown, yellow):
    answer = [0,0]
    total = brown + yellow
    for i in range(3, total):
        if total % i == 0 and total / i >= 3:
            col = max(i, total / i)
            row = min(i, total / i)
            center = (col - 2) * (row - 2)
            if center == yellow:
                answer[0]=col
                answer[1]=row
    return answer