package TSU_JV241226_MD02_Session02_Bai03;

import java.util.Scanner;

public class SS02_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên dương ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.printf("Tổng các số từ 1 đến %d là %d", n, sum);
        }
        sc.close();
    }
}
