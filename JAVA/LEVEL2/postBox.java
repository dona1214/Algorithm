import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int[] priority = new int[order.length];
        Stack<Integer> stack = new Stack<>();
       
        for (int k = 0; k < order.length; k++){
            priority[order[k] - 1] = k;
        }
        for(int i = 0; i < priority.length; i++){
            if(priority[i] == answer){
                answer++;
            }else{
                stack.push(priority[i]);
            }
           
            while(!stack.isEmpty() && stack.peek() == answer){
                stack.pop();
                answer++;
            }
        }
       
        return answer;
    }
}
