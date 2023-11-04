import calendar
def solution(a, b):
    answer = ''
    day = calendar.weekday(2016, a, b)
    if day == 0:
        answer = "MON"
    elif day == 1:
        answer = "TUE"
    elif day == 2:
        answer = "WED"
    elif day == 3:
        answer = "THU"
    elif day == 4:
        answer = "FRI"
    elif day == 5:
        answer = "SAT"
    elif day == 6:
        answer = "SUN"
    return answer