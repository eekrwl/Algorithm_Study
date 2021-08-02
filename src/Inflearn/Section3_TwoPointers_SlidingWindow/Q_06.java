package Inflearn.Section3_TwoPointers_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[]=br.readLine().split(" ");
        int n=Integer.parseInt(st[0]);
        int k=Integer.parseInt(st[1]);
        String s[]=br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(s[i]);
        }

        int zero = 0, cnt = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if(max>n-i) //max가 남은 애들보다 크면 break
                break;
            for (int j = i; j < n; j++) {
                if(arr[j]==1 || zero<k) {
                    cnt++;
                    if(arr[j]==0)
                        zero++;
                }
                else if(arr[j]==0 && zero>=k)
                    break;
            }
            if(max<=cnt) {
                max = cnt;
            }
            cnt=0;
            zero=0;
        }
        System.out.print(max);
    }
}
