/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612?language=java
 */

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i = 1; i <= count; i++){
            answer += price * i;
        }

        answer = money - answer < 0 ? (answer - money) : 0; 
        
        return answer;
    }
}