package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        arr[0]=1;
        arr[1]=1;
        System.out.print(arr[0] + " " + arr[1] + " ");
        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(arr[i] + " ");
        }
    }
}
