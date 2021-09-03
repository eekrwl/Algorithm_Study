package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Q_42587_프린터 {
    public static void main(String[] args) {
        int[] p={2,1,3,2};
        int[] p2={1,1,9,1,1,1};
        System.out.println(solution(p,2));
        System.out.println(solution(p2,0));
    }
    public static int solution(int[] priorities, int location) {
        int answer=0;

        int original=priorities[location]; //내문서 우선순위 original에 저장
        priorities[location]=-1; //내문서 우선순위 -1로 변경
        Queue<Integer> queue = new LinkedList<>();
        for(int x:priorities) queue.offer(x); //큐에 우선순위 순서대로 넣기

        while (!queue.isEmpty()) { //큐가 빌 때까지 계속함
            if(original==-1) break; //original==-1이면 while문 빠져나감

            /* 현재 문서 중 가장 높은 우선순위 구하기*/
            int max=queue.peek(); //max에 큐 제일위에거 일단 넣음
            if(max==-1) max=original; //max가 -1이면 내문서란 소리, max를 original로 바꿔줌
            for (int x : queue) {
                if (x != -1) { //내문서 아님
                    if (max <= x) max = x;
                } else { //내문서임
                    if(max<=original) max=original;
                }
            }
            //내문서와 같은 우선순위인 출력물끼리 구분이 안가니까 내문서를 -1로 바꿔서 관리

            /* 가장 높은 우선순위 하나 제거하고 앞에꺼 뒤로 다시 넣기 */
            for (int i=0;i<queue.size();i++) {
                if (queue.peek() == -1) { //내문서임
                    if (original != max) { //가장 큰우선순위아니면 맨뒤로 넣기
                        queue.offer(queue.poll());
                    } else { //가장 큰 우선순위임
                        queue.poll(); //가장 큰 우선순위 출력
                        answer++; //출력 개수 하나 추가
                        original=-1; //original==-1로 바꿔서 내꺼 출력했음을 표시
                        break;
                    }
                } else {
                    if (queue.peek() != max) { //내문서 아님
                        queue.offer(queue.poll()); //가장 큰우선순위아니면 맨뒤로 넣기
                    } else {
                        queue.poll(); //가장 큰 우선순위 출력
                        answer++; //출력 개수 하나 추가
                        break;
                    }
                }

            }
        }
        return answer;
    }
}
