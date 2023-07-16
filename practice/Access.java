public class Access {
    //  コンストラクタ
    public Access(){
        System.out.println("コンストラクタ");
    }
    //  privateメソッド
    private void method1(){
        System.out.println("method1(private)");
    }
    //  publicメソッド①
    public void method2(){
        System.out.println("method2(public)");
    }
    //  publicメソッド②
    public void method3(){
        //  privateメソッドの呼び出し
        method1();
        System.out.println("method3(public) : num=" + this.num);
    }
    //  privateフィールド
    private int num = 1;

    public static void main(String[] args) {
        Access s = new Access();
        //  method1()は、privateなので、外部からはアクセスできない。
        //s.method1();
        //  method2呼び出し
        s.method2();
        //  method3呼び出し
        s.method3();
        //numは、privateフィールドなので、外部からはアクセスできない。
        //s.num = 1;
    }
}
