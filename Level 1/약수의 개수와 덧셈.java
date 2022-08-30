/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884?language=java
 */

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        
        for(int i=left; i <=right; i++){
            int value = 0;
            for(int j=1; j<=i; j++){
                if (i % j == 0) value++;
            }
            answer += value % 2 == 0 ? i : -i;
        }
        
        return answer;
    }
}