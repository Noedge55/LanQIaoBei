import java.util.Scanner;

public class ALGO_124 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		N = scanner.nextInt() ;
		int dp[][] = new int[N+2][N+2];
		int num[][] = new int[N+1][N+1];
		for(int i = 1 ; i <= N ;i++){
			for(int j = 1 ; j <= i ; j++){
				num[i][j] = scanner.nextInt() ;
			}
		}
		for(int i = N ; i >=1 ; i--){
			for(int j = 1 ; j <= i ; j++){
				dp[i][j] = max(dp[i+1][j]+num[i][j],dp[i+1][j+1]+num[i][j]) ; 
			}
		}
		System.out.println(dp[1][1]);
		scanner.close();
	}
	public static int max(int a,int b){
		return a>b?a:b;
	}
}
