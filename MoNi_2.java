package com.test;

public class MoNi_2 {
	public static void main(String[] args) {
		/*
		 * �ó˷���ʽ���ո�ʽһ����6������������5����λ����һ��5λ��
		 * ������ٳ���ǰ���������λ�����������뱻�����Ϳ�һ�����������
		 */
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int num[] = new int[6];	//����һ������Ϊ6�������������ֱ�����6����
				num[0] = i;
				num[1] = j;
				num[2] = i * (j % 10);
				num[3] = i * (j / 10 % 10);
				num[4] = i * (j / 100);
				num[5] = i * j;			//����ʽ�Ľ��
				if(num[2] >= 100 && num[2] < 1000 
				&& num[3] >= 100 && num[3] < 1000 
				&& num[4] >= 100 && num[4] < 1000 
				&& num[5] >= 10000 && num[5] <100000){//�жϸ���ʽ�ĸ�ʽ�Ƿ�������Ŀ����Ҫ��
					if (judge(num)) {
						System.out.println(num[5]);
					}					
				}
			}
		}
	}

	private static boolean judge(int[] num) {//�ж���6�����У�0-9��10�����ֳ��ֵĴ����Ƿ�Ϊ2
		int count[] = new int[10];	//���0-9���Ǹ����ֳ��ֵĴ���
		for (int i = 0; i < num.length; i++) {
			int temp = num[i] ;
			//ͨ��ȡ�����ȡ�����������е�ÿһ������
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
