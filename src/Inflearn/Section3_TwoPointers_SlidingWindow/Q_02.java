package Inflearn.Section3_TwoPointers_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        String[] str1=br.readLine().split(" ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i]=Integer.parseInt(str1[i]);
        }
        int n2 = Integer.parseInt(br.readLine());
        String[] str2=br.readLine().split(" ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i]=Integer.parseInt(str2[i]);
        }

        int[] two = new int[n1 >= n2 ? n1 : n2];
        int cnt=0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    two[cnt++]=arr1[i];
                    break;
                }
            }
        }

        for (int i = 0; i < cnt; i++) {
            for (int j = i; j < cnt; j++) {
                if (two[i] >= two[j]) {
                    int temp = two[i];
                    two[i] = two[j];
                    two[j] = temp;
                }
            }
            System.out.print(two[i]+" ");
        }
    }
}
