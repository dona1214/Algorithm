def solution(n):
    f = []
    for i in range(n+1):
        if i == 0:
            f.append(0)
        elif i == 1:
            f.append(1)
        else:
            f.append((f[i-2]+f[i-1])%1234567)
    answer = f[n] % 1234567
    return answer