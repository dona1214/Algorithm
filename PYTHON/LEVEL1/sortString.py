def solution(strings, n):
    list = []
    answer = []
    for i in range(len(strings)):
        list.append(strings[i][n:n+1])
    

    strings.sort()
    list.sort()
    
    for j in range(len(list)):
        for i in range(len(strings)):
            if strings[i][n:n+1] == list[j]:
                if strings[i] not in answer:
                    answer.append(strings[i])  
    return answer