/*
과일 장수가 사과 상자를 포장하고 있습니다. 
사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, 
k점이 최상품의 사과이고 1점이 최하품의 사과입니다. 
사과 한 상자의 가격은 다음과 같이 결정됩니다.

*/

import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] scoreArray = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreArray, Collections.reverseOrder());
        
        for(int i=0; i<scoreArray.length; i++){
            if((i+1) % m == 0) answer += scoreArray[i] * m;
        }
        
        return answer;
    }
}