/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java
 */

import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        // 1.response해야할 배열의 크기를 알 수 없어 ArrayList를 활용
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int value = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != value){
                answerList.add(arr[i]);
                value = arr[i];
            }
        }
        
        // 2. ArrayList -> 배열 변환
        int[] answer = new int[answerList.size()];
        int i = 0;
        for(Integer temp : answerList) answer[i++] = temp;
        
        return answer;
    }
}