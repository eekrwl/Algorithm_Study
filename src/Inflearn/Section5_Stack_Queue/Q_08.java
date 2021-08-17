package Inflearn.Section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=br.read();
        int M=br.read();
        String[] temp=br.readLine().split(" ");
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(temp[i]));
        }


    }
}
