import java.io.*;

public class test4 {
    public static void main(String[] args) throws IOException{
        //挨拶メッセージ出力ゲーム
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1,2またはそれ以外の数字を入力してください。");

        String str = br.readLine();

        int num = Integer.parseInt(str); //キーボードで入力した文字列を整数に変換する

        if (num == 1) {
            System.out.println("Hello, Java");
        }
        else if  (num == 2) {
            System.out.println("GoodEvening");
        }
        else {
            System.out.println("GoodNight");            
        }
    }
}
