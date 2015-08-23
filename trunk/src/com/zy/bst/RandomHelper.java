package com.zy.bst;

import java.util.Random;

public class RandomHelper {
	//输入一个已有数据的数组，将其随机重排列。
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
