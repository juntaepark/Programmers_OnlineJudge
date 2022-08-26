/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java
 */

import java.util.*;

class Solution {
    public long solution(long n) {
        char[] str = String.valueOf(n).toCharArray();
        Arrays.sort(str);
        String ve = "";
        
        for(int i = 0; i < str.length / 2; i ++){
            char a = str[i];
            str[i] = str[str.length -i -1];
            str[str.length -i -1] = a;
        }
        
        for(int i = 0; i < str.length; i++){
            ve += str[i];
        }
        
        
        long answer = Long.parseLong(ve);
        return answer;
    }
}