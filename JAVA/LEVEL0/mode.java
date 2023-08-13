/*
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
*/

class Solution {
    public int solution(int[] array) {
        int answer = array[0];
        int max = 0; int frequent[] = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            frequent[array[i]]++;
            
            if(max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0; // 여러 개인 지
        for(int j = 0; j < 1000; j++) {
            if(max == frequent[j]) temp++;
            if(temp > 1) answer = -1;
        }
        
        return answer;
    }
}