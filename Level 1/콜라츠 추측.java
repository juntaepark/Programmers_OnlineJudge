/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943?language=java
 */

class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            
            ++answer;
            if (answer >= 500) return -1;
        }
        
        return answer;
    }
}