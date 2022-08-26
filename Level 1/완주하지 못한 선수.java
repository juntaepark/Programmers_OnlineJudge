/**
 * 문제 출처: 프로그래머스 코딩 테스트 연습, 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
 */

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 1. 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 2. 두 배열이 다를 때까지 찾는다.
        int i = 0;
        for(i=0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
        }
        
        // 3. 여기까지 왔다는 것은 participant 마지막 원소가 완주를 못했다는 의미
        String answer = participant[i];
        return answer;
    }
}