package Inflearn.Section6_Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] str=br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }


        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int temp=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=temp;
                    temp=arr[i][1];
                    arr[i][1]=arr[j][1];
                    arr[j][1]=temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i][0] != arr[j][0]) {
                    break;
                }
                if (arr[i][1] > arr[j][1]) {
                    int temp1=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=temp1;
                    temp1=arr[i][1];
                    arr[i][1]=arr[j][1];
                    arr[j][1]=temp1;
                }
            }
            System.out.println(arr[i][0] + " "+arr[i][1]);
        }

    }
}