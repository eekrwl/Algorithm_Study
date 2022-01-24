package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1010_다리놓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][2];
        int[] answer=new int[n];
        for(int i=0;i<n;i++) {
            String[] temp=br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(temp[0]);
            arr[i][1]=Integer.parseInt(temp[1]);
        }

        for(int i=0;i<n;i++) {
            answer[i]=1;
            for(int j=arr[i][1];j>(arr[i][1]-arr[i][0]);j--) {
                if(j!=0) answer[i]*=j;
            }
            for(int j=1;j<=arr[i][0];j++) {
                answer[i]/=j;
                //System.out.println("answer : "+answer[i]);
            }
            System.out.println(answer[i]);
        }
    }
}
