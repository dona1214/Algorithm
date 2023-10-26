def solution(s):
    answer = ''
    list = s.split(' ')
    for i in range(len(list)):
        list[i] = list[i].capitalize()
    answer = ' '.join(list)
    
    return answer