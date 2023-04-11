/*
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
*/

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int l = 0;
        for(int i = 0; i < commands.length; i++){
            int[] sortArrays = new int[commands[i][1] - commands[i][0]+1] ;
            int k = 0;
            
            for(int j = commands[i][0]; j <= commands[i][1]; j++){
                sortArrays[k++] = array[j-1];
            }
            Arrays.sort(sortArrays);
            answer[l++] = sortArrays[commands[i][2] - 1];
        }
        return answer;
    }
}