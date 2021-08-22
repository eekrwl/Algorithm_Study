package Inflearn.Section6_Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr=new int[N];
        int cnt=0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i != 0 && arr[i] < arr[i - 1]) {
                if(cnt>0) System.out.print(i+1);
                else System.out.print(i+" ");
                cnt++;
            }
        }


    }
}
