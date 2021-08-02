package Inflearn.Section3_TwoPointers_SlidingWindow;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int d=sc.nextInt();
        sc.nextLine();
        String[] st=sc.nextLine().split(" ");
        sc.close();
        int[] arr=new int[day];
        for (int i = 0; i < day; i++) {
            arr[i]=Integer.parseInt(st[i]);
        }

        int max=0;
        for (int i = 0; i < day - d + 1; i++) {
            int sum = 0;
            for (int j = i; j < i+d; j++) {
                sum += arr[j];
            }
            max = sum > max ? sum : max;
        }
        System.out.println(max);
    }
}
