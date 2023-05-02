/*
수웅이는 매달 주어진 음식을 빨리 먹는 푸드 파이트 대회를 개최합니다. 
이 대회에서 선수들은 1대 1로 대결하며, 매 대결마다 음식의 종류와 양이 바뀝니다.
 대결은 준비된 음식들을 일렬로 배치한 뒤, 한 선수는 제일 왼쪽에 있는 음식부터 오른쪽으로, 
다른 선수는 제일 오른쪽에 있는 음식부터 왼쪽으로 순서대로 먹는 방식으로 진행됩니다. 
중앙에는 물을 배치하고, 물을 먼저 먹는 선수가 승리하게 됩니다
*/

class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] / 2 >= 1){
                for(int j = 0; j < food[i] / 2; j++){
                    answer += i;    
                }
            }
        }
        answer += "0";
        for(int k = answer.length() - 2; k >= 0; k--){
            answer += answer.charAt(k);
            
        }
        return answer;
    }
}