package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1966_프린터큐 {
    public int solution(int docCnt, int targetDoc, int[] priority) {
        Queue<Integer> queue=new LinkedList<>();
        int[] sortedPriority= Arrays.copyOf(priority,priority.length);
        Arrays.sort(sortedPriority); //우선순위 정렬함
        Stack<Integer> stack=new Stack<>(); //우선순위 큰게 제일 위에 오게 놓음
        for(int e:sortedPriority) {
            stack.push(e);
        }
        priority[targetDoc]*=-1; //타겟 구분 위해서 음수로 바꿔놓음
        for(int e:priority) {
            queue.offer(e);
        }

        int answer=0;
        while(!queue.isEmpty()) {
            int queueOut=queue.poll(); //큐에서 하나 뽑는다
            if(queueOut<0) { //타겟문서임
                if(stack.peek()==-queueOut) { //우선순위 큰게 타겟문서!
                    return ++answer;
                } else { //우선순위 큰거 타겟문서 아님ㅠㅠ
                    queue.offer(queueOut); //다시 큐에 넣음
                }
            } else { //타켓문서아님
                if(stack.peek()==queueOut) { //이번에 꺼낸게 우선순위 제일 높음
                    answer++;
                    stack.pop();
                } else { //우선순위 높지 않음..
                    queue.offer(queueOut);
                }
            }
        }
        return -1; //무언가 잘못된수
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] temp=br.readLine().split(" ");
            int docCnt=Integer.parseInt(temp[0]); //프린트할 문서 개수
            int targetDoc=Integer.parseInt(temp[1]); //타겟 문서 번호
            int[] priority=new int[docCnt]; //문서들 우선순위
            temp=br.readLine().split(" ");
            for(int j=0;j<docCnt;j++) {
                priority[j]=Integer.parseInt(temp[j]);
            }
            //여기까지 입력받음

            Q1966_프린터큐 T=new Q1966_프린터큐();
            int answer=T.solution(docCnt,targetDoc,priority);

            System.out.println(answer);
        }
    }
}
