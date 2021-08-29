package Inflearn.Section7_Recursive_Tree_Graph;

public class Q_01 { //재귀함수(스택프레임)
    public static void main(String[] args) {
        DFS(5);
    }
    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
}
