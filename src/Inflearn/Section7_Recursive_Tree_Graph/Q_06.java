package Inflearn.Section7_Recursive_Tree_Graph;

public class Q_06 { //부분집합 구하기(DFS) // 강의듣기!! 어렵따 //중요함!!
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if (L == n + 1) {
            String tmp="";
            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        } else {
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Q_06 T =new Q_06();
        n=3;
        ch=new int[n+1];
        T.DFS(1);
    }
}