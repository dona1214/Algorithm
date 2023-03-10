/*
두 정수 left와 right가 매개변수로 주어집니다.
left부터 right까지의 모든 수들 중에서,
약수의 개수가 짝수인 수는 더하고, 
약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
*/

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = right - left + 1;
        for(int i = 0; i < count; i++){
            int number = left + i;
            int divisor = 0;
            for(int j = 1; j <= number; j++){
                if(number%j == 0){
                    divisor += 1;
                }
            }
            if(divisor % 2 == 0){
                answer += number;
            }else if(divisor % 2 == 1){
                answer -= number;
            }
        }
        return answer;
    }
}