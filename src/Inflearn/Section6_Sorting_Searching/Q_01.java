package Inflearn.Section6_Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//선택정렬
public class Q_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*
public int[] solution(int n, int[] arr) {
    for (int i = 0; i < n - 1; i++) {
        int idx=i;
        for (int j = i + 1; j < n; j++) {
            if(arr[i]>arr[j])
                idx=j;
        }
        int tmp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=tmp;
    }
    return arr;
}
*/
