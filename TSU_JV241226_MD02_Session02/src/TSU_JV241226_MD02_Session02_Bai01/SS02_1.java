package TSU_JV241226_MD02_Session02_Bai01;

import java.util.Scanner;

public class SS02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Yêu cầu nhập vào số nguyên
        System.out.print("Nhập 1 số nguyên ");
        int n = sc.nextInt();

        // Nếu nhập 0 thì hiện "Số không phải chẳn không phải lẻ"
        if (n == 0) {
                System.out.println("Số không phải chẳn không phải lẻ");
        }
        // n chẳn thì hiện "Số n là chẳn"
        else if (n % 2 == 0) {
            System.out.printf("Số %d là số chẳn.%n", n);
        }
        // n lẻ thì hiện "Số n là lẻ"

        else {
            System.out.printf("Số %d là số lẻ.%n", n);
        }
        sc.close();

        }
}
