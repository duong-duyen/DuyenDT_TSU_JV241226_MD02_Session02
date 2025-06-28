package TSU_JV241226_MD02_Session02_Bai02;

import java.util.Scanner;

public class SS02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 số nguyên 1-7 ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.printf("Chủ nhật");
                break;
            case 2:
                System.out.printf("Thứ hai");
                break;
            case 3:
                System.out.printf("Thứ ba");
                break;
            case 4:
                System.out.printf("Thứ tư");
                break;
            case 5:
                System.out.printf("Thứ năm");
                break;
            case 6:
                System.out.printf("Thứ sáu");
                break;
            case 7:
                System.out.printf("Thứ bảy");
                break;
            default:
                System.out.println("Số nhập vào không hợp lệ");
        }
        sc.close();
    }
}
