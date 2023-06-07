import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> answerBefore = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int count = 0;   
            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                count++;
            }
            answerBefore.add(count);
        }
        int x = answerBefore.get(0);
        int day = 1;
        for(int i = 1; i < progresses.length;i++){
            if(x >= answerBefore.get(i)){
                day+=1;
            }else{
                list.add(day);
                day = 1;
                x = answerBefore.get(i);
            }
        }
        list.add(day);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}