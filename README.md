# VSCodeのJava開発環境構築
VSCodeでJavaの開発環境を構築するための手順を記載する。

## Javaのインストール

1.[OpenJDK](OpenJDK)をインストールする。　　

2.環境変数を2つ設定する。

  ・`JAVA_HOME`
  
  ・`Path`

3.Windowsキーを押下後、検索窓でenvと入力する。  

4.システムプロパティ>「詳細設定」タブ>「環境変数(N)」を選択する。

![image](https://github.com/furu0810/test/assets/58910420/33daf2c2-7539-48ab-8caf-e0121889f9bd)


5.システム環境変数(S)画面の新規(W)を選択する。

![image](https://github.com/furu0810/test/assets/58910420/3f61b9ee-7b69-4c46-b1ca-a9a234afbc50)

6.変数名は`JAVA_HOME`、変数値はOpenJDKを配置した場所をフルパスで指定して「OK」を選択する。

![image](https://github.com/furu0810/test/assets/58910420/320e78a8-80d5-4df3-9cbb-ea9dcf9883f1)

7.続いてシステム環境変数(S)画面のPATHを選択し、編集(I)を選択する。

![image](https://github.com/furu0810/test/assets/58910420/e511f6bc-dd33-45db-8ff3-bef3595586f2)

8.環境変数名の編集画面で新規(N)を選択し、パスを`￥bin`まで指定する。

![image](https://github.com/furu0810/test/assets/58910420/d66360e3-bf0d-4737-b4b1-630642e69f33)

9.Windows PowerShellを起動してJavaのバージョンを確認する。

```
java -version
```

10.JAVAのバージョンが出力されたらインストールは完了。

![image](https://github.com/furu0810/test/assets/58910420/a62eebd0-71d9-43e2-9213-537d900ef639)

## VSCodeの環境構築

1.[VSCode](https://code.visualstudio.com/)をインストールする。

2.拡張機能`Extension Pack for Java`をインストールする。

![image](https://github.com/furu0810/test/assets/58910420/1238f44f-e0ea-4c96-aaaa-90ade5384a7e)

3.VSCodeでJAVA_HOMEを設定する。

環境変数で設定したJDKのフルパスをsettings.jsonに指定し、設定を保存後に再起動する。

・記入例
```
"java.home": "C:\\Program Files\\OpenJDK\\jdk-15.0.1",
```

4.サンプルプログラムを作成する。

`CTRL+SHIFT+P`で検索ボックスを表示後、Javaと入力する。

![image](https://github.com/furu0810/test/assets/58910420/104fc713-ace0-45f2-be6d-10149a0e86ec)


`Java:Create Java Project...`で`Enter`を押す。

`No build toolsで`Enter`を押す。

最後に`Project名`を選択する。

