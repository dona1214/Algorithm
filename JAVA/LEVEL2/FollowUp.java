/*
1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 영어 끝말잇기는 다음과 같은 규칙으로 진행됩니다.

1. 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
2. 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
3. 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
4. 이전에 등장했던 단어는 사용할 수 없습니다.
5. 한 글자인 단어는 인정되지 않습니다.
6. 다음은 3명이 끝말잇기를 하는 상황을 나타냅니다.
*/

import java.util.Arrays;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String[] tmpWords = new String[words.length];
        String tmpLastWord = words[0].substring(0,1);
        for(int i=0; i< words.length; i++){
            if(words[i].length() == 1){break;}
            if(Arrays.asList(tmpWords).contains(words[i])){                
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            }
            if(!tmpLastWord.equals(words[i].substring(0,1))){
                System.out.println(tmpLastWord);
                System.out.println(words[i].substring(0,1));
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            }
            if(answer[1] == 0){answer[1] = answer[0];}
            tmpWords[i] = words[i];
            tmpLastWord = words[i].substring(words[i].length() - 1);
        }

        return answer;
    }
}