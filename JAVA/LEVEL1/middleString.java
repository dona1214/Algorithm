/*
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
*/
class Solution {
    public String solution(String s) {
        String answer = "";
        int count = s.length();
        if(count % 2 == 1){
            answer = s.substring(count/2 , count/2+1);
        }else{
            answer = s.substring(count/2-1 , count/2+1);
        }
        return answer;
    }
}