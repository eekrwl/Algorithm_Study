package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Q_43165_타겟넘버 {
    public static void main(String[] args) {
        int[] n = {1, 1, 1, 1, 1};
        int t = 3;
        System.out.println(solution(n, t));
    }

   /* static int[][] check;
    static int answer = 0;
    static int level = 0;*/

    public static int solution(int[] numbers, int target) {
        /*check = new int[numbers.length][2];
        DFS(numbers, target);*/
        int answer = 0;

        int totalAnswer = 1;
        for (int i = 0; i < numbers.length; i++) {
            totalAnswer *= 2;
        }

        //Queue를 하나로 줄여보기
        //BFS로 풀어보기
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tempQueue=new LinkedList<>();

        queue.offer(numbers[0]);
        queue.offer(-numbers[0]);
        int i = 1;
        while (queue.size() != totalAnswer && i < numbers.length) {
            int temp = queue.poll();
            tempQueue.offer(temp + numbers[i]);
            tempQueue.offer(temp - numbers[i]);

            if (queue.size() == 0) {
                i++;
                while (tempQueue.size() != 0) {
                    queue.offer(tempQueue.poll());
                }
            }
        }

        for (int x : queue) {
            System.out.println("q : " + x);
            if (x == target) answer++;
        }
        return answer;
    }

    /*public static void DFS(int[] numbers, int target) {
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1 && sum == target) {
                answer++;
                sum = 0;
            } else {
                for (int j = 0; j < 2; j++) {
                    if (check[i][j] == 0) {
                        if (j == 0) {
                            sum += numbers[j];
                            check[i][j] = 1;
                            DFS(numbers, target);
                            check[i][j] = 0;
                        } else {
                            sum -= numbers[j];
                            check[i][j] = 1;
                            DFS(numbers, target);
                            check[i][j] = 0;
                        }
                    }
                }

            }
        }
    }*/
}
