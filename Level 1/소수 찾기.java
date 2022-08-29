/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921?language=java
 */

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        for(int i = 2; i <= n; i++){
            boolean flag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){ // 나누어 떨어지면  소수 x
                    flag = false;
                    break;
                }
            }
            
            if (flag) answer++;
        }
        
        return answer;
    }
}