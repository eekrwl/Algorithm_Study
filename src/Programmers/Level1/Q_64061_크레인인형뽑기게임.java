package Programmers.Level1;

import java.util.Stack;

public class Q_64061_크레인인형뽑기게임 {

}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk=new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (!stk.isEmpty() && board[j][moves[i] - 1] == stk.peek()) {
                        stk.pop();
                        answer += 2;
                    } else {
                        stk.push(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}