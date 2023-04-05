/*
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파
벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
*/

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] splitS = s.split("");
        int count = 0;
        for(int i = 0; i < splitS.length; i++){
            if(splitS[i].equals(" ")){
                count = 0;
            }else if(count % 2 == 0 ){
                splitS[i] = splitS[i].toUpperCase();
                count++;
            }else if(count % 2 != 0 ){
                splitS[i] = splitS[i].toLowerCase();
                count++;
            }
            answer += splitS[i];
        }
        return answer;
    }
}