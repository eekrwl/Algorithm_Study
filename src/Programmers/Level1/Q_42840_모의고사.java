package Programmers.Level1;

import java.util.Arrays;
import java.util.HashMap;

public class Q_42840_모의고사 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        solution(arr);
    }
    public static int[] solution(int[] answers) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(1,0); //1번 학생 맞은거카운트
        hash.put(2,0); //2번 학생 맞은거카운트
        hash.put(3,0); //3번 학생 맞은거카운트
        int[][] arr={{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        //반복되는 한블럭만큼 넣음
        for (int i = 0; i < answers.length; i++) { //각자 맞은 개수 세기
            if (answers[i] == arr[0][i % 5]) {
                hash.put(1,hash.get(1)+1);
            }
            if (answers[i] == arr[1][i % 8]) {
                hash.put(2,hash.get(2)+1);
            }
            if (answers[i] == arr[2][i % 10]) {
                hash.put(3,hash.get(3)+1);
            }
        }

        int[] answer=new int[3];

        //제일 많이 맞힌 사람 문제수 고르기
        int max=hash.get(1);
        max = max < hash.get(2) ? hash.get(2) : max;
        max = max < hash.get(3) ? hash.get(3) : max;

        int cnt=0; //최다득점자 몇명인지 카운트
        for (int i = 1; i <= 3; i++) {
            if (hash.get(i) == max) { //최다득점이면 answer에 넣기
                answer[cnt++]=i;
            }
        }
        return Arrays.copyOfRange(answer,0,cnt);
    }
}