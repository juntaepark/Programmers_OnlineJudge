/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935?language=java
 */

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        // 10진법 -> 3진법
        while(n != 0){
            list.add(n%3);
            n /= 3;
        }
        
        // 3진법 -> 10진법
        int temp = 1;
        for(int i=list.size()-1; i>=0; i--){
            answer += list.get(i)*temp;
            temp *= 3;
        }
        
        return answer;
    }
}