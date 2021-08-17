package Programmers.Level2;

import java.util.Stack;

public class Q_42586_기능개발 {
    public static void main(String[] args) {
        int[] progresses={93,30,55};
        int[] speeds={1,30,5};
        for (int x : solution(progresses, speeds)) {
            System.out.print(x+" ");
        }
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answerTemp=new int[100];

        Stack<Integer> stack=new Stack<>();
        for (int i = speeds.length - 1; i >= 0; i--) {
            stack.push(progresses[i]);
        }
        int cnt=0;
        int index=0;
        while (!stack.isEmpty()) {
            for (int i = 0; i < stack.size(); i++) {
                stack.set(i,stack.get(i)+speeds[speeds.length-1-i]);
            }
            while (!stack.isEmpty() && stack.peek() >= 100) {
                stack.pop();
                cnt++;
            }
            if (cnt > 0) {
                answerTemp[index++]=cnt;
                cnt=0;
            }
        }

        int[] answer=new int[index];
        for (int i = 0; i < index; i++) {
            answer[i]=answerTemp[i];
        }
        return answer;
    }
}
