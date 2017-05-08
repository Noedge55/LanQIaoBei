import java.util.Scanner;

public class ALGO_86 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0 , s = 0 , n = 0 ;
        if(scanner.hasNext()){  //输入m,s,n
            m = scanner.nextInt() ;
            s = scanner.nextInt() ;
            n = scanner.nextInt() ;
        }
        //定义两个矩阵,行列数分别为m,s与s,n
        int arr1[][] = new int[m][s] ;
        int arr2[][] = new int[s][n] ;
        for(int i = 0 ; i < m ; i ++){  //输入第一个矩阵
            for(int j = 0 ; j < s ; j++){
                if(scanner.hasNext()){
                    arr1[i][j] = scanner.nextInt() ;
                }
            }
        }
        for(int i = 0 ; i < s ; i++){   //输入第二个矩阵
            for(int j = 0 ; j < n ; j++){
                if(scanner.hasNext()){
                    arr2[i][j] = scanner.nextInt() ;
                }
            }
        }
        int arr[][] = new int[m][n] ;   //定义一个相乘后的矩阵，矩阵的行数与列数为m，n
        for(int i = 0 ; i < m ; i++){   //进行矩阵相乘
            for(int j = 0 ; j < n ; j++){
                for(int x = 0 ; x < s ; x ++){  //arr[i][j] = arr1[i][1] * arr2[1][j] + ... + arr1[i][s-1] * arr2[s-1][j] 
                    arr[i][j] += arr1[i][x] * arr2[x][j] ;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}