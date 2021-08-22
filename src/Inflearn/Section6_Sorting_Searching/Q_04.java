package Inflearn.Section6_Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int S=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());

        String[] str=br.readLine().split(" ");
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=Integer.parseInt(str[N-1-i]);
        }

        int[] temp=new int[N];
        int cnt=0;
        for (int i = 0; i < N; i++) {
            int check=0;
            for (int j = 0; j < cnt; j++) {
                if (arr[i] == temp[j]) { //이미 있는 애인지 확인
                    check++;
                    break;
                }
            }
            if (check == 0) { //없음, temp에 추가
                temp[cnt++] = arr[i];
            } else { //있음, 있는 arr자리 0으로
                arr[i] = 0;
            }
        }

        int printCnt=0;
        for (int i = 0; i < N; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i]+" ");
                printCnt++;
            }
            if(printCnt==S)
                break;
        }
    }
}
