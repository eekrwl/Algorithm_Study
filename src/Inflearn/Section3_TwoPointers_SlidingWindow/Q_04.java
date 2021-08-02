package Inflearn.Section3_TwoPointers_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st=br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int cnt=0;
        int sum=0;
        int j=0;
        for (int i = 0; i < n; i++) {
            while (sum < m && i+j<n) {
                sum+=arr[i+j];
                j++;
            }
            j=0;
            if (sum == m) {
                cnt++;
            }
            sum=0;
        }
        System.out.print(cnt);
    }
}
