/*
당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 
홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 
따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다. 
예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 
각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리, 
1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다. 
이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
*/

import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);    
        int[] tmp = Arrays.stream(nums).distinct().toArray();
        
        if((nums.length / 2) <= tmp.length){
            answer = nums.length / 2;
        }else{
            answer = tmp.length;
        }
        
        return answer;
    }
}