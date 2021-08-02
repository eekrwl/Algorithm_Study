package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_05 { //time limit exceeded...
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n - 1]; //int배열 만듦
        for (int i = 0; i < n - 1; i++) {
            arr[i]=i+2; //2~n까지 배열에 채워넣음
        }
        int cnt=0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0) {
                cnt++;
                for (int j = i+1; j < n - 1; j++) {
                  if(arr[j]!=0 && arr[j]%arr[i]==0)
                      arr[j]=0;
                }
            }
        }
        System.out.println(cnt);
    }
}
