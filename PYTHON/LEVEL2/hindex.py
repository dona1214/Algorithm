def solution(citations):
    answer = 0
    count  = 0
    citations.sort()
    for i in range(len(citations)):
        count = len(citations) - i
        if citations[i] >= count:
            answer = count
            break
    return answer
