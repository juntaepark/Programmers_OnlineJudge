/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940?language=java
 */

import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        // 최대공약수
        while(min != 0){
            int r = max % min;
            max = min;
            min = r;
        }
        
        answer[0] = max;
        
        //최소 공배수 = 두수의 곱 / 최대공약수
        answer[1] = n * m / max;

        return answer;
    }
}