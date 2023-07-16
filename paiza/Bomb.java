package paiza;
import java.util.Scanner;

public class Bomb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int X = sc.nextInt();

        int count = 0;
//map作成
        char[][] map = new char[Y][X];
        for(int y = 0; y < Y; y++){
            String line = sc.next();
            for(int x = 0; x < X; x++){
                map[y][x] = line.charAt(x);
            }
        }
//爆発
        for(int y = 0; y < Y; y++){
            for(int x = 0; x < X; x++){
                if(map[y][x] == '#'){
                    for(int i = 0; i < X; i++){
                        if(map[y][i] != '#'){
                            map[y][i] = '!';
                        }
                    }

                    for(int j = 0; j < Y; j++){
                        if(map[j][x] != '#'){
                            map[j][x] = '!';
                        }
                    }
                }
                
            }
        }
//カウント
        for(int y = 0; y < Y; y++){
            for(int x = 0; x < X; x++){
                if (map[y][x] == '#' || map[y][x] =='!'){
                    count += 1;
                }

            }
        }

        System.out.println(count);


        sc.close();
    }
}
