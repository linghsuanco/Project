package MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort_userinput {
	public static void main(String[] args) {
		System.out.print("Enter the array length : ");
		Scanner num = new Scanner(System.in);
		int len = num.nextInt();
		int[] arr1 = new int[len];
		System.out.print("Enter the "+len+" numbers :");
		for(int j=0;j<len;j++){
        	arr1[j]=num.nextInt();
        }
	    System.out.println("Before sort :"+Arrays.toString(arr1));
		mergesort(arr1,0,len-1); //房間號0到房間號4
	    System.out.println("After sort :"+Arrays.toString(arr1));
	    num.close();
	}
	public static void mergesort(int[]arr,int left, int right)
	{
		if(left < right)
		{
			int mid=(left+right)/2; //因為
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right); //這邊是右邊，所以最一開始中間加1(房間號)，right(最後一房)
			merge(arr,left,mid,right);
		}

	}
	public static void merge(int[] arr, int left,int mid, int right)
	{
		int left_len=mid-left+1; //左邊減中間+1計算左邊長度，+1是因為mid
		int right_len=right-mid; // 右邊減中間，計算右邊長度
		int[] l = new int[left_len]; 
		int[] r = new int[right_len]; 
		
		int x;
		for(x=0;x<left_len;x++)
		{
			l[x]=arr[x+left]; //+left是因為不加的話後面merge時部會從0號房開始
		}
		for(x=0;x<right_len;x++)
		{
			r[x]=arr[x+1+mid]; //mid+1是因為，mid在left的一部分，所以要跳過mid，mid+1就是right房間
		}
		int i=0,j=0,k;
		for(i=0,j=0,k=left;k<=right;k++) 
		{
			if(i < left_len && (j >= right_len || l[i] <= r[j] ))
			{
				arr[k]=l[i];
				i++;
			}
			else
			{
				arr[k]=r[j];
				j++;
			}
		}
	}

}
