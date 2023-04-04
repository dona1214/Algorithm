/*
수포자는 수학을 포기한 사람의 준말입니다. 
수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
*/


import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] correct = {0,0,0};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == first[i%5]) correct[0]++;
            if(answers[i] == second[i%8]) correct[1]++;
            if(answers[i] == third[i%10]) correct[2]++;
        }
        
        int max = Math.max(correct[0], Math.max(correct[1] , correct[2]));
        List<Integer> supo = new ArrayList<Integer>();
        for(int i=0; i<correct.length; i++) if(max == correct[i]) supo.add(i+1);
        
        int[] answer = new int[supo.size()];
        for(int i=0; i<supo.size(); i++){
            answer[i] = supo.get(i);
        }
        return answer;
    }
}