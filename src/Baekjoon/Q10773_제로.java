package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++) {
            int temp=Integer.parseInt(br.readLine());
            if(temp==0) { //입력받은 수 0이면
                stack.pop(); //스택 제일 위에 값 pop
            } else { //입력받은 수 0 아니면
                stack.push(temp); //스택에 값 넣기
            }
        }
        int answer=0;
        while(stack.isEmpty()==false) { //스택 빌때까지
            answer += stack.pop();
        }
        System.out.println(answer);
    }
}
