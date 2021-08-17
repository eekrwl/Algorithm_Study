package Programmers.Level1;

import java.util.Arrays;

public class Q_42862_체육복 {
    public static void main(String[] args) {
        int n=5;
        int lost[]={2,4};
        int reserve[]={1,3,5};
        System.out.println(solution(n, lost, reserve));

        int m=6;
        int l[]={2,4};
        int r[]={1,3};
        System.out.println(solution(m,l,r)); //
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer=0;
        /*for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(lost, i) >= 0) { //체육복 안가져옴
                if (Arrays.binarySearch(reserve, i - 1) >= 0) { //앞번호에서 빌림
                    answer++;
                    reserve[Arrays.binarySearch(reserve, i - 1)] = -1;
                } else if (Arrays.binarySearch(reserve, i + 1) >= 0) { //뒷번호에서 빌림
                    answer++;
                    reserve[Arrays.binarySearch(reserve, i + 1)] = 1;
                }
            } else { //체육복 가져옴
                answer++;
            }
        }*/

        /*answer+=n-lost.length;
        int back=0,front=0,sum=0;
        for (int i = 0; i < reserve.length-1; i++) {
            if (Arrays.binarySearch(lost, reserve[i + 1]) >= 0) {
                back++;
            }
        }
        for (int i = reserve.length - 1; i > 0; i--) {
            if (Arrays.binarySearch(lost, reserve[i - 1]) >= 0) {
                front++;
            }
        }*/

        int[] student = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            if (Arrays.binarySearch(lost, i) >= 0) {

            } else {
                student[i]=1;
                if (Arrays.binarySearch(reserve, i) >= 0) {
                    student[i]++;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            if(student[i]>0) {
            if (i!=1 && student[i - 1] == 0) {
                student[i - 1]++;
                student[i]--;
            }
            if (i!=n && student[i + 1] == 0) {
                student[i + 1]++;
                student[i]--;
            }}
        }
        for (int i = 1; i < n + 1; i++) {
            if (student[i] > 0) {
                answer++;
            }
        }
        return answer;
    }
}

// 가져옴
// 안가져옴
//     -reserve에서 빌릴수있음
//       -reserve에서 빌릴수없음