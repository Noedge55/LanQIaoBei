package b.project;

import java.util.Scanner;

public class B_1004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String strName[] = new String[N];
		String strID[] = new String[N];
		int scores[] = new int[N];
		int max = 0, min = 100, indexMax = 0, indexMin = 0;
		for (int i = 0; i < N; i++) {
			strName[i] = scanner.next();
			strID[i] = scanner.next();
			scores[i] = scanner.nextInt();
			if (max < scores[i]) {
				max = scores[i];
				indexMax = i;
			}
			if (min > scores[i]) {
				min = scores[i];
				indexMin = i;
			}
		}
		if(N > 0){
			System.out.println(strName[indexMax] + " " + strID[indexMax]);
			System.out.println(strName[indexMin] + " " + strID[indexMin]);						
		}
	}
}