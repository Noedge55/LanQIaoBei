import java.util.Scanner;

public class ALGO_95 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int num = scanner.nextInt() ;   
        fun(num) ;
    }

    private static void fun(int num) {
        String  numStr = Integer.toBinaryString(num) ;  //����ʮ������ת��Ϊ��������
        int numArr[] = new int[numStr.length()] ;   //������������¼����������Ϊ1�Ĵ���
        int k = 0 ;
        for(int i = 0 ; i < numStr.length() ; i++){
            if(numStr.charAt(i) == '1'){
                numArr[k] = numStr.length() - i - 1 ;   //��¼����
                k ++ ;
            }
        }
        for(int i = 0 ; i < k ; i++){   
            if(numArr[i] == 0){     //������Ϊ0ʱ
                System.out.print("2(0)");
            }else if(numArr[i] == 1){   //������Ϊ1ʱ
                System.out.print("2") ;
            }else if(numArr[i] == 2){   //������Ϊ2ʱ
                System.out.print("2(2)");
            }else if(numArr[i] > 2){    //�����ݴ���2ʱ
                System.out.print("2(");
                fun(numArr[i]) ;        //�ݹ����fun()
                System.out.print(")");
            }
            if(i != k - 1){
                System.out.print("+");
            }
        }
    }

}