package Inflearn.Section8_DFSBFS;

import java.util.Scanner;

public class Q_04 {
    static int n,m;
    static int[] answer;

    public void DFS(int L) {
        if (L == m) {
          for(int x:answer) System.out.print(x+" ");
          System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                answer[L]=i+1;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        n=Integer.parseInt(str[0]);
        m=Integer.parseInt(str[1]);

        answer=new int[m];

        Q_04 T=new Q_04();

        T.DFS(0);
    }
}
