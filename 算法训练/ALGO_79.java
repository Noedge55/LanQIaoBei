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
        for(int i = 0 ; i < n ; i ++){  //��tempArr�����¼arr��ķ���Ԫ�أ�����count��¼����Ԫ�ص���Ŀ
            if(arr[i] != 0){
                tempArr[count++] = arr[i] ;
            }
        }
        System.out.println(count);  //�������Ԫ�صĸ���
        for(int i = 0 ; i < count ; i++){   //���������
            System.out.print(tempArr[i] + " ");
        }
        return count ;
    }

}