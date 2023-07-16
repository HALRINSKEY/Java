
public class SampleClass {
    //  フィールド
    int n = 10;
    String s = "field";
    //  メソッド
    int add(int a,int b){
        return a + b;
    }
    String add(String s){
        return this.s + s;
    }
    void showNum(){
        System.out.println("n = " + n);
    }

    public static void main(String[] args) {
        SampleClass s = new SampleClass();  //  インスタンスの生成
        s.n = 100;          //  フィールドnに値を代入
        s.s = "Hello";      //  フィールドsに値を代入
        int ans = s.add(1,2);           //  メソッドadd()を呼び出し
        String str = s.add("World");    //  メソッドadd()を呼び出し
        System.out.println(ans);        //  呼び出し結果の表示
        System.out.println(str);        //  呼び出し結果の表示
        s.showNum();                    //  メソッドshowNum()を呼び出し
    }
}