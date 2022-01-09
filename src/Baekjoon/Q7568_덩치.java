package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++) {
            String[] temp=br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(temp[0]);
            arr[i][1]=Integer.parseInt(temp[1]);
        }
        for(int i=0;i<n;i++) {
            int smallCnt=0;
            for(int j=0;j<n;j++) {
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
                    smallCnt++;
                }
            }
            arr[i][2]=smallCnt+1;
            System.out.print(arr[i][2]+" ");
        }
    }
}
