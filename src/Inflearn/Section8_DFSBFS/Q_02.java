package Inflearn.Section8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_02 {
    static int answer=Integer.MIN_VALUE,C,N;
    static int[] arr;

    public void DFS(int L, int sum) {
        if(sum>C) return;
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        C = Integer.parseInt(st[0]);
        N = Integer.parseInt(st[1]);
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Q_02 T = new Q_02();
        T.DFS(0,0);

        System.out.println(answer);
    }
}



/*
 ///내코드 시간초과..
public class Q_02 {
    static int C, N;
    static int max = 0, sum = 0;
    static int[] check;
    static int[] arr;

    public void DFS(int v) {
        for (int i = 1; i <= N; i++) {
            if (sum > max && sum <= C) {
                max = sum;
            }
            if (check[i] == 0) {
                sum += arr[i];
                check[i] = 1;
                DFS(i);
                sum-=arr[i];
                check[i] = 0;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        C = Integer.parseInt(st[0]);
        N = Integer.parseInt(st[1]);
        arr = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Q_02 T = new Q_02();
        check = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            T.DFS(i);
        }

        System.out.println(max);
    }
}
*/
