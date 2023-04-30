/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
*/

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        
        for(int i = str.length()-1; i >= 0; i-- ){
            answer[str.length()-1-i] = str.charAt(i)-'0';
        }
        return answer;
    }
}