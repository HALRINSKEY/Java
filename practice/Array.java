public class Array {
 
    public static void main(String[] args){
        double[] d = new double[3];
        double sum;
        //  値を代入
        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        sum = 0.0;
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i] + " ");
            sum += d[i];
        }
        System.out.println();
        System.out.println("SUM = " + sum);

        int a[] = { 5,4,3,2,1 };
        String s[] = {"ABC","DEF","GHI" };
        int i;
        //  整数型配列変数nの成分表示
        for(i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //  文字列型配列変数nの成分表示
        for(i = 0; i < s.length; i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();

        int w[][] = new int[3][4];
        int m,n;
        //  二次元配列に値を代入
        for(m = 0; m < w.length; m++){
            for(n = 0; n < w[m].length; n++){
                w[m][n] = m+n;
            }
        }
        //  成分の表示
        for(m = 0; m < w.length; m++){
            for(n = 0; n < w[m].length; n++){
                System.out.print(w[m][n]+" ");
            }
            System.out.println();
        }
    
    }
    
}