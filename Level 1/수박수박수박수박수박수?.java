/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922?language=java
 */

class Solution {
    public String solution(int n) {
        String answer = "";
        
        boolean x = true;
        for(int i = 0; i < n; i++){
            answer += x ? "수" : "박";
            x = x ? false : true;
        }

        return answer;
    }
}