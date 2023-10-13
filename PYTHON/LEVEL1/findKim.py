def solution(seoul):
    answer = ''
    for i in range(len(seoul)):
        if seoul[i] in "Kim":
            answer = i 
    return "김서방은 " + str(answer) + "에 있다"