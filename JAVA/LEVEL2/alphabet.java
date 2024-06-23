import java.util.*;
class Solution {
    public int[] solution(String msg) {
        ArrayList<String> dictionary = new ArrayList<String>();
        ArrayList<Integer> result = new ArrayList<Integer>();
    
        for(int i = 0 ; i < 26; i++) {
            dictionary.add(String.valueOf((char)('A'+i)));
        }
        
        for(int i = 0; i < msg.length(); i++){
            for(int j = dictionary.size() -1; j >= 0; j--){
                if(msg.substring(i).startsWith(dictionary.get(j))){
                    i += dictionary.get(j).length() -1;
                    result.add(j+1);
                    if(i+1 < msg.length()){
                        dictionary.add(dictionary.get(j)+msg.charAt(i+1));                        
                    }
                    break;
                    
                }
            }
            
            
        }
        
        int[] answer = new int[result.size()];
        for(int k = 0; k < result.size(); k++){
            answer[k] = result.get(k);
        }
        return answer;
    }
}