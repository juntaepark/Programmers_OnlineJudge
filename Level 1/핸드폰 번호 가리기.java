/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948?language=java
 */

import java.util.*;

class Solution {
    public String solution(String phone_number) {
        char[] temp = phone_number.toCharArray();
        
        for(int i = 0; i < temp.length - 4; i++){
            temp[i] = '*';
        }
        
        return String.valueOf(temp);
    }
}