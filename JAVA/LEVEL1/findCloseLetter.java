/*
문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 
자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.
*/

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            if(i !=0){
                int idx = s.substring(0,i).lastIndexOf(s.charAt(i));
                if(idx != -1){
                    answer[i] = i-idx;
                    
                }
                else{
                    answer[i] = idx;
                }
            }
            else{
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}