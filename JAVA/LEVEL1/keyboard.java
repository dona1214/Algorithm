/*
휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당될 수 있습니다. 
키 하나에 여러 문자가 할당된 경우, 동일한 키를 연속해서 빠르게 누르면 할당된 순서대로 문자가 바뀝니다.

예를 들어, 1번 키에 "A", "B", "C" 순서대로 문자가 할당되어 있다면 1번 키를 한 번 누르면 "A", 
두 번 누르면 "B", 세 번 누르면 "C"가 되는 식입니다.
*/

import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int[] answer = new int[targets.length];
        
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                if(!hm.containsKey(c) || i < hm.get(c)){
                    hm.put(c, i+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            int cnt = 0;
            for(int j = 0; j < targets[i].length(); j++){
                char c = targets[i].charAt(j);
                if(!hm.containsKey(c)){
                    cnt = 0;
                    break;
                }else{
                    cnt += hm.get(c);
                }
            }
            answer[i] = cnt==0?-1:cnt;
        }
        return answer;
    }
}