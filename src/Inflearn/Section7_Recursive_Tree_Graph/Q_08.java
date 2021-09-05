package Inflearn.Section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_08 {
    public static int BFS(int S, int E) {
        int[] dis = {1, -1, 5};
        int[] check;
        Queue<Integer> Q = new LinkedList<>();

        check=new int[10001];
        check[S]=1;
        Q.offer(S);
        int L=0;
        while (!Q.isEmpty()) {
            int len=Q.size();
            for (int i = 0; i < len; i++) {
                int x=Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx=x+dis[j];
                    if(nx==E) return L+1;
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        System.out.println(BFS(S,E));
    }
}
