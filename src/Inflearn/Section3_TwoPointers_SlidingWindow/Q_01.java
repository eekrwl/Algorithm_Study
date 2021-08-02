package Inflearn.Section3_TwoPointers_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        String[] s1=br.readLine().split(" ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i]=Integer.parseInt(s1[i]);
        }

        int n2=Integer.parseInt(br.readLine());
        String[] s2=br.readLine().split(" ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(s2[i]);
        }

        int[] answer = new int[n1+n2];
        int a=0,b=0;
        for (int i = 0; i < n1 + n2; i++) {
            if (a >= n1) {
                answer[i]=arr2[b];
                b++;
            } else if (b >= n2) {
                answer[i]=arr1[a];
                a++;
            } else {
                if (arr1[a] >= arr2[b]) {
                    answer[i] = arr2[b];
                    b++;
                } else {
                    answer[i]=arr1[a];
                    a++;
                }
            }
        }
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
