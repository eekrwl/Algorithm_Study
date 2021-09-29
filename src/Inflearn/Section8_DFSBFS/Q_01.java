package Inflearn.Section8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_01 { //OX로 하는거 아주 유용하네..
    static int goal=0,N;
    static boolean answer=false;
    static int[] arr;

    public void DFS(int L,int sum) {
        if (L == N) {
            if(sum==goal) answer=true;
            return;
        } else {
            DFS(L+1,sum+arr[L]);
            DFS(L+1,sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        arr=new int[str.length+1];
        for (int i = 0; i < str.length; i++) {
            arr[i+1]=Integer.parseInt(str[i]);
            goal+=arr[i+1];
        }

        Q_01 T=new Q_01();
        if (goal % 2 == 1) {
            ;
        } else {
            goal/=2;
            T.DFS(0,0);
        }

        if (answer == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
