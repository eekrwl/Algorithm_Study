package Programmers.Level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Q_42579_베스트앨범 {
    public static void main(String[] args) {
        String[] g={"classic","pop","classic","classic","pop"};
        int[] p={500,600,150,800,2500};
        int[] A=solution(g,p);
        for(int x:A) System.out.print(x+" ");
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer=new int[200];

        HashMap<String, Integer> kindCnt = new HashMap<>(); //장르별 노래수 count
        HashMap<String, Integer> playCnt = new HashMap<>(); //장르별 플레이수 총합 count
        for (int i = 0; i < genres.length; i++) {
            kindCnt.put(genres[i], kindCnt.getOrDefault(genres[i], 0) + 1);
            playCnt.put(genres[i], playCnt.getOrDefault(genres[i], 0) + plays[i]);
        }

        int answerCnt=0;
        int SIZE=kindCnt.size(); //장르 개수
        for (int k = 0; k < SIZE; k++) { //플레이수 높은장르별로 상위 2곡씩 출력
            String maxStr=""; //플레이수 높은 장르
            int max=0; //플레이수 높은 장르의 플레이수
            for (String x : playCnt.keySet()) { //플레이수 높은 장르 고르기
                if(max<playCnt.get(x)) {
                    max=playCnt.get(x);
                    maxStr=x;
                }
            }
            Integer[] genresPlay=new Integer[kindCnt.get(maxStr)]; //선택된 장르의 곡들 플레이수 넣을 배열
            int temp=0;
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(maxStr)) {
                    genresPlay[temp++]=plays[i]; //선택된 장르의 곡들 플레이수 넣음
                }
            }
            Arrays.sort(genresPlay, Collections.reverseOrder()); //내림차순으로 정렬, 7줄위처럼 Integer 이렇게 써야함

            for (int j = 0; j < 2; j++) { //상위 두곡
                if (j==1 && genresPlay.length < 2) {
                    break;
                }
                for (int i = 0; i < genres.length; i++) {
                    if (plays[i] == genresPlay[j] && genres[i].equals(maxStr)) { //장르가 맞고 [0],[1]의 상위 1,2곡 answer에 넣기
                        answer[answerCnt++]=i;
                        plays[i]=0;
                    }
                }
            }
            kindCnt.remove(maxStr); //제일 높은 장르 answer에 넣었으니 삭제, 이후 삭제되고 남은 애들만으로 상위 장르 고르면서 반복
            playCnt.remove(maxStr);
        }

        int[] A=new int[answerCnt];
        for (int a = 0; a < answerCnt; a++) {
            A[a]=answer[a];
        }
        return A;
    }
}
