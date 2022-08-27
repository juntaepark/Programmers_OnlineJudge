/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947?language=java
 */

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String s = Integer.toString(x);
        int sum = 0;
        for(int i = 0; i < s.length();i++){
            sum += s.charAt(i) - '0';
        }
        
        if(x % sum != 0){
            answer = false;
        }
        
        System.out.println(sum);
        
        
        return answer;
    }
}