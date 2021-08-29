package Inflearn.Section7_Recursive_Tree_Graph;

public class Q_02 { //이진수 출력(재귀)
    public static void main(String[] args) {
        DFS(11);
    }

    public static void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }
}
