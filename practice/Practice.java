import java.util.ArrayList;
import java.util.Random;

public class Practice {

    void RamdomArray(){
        int[] a = new int[7];
        Random rand = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(7);
            System.out.print("a["+ i +"] = " + a[i] + " ");
        }
        System.out.println();
    }

    void EvenOdd(){
        int[] d = new int[10];
        Random rand = new Random();

        for(int i = 0; i < d.length; i++){
            d[i] = rand.nextInt(100);
            System.out.print("d["+ i +"] = " + d[i] + " ");
        }
        System.out.println();

        System.out.print("奇数：");
        for(int i = 0; i < d.length; i++){
            if(d[i] % 2 == 1){
                System.out.print(d[i] + " ");
            }
        }
        System.out.println();

        System.out.print("偶数：");
        for(int i = 0; i < d.length; i++){
            if(d[i] % 2 == 0){
                System.out.print(d[i] + " ");
            }
        }
        
    }

    void TwoDimensionalArray(){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        Random rand = new Random();

        for(int i = 0; i <= 3; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j <= 3; j++){
                list.add((int)(rand.nextInt(9)));
            }
            lists.add(list);
        }

        for(int i = 0; i < lists.size(); i++){
            System.out.println(lists.get(i));
        }

        System.out.println(lists.get(3).get(3));

    }

public static void main(String[] args){
    Practice p = new Practice();
    p.RamdomArray();
    p.EvenOdd();
    p.TwoDimensionalArray();
}

}
