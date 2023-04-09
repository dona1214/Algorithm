/*
명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 
다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 
이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
*/

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int heigth = 0;
         for(int i=0;i<sizes.length;i++){
            int v=Math.max(sizes[i][0],sizes[i][1]);
            int h=Math.min(sizes[i][0],sizes[i][1]);
            width=Math.max(width,v);
            heigth=Math.max(heigth,h);
        }
        answer = width * heigth;
        return answer;
    }
}