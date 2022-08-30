/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644?language=java
 */

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int len = numbers.length;
        int temp = 0;
        
        for (int i = 0; i < len-1; i++){
            for(int j = i+1; j < len; j++){
                temp = numbers[i] + numbers[j];
                if (arr.indexOf(temp) < 0){
                    arr.add(temp);   
                }
            }
        }
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }

        Arrays.sort(answer);
        
        return answer;
    }
}