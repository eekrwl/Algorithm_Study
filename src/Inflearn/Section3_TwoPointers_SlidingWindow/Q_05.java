package Inflearn.Section3_TwoPointers_SlidingWindow;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int cnt=0;
        int sum=0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum+=j;
                if(sum==n) {
                    cnt++;
                    break;
                }
                else if(sum>n)
                    break;
            }
            sum=0;
        }
        System.out.print(cnt);
    }
}
