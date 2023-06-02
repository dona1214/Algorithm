/*
XYZ 마트는 일정한 금액을 지불하면 10일 동안 회원 자격을 부여합니다. 
XYZ 마트에서는 회원을 대상으로 매일 한 가지 제품을 할인하는 행사를 합니다. 
할인하는 제품은 하루에 하나씩만 구매할 수 있습니다. 
알뜰한 정현이는 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입을 하려 합니다.

예를 들어, 정현이가 원하는 제품이 바나나 3개, 사과 2개, 쌀 2개, 돼지고기 2개, 냄비 1개이며,
 XYZ 마트에서 15일간 회원을 대상으로 할인하는 제품이 날짜 순서대로 치킨, 사과, 사과, 바나나, 
쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비, 바나나, 사과, 바나나인 경우에 대해 알아봅시다. 
첫째 날부터 열흘 간에는 냄비가 할인하지 않기 때문에 첫째 날에는 회원가입을 하지 않습니다. 
둘째 날부터 열흘 간에는 바나나를 원하는 만큼 할인구매할 수 없기 때문에 둘째 날에도 회원가입을 하지 않습니다. 
셋째 날, 넷째 날, 다섯째 날부터 각각 열흘은 원하는 제품과 수량이 일치하기 때문에 셋 중 하루에 회원가입을 하려 합니다.
*/

import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        int wantLength = want.length;
        for(int i = 0; i < wantLength; i++){
            wantMap.put(want[i], number[i]);
        }
        
        int discountLength = discount.length;
        for(int i = 0; i <= discountLength - 10; i++){
            Map<String, Integer> discountMap = new HashMap<>();
            for(int j = 0; j < 10; j++){
                String item = discount[i+j];
                int count = discountMap.getOrDefault(item, 0);
                count++;
                discountMap.put(item, count);
            }
            
            boolean isSignup = true;
            for(String wantItem : wantMap.keySet()){
                int wantCount = wantMap.get(wantItem);
                int discountCount = discountMap.getOrDefault(wantItem , 0);
                if(wantCount > discountCount){
                    isSignup = false;
                    break;
                }
            }
            if(isSignup){
                answer++;
            }
        }
        return answer;
    }
}