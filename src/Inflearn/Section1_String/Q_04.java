package Inflearn.Section1_String;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = in.nextLine();
        }
        in.close();
        for (int i = 0; i < num; i++) {
            for (int j = str[i].length()-1; j >= 0; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
    }
}
