package Inflearn.Section7_Recursive_Tree_Graph;

import java.util.Scanner;

public class Q_12 { //인접 행렬
    static int n,m,answer=0;
    static int[][] graph;
    static int[] check;
    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i]=1;
                    DFS(i); //이거다끝내고 밑에줄 시작
                    check[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q_12 T=new Q_12();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        graph=new int[n+1][n+1];
        check=new int[n+1];
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a][b]=1;
        }
        check[1]=1;
        T.DFS(1);
        System.out.println(answer);

    }
}
