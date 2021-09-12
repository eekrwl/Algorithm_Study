package Inflearn.Section7_Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_13 { //인접리스트
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (check[nv] == 0) {
                    check[nv]=1;
                    DFS(nv);
                    check[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q_13 T = new Q_13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
