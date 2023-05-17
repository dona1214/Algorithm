/*
카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 
다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다.
갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다. 
다트 게임의 점수 계산 로직은 아래와 같다.
*/

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] round = new int[3];
        char[] carr = dartResult.toCharArray();
        int idx = -1;
        
        for(int i=0; i<carr.length; i++){
            if(carr[i] >= '0' && carr[i] <= '9'){
                idx++;
                round[idx] += Integer.parseInt(String.valueOf(carr[i]));
                if(i+1!=carr.length-1 && carr[i+1] == '0' && carr[i] == '1'){
                    round[idx] -= Integer.parseInt(String.valueOf(carr[i]));
                    round[idx] = 10;
                    i++;
                }
            }else if(carr[i] == 'D'){
                round[idx] *= round[idx];
            }else if(carr[i] == 'T'){
                round[idx] *= round[idx] * round[idx];
            }else if(carr[i] == '*'){
                if(idx > 0) round[idx-1] *=2;
                round[idx] *= 2;
            }else if(carr[i] == '#'){
                round[idx] *= -1;
            }
            
        }
        answer = round[0] + round[1] + round[2];   
        return answer;
    }
}