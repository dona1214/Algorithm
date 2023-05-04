/*
사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 
사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다. 
예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 
각 인물의 그리움 점수가 [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다. 
다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고 ["kali", "mari", "don"]의 
그리움 점수가 각각 [11점, 1점, 55점]]이고, "tony"는 그리움 점수가 없을 때, 
이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.
*/

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                for(int k = 0; k < name.length; k++){
                    if(photo[i][j].equals(name[k])){
                        sum += yearning[k];
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}