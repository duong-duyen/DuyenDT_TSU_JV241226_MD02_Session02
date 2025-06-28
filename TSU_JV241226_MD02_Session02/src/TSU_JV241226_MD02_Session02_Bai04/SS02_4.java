package TSU_JV241226_MD02_Session02_Bai04;

import java.util.Scanner;

public class SS02_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        do{
            System.out.print("Vui lòng nhập tuổi của bạn: ");

            if(sc.hasNextInt()){
                age = sc.nextInt();
                if(age <= 0){
                    System.out.println("Vui lòng nhập vào 1 số nguyên và lớn hơn 0");
                }

            }else {
                System.out.println("Vui lòng nhập vào 1 số nguyên và lớn hơn 0");
                sc.next();
            }
        }
            while(age <= 0);

             System.out.printf("Tuổi của bạn là %d ! %n", age);
             sc.close();
        }



























    }



