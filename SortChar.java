public class SortChar{
    public static void main(String[] args) {
        String str = "bckfqlajhemgiodnp" ;
        long fs[] = new long[17] ;
        fs[0] = 1;
        for(int i = 1 ; i < 17 ; i++){//1~16µÄ½×³Ë
            fs[i] = fs[i-1] * i ;
        }
        long sum = 0;
        for(int i = 0 ; i < 16 ; i++){
            char tempCh = str.charAt(i);
            int k = 0 ;
            for(int j = i + 1 ; j < 17 ; j ++){
                if(tempCh-'a' > str.charAt(j)-'a'){
                    k ++ ;
                }
            }
            sum += k * fs[16 - i] ;
        }
        System.out.println(sum);
    }
}