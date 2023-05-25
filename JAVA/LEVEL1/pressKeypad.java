/*
엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
*/

import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHand = 10;
        int rightHand = 12;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                leftHand = numbers[i];
                answer += "L";
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                rightHand = numbers[i];
                answer += "R";
            }else{
                if(numbers[i] == 0) numbers[i] = 11;
                
                int leftdist = Math.abs(numbers[i] - leftHand)/3 + Math.abs(numbers[i] - leftHand)%3;
                int rightdist = Math.abs(numbers[i] - rightHand)/3 + Math.abs(numbers[i] - rightHand)%3;
                
                if(leftdist < rightdist){
                    leftHand = numbers[i];
                    answer += "L";
                }else if(leftdist > rightdist){
                    rightHand = numbers[i];
                    answer += "R";
                }else{
                    if(hand.equals("left")){
                        leftHand = numbers[i];
                        answer += "L";
                    }else{
                        rightHand = numbers[i];
                        answer += "R";
                    }
                }
            }
        }
        return answer;
    }
}