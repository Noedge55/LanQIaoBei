package b.project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_1003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int N = scanner.nextInt() ;
		for(int i = 0 ; i < N ;i++){
			String str = scanner.next() ;
			int count1 = 0,count2 = 0 , count3 = 0 ;
			int indexP = 0 ,indexT=0 ;
			Pattern pattern = Pattern.compile("A*PA+TA*") ;
			Matcher matcher = pattern.matcher(str) ;
			if(matcher.matches()){
				for(int j = 0 ; j < str.length() ; j++){
					if(str.charAt(j) == 'P'){
						indexP = j ;
					}
					if(str.charAt(j) == 'T'){
						indexT = j ;
					}
				}
				count1 = indexP ;
				count2 = indexT - indexP - 1;
				count3 = str.length() - indexT - 1;
				if(count1 * count2 == count3){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}
	}

}
