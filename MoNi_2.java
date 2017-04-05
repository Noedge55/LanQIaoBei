package com.test;

public class MoNi_2 {
	public static void main(String[] args) {
		/*
		 * 该乘法算式按照格式一共有6个数，其中有5个三位数和一个5位数
		 * 此题穷举出最前面的两个三位数，即乘数与被乘数就可一算出其他的数
		 */
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int num[] = new int[6];	//声明一个容量为6的整型数组来分别存放这6个数
				num[0] = i;
				num[1] = j;
				num[2] = i * (j % 10);
				num[3] = i * (j / 10 % 10);
				num[4] = i * (j / 100);
				num[5] = i * j;			//该算式的结果
				if(num[2] >= 100 && num[2] < 1000 
				&& num[3] >= 100 && num[3] < 1000 
				&& num[4] >= 100 && num[4] < 1000 
				&& num[5] >= 10000 && num[5] <100000){//判断该算式的格式是否满足题目所给要求
					if (judge(num)) {
						System.out.println(num[5]);
					}					
				}
			}
		}
	}

	private static boolean judge(int[] num) {//判断这6个数中，0-9这10个数字出现的次数是否都为2
		int count[] = new int[10];	//存放0-9这是个数字出现的次数
		for (int i = 0; i < num.length; i++) {
			int temp = num[i] ;
			//通过取余操作取出这六个数中的每一个数字
			while (temp != 0) {	
				count[temp % 10]++;
				temp /= 10 ;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (count[i] != 2) {
				return false;
			}
		}
		return true;
	}
}
