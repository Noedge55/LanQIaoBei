import java.util.Scanner;

public class ALGO_95 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int num = scanner.nextInt() ;   
        fun(num) ;
    }

    private static void fun(int num) {
        String  numStr = Integer.toBinaryString(num) ;  //将该十进制数转化为二进制数
        int numArr[] = new int[numStr.length()] ;   //利用数组来记录二进制数中为1的次幂
        int k = 0 ;
        for(int i = 0 ; i < numStr.length() ; i++){
            if(numStr.charAt(i) == '1'){
                numArr[k] = numStr.length() - i - 1 ;   //记录次幂
                k ++ ;
            }
        }
        for(int i = 0 ; i < k ; i++){   
            if(numArr[i] == 0){     //当次幂为0时
                System.out.print("2(0)");
            }else if(numArr[i] == 1){   //当次幂为1时
                System.out.print("2") ;
            }else if(numArr[i] == 2){   //当次幂为2时
                System.out.print("2(2)");
            }else if(numArr[i] > 2){    //当次幂大于2时
                System.out.print("2(");
                fun(numArr[i]) ;        //递归调用fun()
                System.out.print(")");
            }
            if(i != k - 1){
                System.out.print("+");
            }
        }
    }

}