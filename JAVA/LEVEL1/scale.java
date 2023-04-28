/*
자연수 n이 매개변수로 주어집니다. 
n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> scale = new ArrayList<>();
        while(n > 0){
            scale.add(n % 3);
            n /= 3;
        }
        
        String scaleStr = "";
        for(int i = 0; i <scale.size(); i++){
            scaleStr += scale.get(i);
            
        }
        System.out.println(scaleStr);
        answer = Integer.parseInt(scaleStr, 3);
        return answer;
    }
}