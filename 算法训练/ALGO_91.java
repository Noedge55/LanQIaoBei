import java.util.Scanner;

public class ALGO_91 {
    public static void main(String[] args) {
        String str1 = "",str2 = "" ;    
        Scanner scanner = new Scanner(System.in) ;
        if(scanner.hasNext()){  //分别输入两个字串
            str1 = scanner.next() ;
            str2 = scanner.next() ;
        }
        if(str1.length() != str2.length()){ //两个字符串不相等，绝对不是Anagrams
            System.out.println("N");
            return ;
        }
        //将两个字串中的所有字母都转换为大写字母，避免出现大小写不匹配的问题
        str1 = str1.toUpperCase() ; 
        str2 = str2.toUpperCase() ;

        int count1[] = new int[str1.length()] ; //声明一个数组统计str1中所有字母分别出现的次数
        for(int i = 0 ; i < str1.length() ; i++){
            char ch1 = str1.charAt(i) ; //取出str1的第i个字母
            for(int j = 0 ; j < str1.length() ; j++){   //将ch1与字串str1中所有的字母进行比较，统计ch1出现的次数
                char ch2 = str1.charAt(j) ;
                if(ch1 == ch2){
                    count1[i] ++ ;
                }
            }
        }
        int count2[] = new int[str2.length()] ; //声明一个数组统计str1中字母在str2中出现的次数
        for(int i = 0 ; i < str1.length() ; i++){
            char ch1 = str1.charAt(i) ;
            for(int j = 0 ; j < str2.length() ; j++){
                char ch2 = str2.charAt(j) ;
                if(ch1 == ch2){
                    count2[i] ++ ;
                    if(count2[i] > count1[i]){  //若str2中的ch1出现的次数大于str1中ch1出现的次数，则这两个字串绝对不是Anagrams
                        System.out.println("N");
                        return ;
                    }
                }
            }
            if(count1[i] != count2[i]){ //若str2中的ch1出现的次数不等于str1中ch1出现的次数，则这两个字串绝对不是Anagrams
                System.out.println("N");
                return ;
            }
        }
        System.out.println("Y");
    }
}