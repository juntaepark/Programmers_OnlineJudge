/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681?language=java
 */

import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            
            int idx = n-1;
            for(int j = 0; j < n; j++){
                
                int num = (int)Math.pow(2, idx);
                
                if(arr1[i] / num >= 1){
                    map1[i][j] = 1;                    
                    arr1[i] -= num;
                } else{
                    map1[i][j] = 0;
                }
                
                if(arr2[i] / num >= 1){
                    map2[i][j] = 1;                    
                    arr2[i] -= num;
                } else{
                    map2[i][j] = 0;
                }

                idx--;
            }
        }
        
        for(int i = 0; i < n; i++){
            answer[i] = "";
            for(int j = 0; j < n; j++){
                if(map1[i][j] == 0 && map2[i][j] == 0){
                    answer[i] += ' ';
                } else{
                    answer[i] += '#';
                }
            }
        }
        
        return answer;
    }
}