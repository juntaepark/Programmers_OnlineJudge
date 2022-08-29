/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915?language=java
 */

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        // 정렬
        Collections.sort(list);
        
        for(int i = 0; i < strings.length; i++){
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        return answer;
    }
}