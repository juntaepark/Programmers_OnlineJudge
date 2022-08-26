/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12937?language=java
 */

import java.util.ArrayList;

class Solution {
    public String solution(int num) {
        return (num % 2) == 0 ? "Even" : "Odd";
    }
}