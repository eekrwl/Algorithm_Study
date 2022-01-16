package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14889_스타트와링크 {
    static int[][] arr;
    static int answer=99999;

    public void Func(int n, int r, int myTeamAbility, int[] memArr, int memCnt) {
        if(memCnt==n/2) { //멤버 꽉참
            //능력치비교하기
            int yourTeamAbility=0; //다른팀 능력치
            for(int i=0;i<n;i++) {
                if(memArr[i]==0) { //0이면 다른팀
                    for (int j = 0; j < n; j++) {
                        if (memArr[j] == 0) {
                            yourTeamAbility += arr[i][j];
                        }
                    }
                }
            }
            if(Math.abs(yourTeamAbility-myTeamAbility)<answer) { //양팀 능력치 절댓값이 answer보다 작으면
                answer=Math.abs(yourTeamAbility-myTeamAbility); //바꿔치기
            }
        } else { //멤버 꽉 안참
            if(n>=r+1) {
                Func(n,r+1, myTeamAbility,memArr,memCnt); //r번이 우리 멤버 아님
                memArr[r]=1; //r번 우리멤버 만들기
                int myAbility=0; //r이 들어감으로써 우리팀에 더해지는 능력치
                for(int i=0;i<n;i++) {
                    if(memArr[i]==1) { //우리팀 멤버다!
                        myAbility+=arr[r][i];
                        myAbility+=arr[i][r];
                    }
                }
                Func(n,r+1,myTeamAbility+myAbility,memArr,++memCnt); //r번이 우리 멤버임
                memArr[r]=0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        arr=new int[n][n];
        for(int i=0;i<n;i++) {
            String[] temp=br.readLine().split(" ");
            for(int j=0;j<n;j++) {
                arr[i][j]=Integer.parseInt(temp[j]);
            }
        }

        Q14889_스타트와링크 T=new Q14889_스타트와링크();
        int[] memberArr=new int[n];
        for(int i=0;i<n;i++) {
            memberArr[i]=0;
        }
        memberArr[0]=1;

        T.Func(n,1,0,memberArr,1); //첫 멤버는 무조건 포함

        System.out.println(answer);

    }
}
