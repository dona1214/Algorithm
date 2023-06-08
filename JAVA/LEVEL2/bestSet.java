import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        int count = s % n;
        if(s < n){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = (s / n);
            if(count != 0){
                answer[i] += 1;
                count--;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}