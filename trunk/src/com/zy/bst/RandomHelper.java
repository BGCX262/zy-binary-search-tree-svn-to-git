package com.zy.bst;

import java.util.Random;

public class RandomHelper {
	//����һ���������ݵ����飬������������С�
	public static void RandomizeArray(int arr[]){
		int temp, tempi;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			tempi = RandomBetween(i, len-1);
			temp = arr[i];
			arr[i] = arr[tempi];
			arr[tempi] = temp;
		}
	}
	public static int RandomBetween(int start, int end)
	{
		Random random = new Random();
		return random.nextInt(end-start+1) + start;
	}
}
