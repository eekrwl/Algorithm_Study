package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11399_ATM {
    public static  void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] temp=br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(temp[i]);
        }

        Arrays.sort(arr);
        int answer=0;
        for(int i=0;i<n;i++) {
            answer+=arr[i]*(n-i);
        }
        System.out.println(answer);
    }
}
