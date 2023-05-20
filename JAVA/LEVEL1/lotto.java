/*
로또 6/45(이하 '로또'로 표기)는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권입니다. 아래는 로또의 순위를 정하는 방식입니다. 1

*/

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int match_cnt = 0;
        int zero_cnt = 0;
        
        for(int i = 0; i<lottos.length; i++) {
            if(lottos[i] == 0) zero_cnt++;
            for(int j=0; j<win_nums.length; j++){
                if(win_nums[j] == lottos[i]){
                    match_cnt++;
                    break;
                }
            }
        }
        
        answer[0] = Math.min(7-(zero_cnt+match_cnt),6);
        answer[1] = Math.min(7-match_cnt,6);
        return answer;
    }
}