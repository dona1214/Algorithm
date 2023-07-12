/*
지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.

["방향 거리", "방향 거리" … ]
예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다. 로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.

주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.
*/

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int sx = 0;
        int sy = 0;
        
        char[][] arr = new char[park.length][park[0].length()];
        
        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();
            
            if(park[i].contains("S")){
                sy = i;
                sx = park[i].indexOf("S");
            }
        }
    
        for(String st : routes){
            String way = st.split(" ")[0];
            int len = Integer.parseInt(st.split(" ")[1]);
            
            int nx = sx;
            int ny = sy;
            
            for(int i = 0; i < len; i++){
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }
                if(nx >=0 && ny >=0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        break;
                    }
                    // 범위내 & 장애물 x
                    if(i == len-1){
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }       
        
        int[] answer = {sy, sx};
        return answer;
    }
}