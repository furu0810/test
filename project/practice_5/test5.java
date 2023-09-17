public class test5 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        b = a++; //後置インクリメント

        System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。"); 

        int c = 0;
        int d = 0;

        c = ++d; //前置インクリメント

        System.out.println("代入後にインクリメントしたのでcの値は" + c + "です。");
        
    }
}
