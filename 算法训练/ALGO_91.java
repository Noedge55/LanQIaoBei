import java.util.Scanner;

public class ALGO_91 {
    public static void main(String[] args) {
        String str1 = "",str2 = "" ;    
        Scanner scanner = new Scanner(System.in) ;
        if(scanner.hasNext()){  //�ֱ����������ִ�
            str1 = scanner.next() ;
            str2 = scanner.next() ;
        }
        if(str1.length() != str2.length()){ //�����ַ�������ȣ����Բ���Anagrams
            System.out.println("N");
            return ;
        }
        //�������ִ��е�������ĸ��ת��Ϊ��д��ĸ��������ִ�Сд��ƥ�������
        str1 = str1.toUpperCase() ; 
        str2 = str2.toUpperCase() ;

        int count1[] = new int[str1.length()] ; //����һ������ͳ��str1��������ĸ�ֱ���ֵĴ���
        for(int i = 0 ; i < str1.length() ; i++){
            char ch1 = str1.charAt(i) ; //ȡ��str1�ĵ�i����ĸ
            for(int j = 0 ; j < str1.length() ; j++){   //��ch1���ִ�str1�����е���ĸ���бȽϣ�ͳ��ch1���ֵĴ���
                char ch2 = str1.charAt(j) ;
                if(ch1 == ch2){
                    count1[i] ++ ;
                }
            }
        }
        int count2[] = new int[str2.length()] ; //����һ������ͳ��str1����ĸ��str2�г��ֵĴ���
        for(int i = 0 ; i < str1.length() ; i++){
            char ch1 = str1.charAt(i) ;
            for(int j = 0 ; j < str2.length() ; j++){
                char ch2 = str2.charAt(j) ;
                if(ch1 == ch2){
                    count2[i] ++ ;
                    if(count2[i] > count1[i]){  //��str2�е�ch1���ֵĴ�������str1��ch1���ֵĴ��������������ִ����Բ���Anagrams
                        System.out.println("N");
                        return ;
                    }
                }
            }
            if(count1[i] != count2[i]){ //��str2�е�ch1���ֵĴ���������str1��ch1���ֵĴ��������������ִ����Բ���Anagrams
                System.out.println("N");
                return ;
            }
        }
        System.out.println("Y");
    }
}