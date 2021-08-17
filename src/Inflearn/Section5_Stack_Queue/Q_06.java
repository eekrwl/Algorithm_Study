package Inflearn.Section5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        sc.close();

        Queue<Integer> queue=new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        int cnt=0;
        while (queue.size() > 1) {
            int temp=queue.poll();
            cnt++;
            if (cnt != K) {
                queue.offer(temp);
            } else {
                cnt=0;
            }
        }
        System.out.print(queue.poll());
    }
}
