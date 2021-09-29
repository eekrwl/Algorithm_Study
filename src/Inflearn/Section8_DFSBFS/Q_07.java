package Inflearn.Section8_DFSBFS;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_07 {
    static int answer=0;
    public int DFS(int n,int r) {
        if(r<0 || n<r) return 0;
        if (r == 0 || n==1) {
            answer++;
        } else {
            if(n>1) {
                DFS(n - 1, r - 1);
                DFS(n - 1, r);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        int n=Integer.parseInt(st.nextToken());
        int r=Integer.parseInt(st.nextToken());

        Q_07 T=new Q_07();
        System.out.println(T.DFS(n,r));
    }
}
