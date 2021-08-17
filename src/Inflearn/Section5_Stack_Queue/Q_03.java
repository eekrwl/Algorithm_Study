package Inflearn.Section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_03 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                board[i][j]=Integer.parseInt(str[j]);
            }
        }

        int M=Integer.parseInt(br.readLine());
        int[] moves=new int[M];
        String[] temp=br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(temp[i]);
        }

        int popCnt=0;
        Stack<Integer> stk=new Stack<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (!stk.isEmpty() && board[j][moves[i] - 1] == stk.peek()) {
                        stk.pop();
                        popCnt += 2;
                    } else {
                        stk.push(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        System.out.print(popCnt);
    }
}
