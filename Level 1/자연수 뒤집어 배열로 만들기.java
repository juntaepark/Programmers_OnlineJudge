/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932?language=java
 */

import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        int end = arr.length - 1;
        
        for(int i = 0; i < arr.length / 2; i++){
            char temp = arr[i];
            arr[i] = arr[end - i];
            arr[end - i] = temp;
        }
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i ++){
            answer[i] = arr[i] - '0';
        }
        return answer;
    }
}