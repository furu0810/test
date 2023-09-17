import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        
        System.out.println("計算したい数字を入力してください。");

        Scanner val_1 = new Scanner(System.in);
        Scanner val_2 = new Scanner(System.in);

        //文字列を小数に変換する
        double dob_1 = val_1.nextDouble();
        double dob_2 = val_2.nextDouble();

        //四則演算の計算方式を選択する
        System.out.println("1-4のいずれかの数字を入力してください。1：足し算、2：引き算、3：掛け算、4：割り算");
        Scanner val_3 = new Scanner(System.in);
        int int_1 = val_3.nextInt();

        switch (int_1) {
            case 1:
                double addition = dob_1 + dob_2 ;
                System.out.println("足し算：" + addition);
                break;
            case 2:
                double substraction = dob_1 - dob_2 ;
                System.out.println("引き算：" + substraction);
                break;
            case 3:
                double multiple = dob_1 * dob_2 ;
                System.out.println("掛け算：" + multiple);
                break;
            case 4:
                double division = dob_1 / dob_2 ;
                System.out.println("割り算：" + division);
                break;            
        } 
    }
}
