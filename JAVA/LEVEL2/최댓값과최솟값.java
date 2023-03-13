/*
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
*/


class Solution {
    public String solution(String s) {
        String answer = "";
        String min = s.split(" ")[0];
        String max = s.split(" ")[s.split(" ").length - 1];
        
        for(int i=0; i < s.split(" ").length; i++){
            if(Integer.valueOf(min) > Integer.valueOf(s.split(" ")[i])){
                min = s.split(" ")[i];
            }
            if(Integer.valueOf(max) < Integer.valueOf(s.split(" ")[i])){
                max = s.split(" ")[i];
            }
        }
        answer = min + " " + max;
        return answer;
    }
}