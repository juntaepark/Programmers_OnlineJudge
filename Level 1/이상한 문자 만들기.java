/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930?language=java
 */

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int idx = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == ' '){
                answer += s.charAt(i);
                idx = 0;
            } else{
                answer += idx % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
                idx++;
            }
        }
        
        return answer;
    }
}