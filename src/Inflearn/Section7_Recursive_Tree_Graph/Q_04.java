package Inflearn.Section7_Recursive_Tree_Graph;

public class Q_04 {
    static int[] fibo;
    public static void main(String[] args) {
        System.out.println(DFS(7));
        fibo=new int[7+1];

        for (int i = 1; i < 8; i++) {
            DFS2(i);
            System.out.print(fibo[i]+" ");
        }
    }
    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 1) + DFS(n - 2);
        }
    }

    public static void DFS2(int n) {
        if(n==1) fibo[1]=1;
        else if(n==2) fibo[2]=1;
        else fibo[n]=fibo[n-1]+fibo[n-2];
    }
}

/*
class Main {
    static int[] fibo;
    public int DFS(int n) {
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Main T=new Main();
        int n=45;
        fibo=new int[n+1];
        T.DFS(n);
        for (int i = 1; i < n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
*/
