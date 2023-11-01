def solution(n):
    answer = 0
    tmp = []
    tmp.append(0)
    tmp.append(1)
    tmp.append(2)
    for i in range(3,2001):
        tmp.append((tmp[i-2] + tmp[i-1]) % 1234567)
    
    answer = tmp[n]
    return answer