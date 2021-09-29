package Inflearn.Section8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_05 {
    static int n, m;
    static Queue<Integer> queue = new LinkedList<>();
    static int level = 0; //사용한 동전의 개수
    static int[] arr;

    public int BFS() {
        while (true) {
            int qSize = queue.size();
            level++;
            for (int i = 0; i < qSize; i++) {
                int qTemp = queue.poll();
                if (qTemp == m)
                    return level;
                for (int j = 0; j < n; j++) {
                    if(!queue.contains(qTemp+arr[j])) queue.offer(qTemp + arr[j]);
                }
            }
        }
    }

    //강사님 코드
   /* public void DFS(int L,int sum,int[] arr) {
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m) {
            answer=Math.min(answer,L);
        } else {
            for(int i=0;i<n;i++) {
                DFS(L+1,sum+arr[i],arr);
            }
        }
    }*/



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            queue.offer(arr[i]);
        }
        m = Integer.parseInt(br.readLine());

        /*Integer[] arr=new Integer[n];
        Arrays.sort(arr, Collections.reverseOrder());*/

        Q_05 T = new Q_05();
        System.out.println(T.BFS());
    }
}
