/*
운영체제의 역할 중 하나는 컴퓨터 시스템의 자원을 효율적으로 관리하는 것입니다. 이 문제에서는 운영체제가 다음 규칙에 따라 프로세스를 관리할 경우 특정 프로세스가 몇 번째로 실행되는지 알아내면 됩니다.
*/
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //우선순위 큐를 내림차순 정렬로 설정한다.
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) { //priorities의 값이 현재 오름차순 우선순위가 제일 높은 값과 같은지 확인한다.
                    if (i == location) {
                        answer++;
                        return answer;
                    }   
                    pq.poll();
                    answer++;
                }
            }
        }
        return -1;
    }
}