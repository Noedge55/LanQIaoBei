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
        int count = 0 ; //��¼����������
        int num = 2 ;   //������2��ʼ����
        int product=1 ; //�����˻���������ʼ��Ϊ1
        while(count < n){//��count == nʱֹͣ��������
            int i ;
            for(i = 2 ; i < num ; i ++){ //���num�ǲ�������
                if(num % i == 0){
                    break ;
                }
            }
            if(i == num){//��num������
                product *= num ;    //����˻�
                count ++ ;          //������+1
            }
            num ++ ;    //׼��������һ�����ǲ�������
        }
        System.out.println(product % 50000);//����˻�����50000ȡģ
    }
}