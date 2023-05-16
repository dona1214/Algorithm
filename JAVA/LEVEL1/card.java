/*
코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다. 
코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.

원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
한 번 사용한 카드는 다시 사용할 수 없습니다.
카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
*/

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int card1Count = 0;
        int card1CountMax = cards1.length;
        int card2Count = 0;
        int card2CountMax = cards2.length;
        
        for (int i = 0; i < goal.length; i++) {
            String goalWord = goal[i];
            if (card1Count < card1CountMax && goalWord.equals(cards1[card1Count])) {
                card1Count++;
            } else if (card2Count < card2CountMax && goalWord.equals(cards2[card2Count])) {
                card2Count++;
            } else {
                answer = "No";
                return answer;
            }
        }
        return answer;
    }
}