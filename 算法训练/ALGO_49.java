import java.util.Scanner;
public class ALGO_49 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in) ;
        if(scanner.hasNext()){
            n = scanner.nextInt() ;
        }
        int arr[] = new int[n] ;
        int max= 0  ,index = 0;     //max��ʾ���ֵ��index��ʾ���ֵԪ�ص��±�
        for(int i = 0 ; i < n ; i ++){
            if(scanner.hasNext()){
                arr[i] = scanner.nextInt() ;
            }
            if(max < arr[i]){//��maxС�ڸ�����Ԫ��,��max���ڸ�Ԫ�أ�����index��¼��ǰԪ�ص��±�
                max = arr[i] ;
                index = i ;
            }
        }
        System.out.println(max + " " + index);
    }
}