public class test2 {
    public static void main(String[] args) {
        //変数の値を更新する
        int num = 3;
        System.out.println("変数numの値は" + num + "です。");

        num = 5;
        System.out.println("更新後のnumの値は" + num + "です。" );

        //他の変数の値を代入する
        int num2 = 10;
        System.out.println("変数num2の値は" + num2 + "です。");
        
        int num3 = num2;
        System.out.println("変数num3の値は" + num3 + "です。");

    }
}
