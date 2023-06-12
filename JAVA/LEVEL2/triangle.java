/*
위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다. 
아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다. 
예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.

삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 거쳐간 숫자의 최댓값을 return 하도록 solution 함수를 완성하세요.
*/

import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] temp = new int[triangle.length][triangle[triangle.length-1].length];
        temp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            temp[i][0] = temp[i - 1][0] + triangle[i][0];
            temp[i][i] = temp[i - 1][i - 1] + triangle[i][i];
            for (int j = 1; j <= i-1; j++) {
                temp[i][j] = Math.max(temp[i - 1][j - 1], temp[i - 1][j]) + triangle[i][j];
                answer = Math.max(answer, temp[i][j]);
            }
        }
        return answer;
    }
}