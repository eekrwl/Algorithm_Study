package Baekjoon;

import java.io.*;

public class Q1932_정수삼각형 {
    static int answer=-1;
    static int[][] arr;
    static int[] memory;

    public void Func(int n, int L, int r) {
        if(L==n+1) {
            if(answer<memory[n]) {
                answer=memory[n];
            }
        } else {
            memory[L]=memory[L-1]+arr[L][r];
            Func(n, L+1, r); //left
            Func(n, L+1, r+1); //right
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        arr=new int[n+1][n+1];
        for(int i=1;i<=n;i++) {
            String[] temp=br.readLine().split(" ");
            for(int j=1;j<=temp.length;j++) {
                arr[i][j]=Integer.parseInt(temp[j-1]);
            }
            for(int j=temp.length+1;j<=n;j++) { //빈자리는 -1으로 표시
                arr[i][j]=-1;
            }
        }

        memory=new int[n+1];
        memory[0]=0;

        Q1932_정수삼각형 T=new Q1932_정수삼각형();
        T.Func(n, 1, 1);

        bw.write(answer+"\n");
        bw.flush();
        bw.close();

    /****
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n+1][n+1];
        for(int i=1;i<=n;i++) {
            String[] temp=br.readLine().split(" ");
            for(int j=1;j<=temp.length;j++) {
                arr[i][j]=Integer.parseInt(temp[j-1]);
            }
            for(int j=temp.length+1;j<=n;j++) { //빈자리는 -1으로 표시
                arr[i][j]=-1;
            }
        }

        Queue<Integer> queue=new LinkedList<>();
        queue.offer(arr[1][1]);
        for(int i=2;i<=n;i++) {
            int size=queue.size();
            int index=1;
            for(int j=0;j<size;j++) {
                int temp=queue.poll();
                queue.offer(temp+arr[i][index]);
                 queue.offer(temp+arr[i][index+1]);
                index++;
            }
        }

        int answer=-1;
        for(int i=0;i<queue.size();i++) {
            int candidate=queue.poll();
            System.out.print(candidate+" ");
            if(answer<candidate) {
                answer=candidate;
            }
        }
        System.out.println(answer);***/
    }
}
