package paiza;

import java.util.Scanner;

public class trump {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        int[][] trumpMap = new int[H][W];
        for (int h = 0; h < H; h++){
            for (int w = 0; w < W; w++){
                trumpMap[h][w] = sc.nextInt();
            }
        }

        int L =sc.nextInt();

        int[] x1 = new int[L];
        int[] y1 = new int[L];
        int[] x2 = new int[L];
        int[] y2 = new int[L];

        for (int l = 0; l < L; l++){
            x1[l] = sc.nextInt();
            y1[l] = sc.nextInt();
            x2[l] = sc.nextInt();
            y2[l] = sc.nextInt();
        }
        int player = 1;

        int[] count = new int[N];

        for (int l = 0; l < L; l++){
            int firstCard = trumpMap[x1[l] - 1][y1[l-1]];
            int secondCard = trumpMap[x2[l] - 1][y2[l-1]];

            if (firstCard == secondCard){
                count[player - 1] += 2;
            }else{
                player += 1;

                if (player == N + 1){
                    player = 1;
                }
            }
        }

        for (int n = 0; n < N; n++){
            System.out.println(count[n]);
        }

        sc.close();

    }
}
