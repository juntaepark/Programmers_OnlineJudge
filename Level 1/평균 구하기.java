/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=java
 */

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int i = 0;
        for(i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        answer /= i;
        
        return answer;
    }
}