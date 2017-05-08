import java.util.Scanner;
public class DeleteZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = 0 ;
        n = scanner.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            arr[i] = scanner.nextInt() ;
        }
        compactIntegers(arr,n) ;
    }

    private static int compactIntegers(int[] arr, int n) {
        int count = 0 ;
        int tempArr[] = new int[n] ;
        for(int i = 0 ; i < n ; i ++){  //用tempArr数组记录arr里的非零元素，并用count记录非零元素的数目
            if(arr[i] != 0){
                tempArr[count++] = arr[i] ;
            }
        }
        System.out.println(count);  //输出非零元素的个数
        for(int i = 0 ; i < count ; i++){   //输出新数组
            System.out.print(tempArr[i] + " ");
        }
        return count ;
    }

}