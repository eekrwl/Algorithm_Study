package Programmers.Level1;

public class Q_12977_소수만들기 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(solution(nums));
        int[] nums2={1,2,7,6,4};
        System.out.println(solution(nums2));
    }

    public static int solution(int[] nums) {
        int answer=0;
        int n=nums.length;
        int Xnum=n*(n-1)*(n-2); //더한것들 개수
        int[] arr=new int[Xnum]; //더한것들 넣을 배열
        int cnt=0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    arr[cnt++]=nums[i]+nums[j]+nums[k]; //숫자 더한거 다셈
                }
            }
        }

        for (int i = 0; i < cnt; i++) {
            int check=0;
            for (int j = 2; j < arr[i]; j++) {
                if(arr[i]%j==0) {
                    check++; //나누어 떨어지는 거 있는지 체크
                    break;
                }
            }
            if(check==0) { //나누어 떨어지는거 없음
                answer++;
            }
        }
        return answer;
    }
}
