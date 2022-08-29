/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901?language=java#
 */

class Solution {
    public String solution(int a, int b) {
        String answer = "";
     String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
     int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
     int allDate = 0;
     for (int i = 0; i < a - 1; i++) {
        allDate += date[i];
     }
 
     allDate += (b - 1);
     answer = day[allDate % 7];
 
     return answer;
    }
}