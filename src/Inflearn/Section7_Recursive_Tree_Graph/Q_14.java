package Inflearn.Section7_Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q_14 { //level로 하는건 숙제
    static int n,m;
    static ArrayList<ArrayList<Integer>>graph;
    static int[] check,dis;
    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v]=1;
        dis[v]=0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (check[nv] == 0) {
                    check[nv]=1;
                    queue.offer(nv);
                    dis[nv]=dis[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q_14 T=new Q_14();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check=new int[n+1];
        dis=new int[n+1];
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();

        }
    }
}
