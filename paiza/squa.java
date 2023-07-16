package paiza;

import java.util.Scanner;

public class squa {
    public static void main(String[] args){
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//回数
        int Y = sc.nextInt();//mapsize
        int X = sc.nextInt();
//size入力
        //char player[] = {'r','b','g'};
        int player = 0;
        int[] H = new int[N * 3];//y //正方形の座標
        int[] W = new int[N * 3];//x
        int[] size = new int[N * 3];//正方形のサイズ
//map入力
        for(int n = 0; n < N * 3; n++){
            W[n] = sc.nextInt();//x
            H[n] = sc.nextInt();//y
            size[n] = sc.nextInt();
        }

        //map作成
        char[][] map = new char[Y][X];

        for(int n = 0; n < N * 3; n++){
            for(int j = 0; j < size[n]; j++){
                for(int i = 0; i < size[n]; i++){

                    if (H[n] + j < Y && W[n] + i < X){
                    
                        if (player == 0){
                            if(map[H[n] + j][W[n] + i] == 'b'){
                                map[H[n] + j][W[n] + i] = 'g';
                            }else if(map[H[n] + j][W[n] + i] == 'g'){
                                map[H[n] + j][W[n] + i] = 'b';
                            }else{
                                map[H[n] + j][W[n] + i] = 'r';
                            }
                        }
                    
                        else if (player == 1){
                            if(map[H[n] + j][W[n] + i] == 'g'){
                                map[H[n] + j][W[n] + i] = 'r';
                            }else if(map[H[n] + j][W[n] + i] == 'r'){
                                map[H[n] + j][W[n] + i] = 'g';
                            }else{
                                map[H[n] + j][W[n] + i] = 'b';
                            }
                        }
                    
                        else if (player == 2){
                            if(map[H[n] + j][W[n] + i] == 'r'){
                                map[H[n] + j][W[n] + i] = 'b';
                            }else if(map[H[n] + j][W[n] + i] == 'b'){
                                map[H[n] + j][W[n] + i] = 'r';
                            }else{
                                map[H[n] + j][W[n] + i] = 'g';
                            }
                        }
                    }
                }
            }

            player += 1;
            if(player == 3){
                player = 0;
            }
        }


        System.out.println();
        for(int j = 0; j < Y; j++){
            for(int i = 0; i < X; i++){
                if (map[j][i] == 'r'){
                    p1 += 1;
                }

                if (map[j][i] == 'b'){
                    p2 += 1;
                }

                if (map[j][i] == 'g'){
                    p3 += 1;
                }

                System.out.print(map[j][i]);
            }
            System.out.println();
        }


        System.out.println(p1 + " " + p2 + " "+ p3);
        sc.close();
    }
}
