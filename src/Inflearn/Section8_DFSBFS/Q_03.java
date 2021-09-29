package Inflearn.Section8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_03 {
    static int maxScore;
    static int[][] arr;
    static int n,m;

    public void DFS(int L,int score,int time) {
        if(time>m) return;
        if (L == n) {
            maxScore=Math.max(maxScore,score);
        } else {
            DFS(L+1,score+arr[L][0],time+arr[L][1]);
            DFS(L+1,score,time);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        n=Integer.parseInt(str[0]);
        m=Integer.parseInt(str[1]);

        arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            str=br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(str[0]);
            arr[i][1]=Integer.parseInt(str[1]);
        }

        Q_03 T=new Q_03();
        T.DFS(0,0,0);

        System.out.println(maxScore);

    }
}
