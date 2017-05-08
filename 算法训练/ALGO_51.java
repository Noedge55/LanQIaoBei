import java.util.Scanner;
public class PrimeNum {
    public static void main(String args[]){
        int n = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        if(scanner.hasNext()){
            n = scanner.nextInt() ;
        }
        caculator(n) ;
    }
    private static void caculator(int n) {
        int count = 0 ; //记录质数的数量
        int num = 2 ;   //质数从2开始算起
        int product=1 ; //声明乘积变量并初始化为1
        while(count < n){//当count == n时停止计算质数
            int i ;
            for(i = 2 ; i < num ; i ++){ //算出num是不是质数
                if(num % i == 0){
                    break ;
                }
            }
            if(i == num){//若num是质数
                product *= num ;    //计算乘积
                count ++ ;          //计数器+1
            }
            num ++ ;    //准备计算下一个数是不是质数
        }
        System.out.println(product % 50000);//输出乘积并对50000取模
    }
}