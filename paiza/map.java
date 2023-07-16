package paiza;

import java.util.Scanner;

public class map {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int H; //y
        int W; //x
        H = sc.nextInt();
        W = sc.nextInt();
    
        char[][] map = new char[H][W];
        for (int h = 0; h < H; h++){
            String line = sc.next();            
            for (int w = 0; w < W; w++){
                map[h][w] = line.charAt(w);
            }
        }

        int y;
        int x;
        y = sc.nextInt();
        x = sc.nextInt();

        if(map[y][x] == '#'){
            map[y][x] = '.';
        }else{
            map[y][x] = '#';
        }
        
        for(int a = -1; a < 2; a++){
            if(0 <= (y + a) && (y + a) < H){
                if(map[y + a][x] == '#'){
                    map[y + a][x] = '.';
                }else if(map[y + a][x] == '.'){
                    map[y + a][x] = '#';
                }
            }       
        }

        for(int a = -1; a < 2; a++){
            if(0 <= (x + a) && (x + a) < W){
                if(map[y][x + a] == '#'){
                    map[y][x + a] = '.';
                }else if(map[y][x + a] == '.'){
                    map[y][x + a] = '#';
                }
            }       
        }

        for (int h = 0; h < H; h++){
            for (int w = 0; w < W; w++){
                System.out.print(map[h][w]);
            }
            System.out.println();
        }
        sc.close();
    }
}
