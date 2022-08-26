/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840?language=java
 */

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        // 1. 점수 배열 hit를 선언 후 각 패턴마다 점수를 증가 
        int[] hit = new int[patterns.length];
        for(int i = 0; i < hit.length; i++){
            for(int j = 0; j < answers.length; j++){
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }
        
        // 2. 최고 점수를 구한 후, List를 순회하며 최고 점수자 선출
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++){
            if(max == hit[i]) list.add(i+1);
        }
        
        // 3. list -> 배열로 변환 
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list) answer[cnt++] = num;
        return answer;
    }
}