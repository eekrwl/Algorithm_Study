package Programmers.Level1;

import java.util.Arrays;

public class Q_77484_로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = new int[2];
        result = solution(lottos, win_nums);
        System.out.print(result[0]+" "+result[1]);
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer=new int[2];
        int zero=0; //못알아보는 숫자 개수
        int correct=0; //당첨된 숫자 개수

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(lottos[i]==win_nums[j]) correct++; //맞은거 개수세기
            }
            if(lottos[i]==0) zero++; //0인거 개수세기
        }

        answer[0]=7-(correct+zero); //최대 순위
        answer[1]=7-correct; //최저순위

        for (int i = 0; i < 2; i++) {
            if(answer[i]==7) answer[i]=6; //0개맞으나 1개맞으나 어쨌든 6위니까 7위->6위 바꿔줌
        }

        return answer;
    }
}
