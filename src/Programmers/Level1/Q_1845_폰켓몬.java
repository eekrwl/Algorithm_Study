package Programmers.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1845_폰켓몬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int nums[]=new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.print(solution(nums));
    }
    public static int solution(int[] nums) {
        int answer=0;
        Arrays.sort(nums);
        int before=nums[0];
        answer++;
        for (int i = 1; i < nums.length; i++) { //몇가지 종류가 있는지 카운트
            if (nums[i] != before) {
                answer++;
                before=nums[i];
            }
        }
        if (answer > nums.length / 2) {
            answer=nums.length/2;
        }
        return answer;
    }
}
