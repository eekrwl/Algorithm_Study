package Inflearn.Section5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String must = sc.nextLine();
        String plan = sc.nextLine();
        Queue<Character> queue=new LinkedList<>();
        for(char m:must.toCharArray()) {
            queue.offer(m);
        }
        for (char p : plan.toCharArray()) {
            if(!queue.isEmpty() && p==queue.peek())
                queue.poll();
        }
        if(queue.isEmpty()) System.out.print("YES");
        else System.out.print("NO");
    }
}
