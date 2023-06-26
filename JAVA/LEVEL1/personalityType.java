/*
나만의 카카오 성격 유형 검사지를 만들려고 합니다.
성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분합니다. 성격은 각 지표에서 두 유형 중 하나로 결정됩니다.

지표 번호	성격 유형
1번 지표	라이언형(R), 튜브형(T)
2번 지표	콘형(C), 프로도형(F)
3번 지표	제이지형(J), 무지형(M)
4번 지표	어피치형(A), 네오형(N)
4개의 지표가 있으므로 성격 유형은 총 16(=2 x 2 x 2 x 2)가지가 나올 수 있습니다. 예를 들어, "RFMN"이나 "TCMA"와 같은 성격 유형이 있습니다.

검사지에는 총 n개의 질문이 있고, 각 질문에는 아래와 같은 7개의 선택지가 있습니다.
*/

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> mapList = new HashMap<>();
        
        for(int i = 0; i < survey.length; i++){
            int value = choices[i];
            if(value > 0 && value < 4){
                char ch = survey[i].charAt(0);
                mapList.put(ch,mapList.getOrDefault(ch, 0) + 4 - value);
            }else if(value > 4){
                char ch = survey[i].charAt(1);
                mapList.put(ch,mapList.getOrDefault(ch, 0) + value -4);
            }
        }
         return new StringBuilder()
            .append(mapList.getOrDefault('R', 0) >= mapList.getOrDefault('T', 0) ? 'R' : 'T')
            .append(mapList.getOrDefault('C', 0) >= mapList.getOrDefault('F', 0) ? 'C' : 'F')
            .append(mapList.getOrDefault('J', 0) >= mapList.getOrDefault('M', 0) ? 'J' : 'M')
            .append(mapList.getOrDefault('A', 0) >= mapList.getOrDefault('N', 0) ? 'A' : 'N')
            .toString();
    }
}