package Programmers.Level1;

public class Q_42889_실패율 {
    public static void main(String[] args) {
        int N=5;
        int[] s={2,1,2,6,2,4,3,3};
        for (int x : solution(N, s)) {
            System.out.print(x+" ");
        }
        System.out.println();
        int N2=4;
        int[] s2={4,4,4,4,4};
        for (int x : solution(N2, s2)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer=new int[N];

        double[] challenge = new double[N]; //도전자
        double[] failNum=new double[N]; //실패자
        double[] failPercent=new double[N]; //실패율
        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < N; j++) {
                if(stages[i]>=j+1) challenge[j]++; //도전자 세는중
                if(stages[i]==j+1) failNum[j]++; //실패자 세는중
            }
        }

        for (int i = 0; i < N; i++) {
            failPercent[i]=failNum[i]/challenge[i]; //실패율 계산
            answer[i]=i+1; //struct처럼 answer에 스테이지 번호 -> 실패율, 스테이지 번호 struct처럼 관리하려고..
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (failPercent[i] < failPercent[j]) { //실패율따라서 정렬
                    double temp=failPercent[i];
                    failPercent[i]=failPercent[j];
                    failPercent[j]=temp;
                    int tmp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=tmp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (failPercent[i] != failPercent[j]) { //실패율 같을때 스테이지 번호 다시 정렬
                    break;
                }
                if (answer[i] > answer[j]) {
                    double temp=failPercent[i];
                    failPercent[i]=failPercent[j];
                    failPercent[j]=temp;
                    int tmp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=tmp;
                }
            }
        }

        return answer;
    }
}
