package Inflearn.Section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stk.isEmpty() && str.charAt(i) != '(' && str.charAt(i) != ')') {
                System.out.print(str.charAt(i));
            }
            else {
                if(str.charAt(i)=='(')
                    stk.push('(');
                else if(str.charAt(i)==')')
                    stk.pop();
            }
        }
    }
}
// 괄호있으면 보통 stack문제
//stack.size() -> 스택안에 원소 개수
//stack.get(i); 하면 그 위치꺼 가져옴

/*
public String solution(String str) {
    String answer="";
    Stack<Character> stack=new Stack<>();
    for (char x : str.toCharArray()) {
        if (x == ')') {
            while(stack.pop()!='(');
        }
        else stack.push(x);
    }
    for(int i=0;i<stack.size();i++)
        answer+=stack.get(i);
    return answer;
}*/
