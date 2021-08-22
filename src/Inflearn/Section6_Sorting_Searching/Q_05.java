package Inflearn.Section6_Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        char answer='U';
        for (int i = 0; i < N-1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    answer='D';
                    break;
                }
            }
            if (answer == 'D') {
                break;
            }
        }
        System.out.print(answer);
    }
}
