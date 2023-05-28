/*
카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어, 
카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다. 
"네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 
입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
다음은 카카오 아이디의 규칙입니다.
*/

class Solution {
    public String solution(String new_id) {
        String id = new_id.toLowerCase();
        id = id.replaceAll("[^-_.a-z0-9]", "");
        id = id.replaceAll("[.]{2,}",".");
        id = id.replaceAll("^[.]|[.]$", "");
        
        if(id.equals(""))
            id += "a";
        
        if(id.length() >= 16){
            id = id.substring(0, 15);
            id = id.replaceAll("^[.]|[.]$", "");
        }
        
        if(id.length() <= 2){
            while(id.length() < 3){
                id += id.charAt(id.length() -1 );
                
            }
        }
        
        return id;
    }
}