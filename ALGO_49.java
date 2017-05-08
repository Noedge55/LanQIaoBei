import java.util.Scanner;
public class ALGO_49 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in) ;
        if(scanner.hasNext()){
            n = scanner.nextInt() ;
        }
        int arr[] = new int[n] ;
        int max= 0  ,index = 0;     //max表示最大值，index表示最大值元素的下标
        for(int i = 0 ; i < n ; i ++){
            if(scanner.hasNext()){
                arr[i] = scanner.nextInt() ;
            }
            if(max < arr[i]){//若max小于该数组元素,则max等于该元素，并用index记录当前元素的下标
                max = arr[i] ;
                index = i ;
            }
        }
        System.out.println(max + " " + index);
    }
}