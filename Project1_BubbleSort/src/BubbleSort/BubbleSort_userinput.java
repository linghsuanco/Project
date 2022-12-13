package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_userinput {

	public static void main(String[] args) {
		int j,i,tmp;
		
		System.out.print("Entee the length : ");
		Scanner len = new Scanner(System.in);
		int length = len.nextInt();
        int arr1[] = new int[length];
        System.out.print("Enter "+length+" numbers : ");
        for(j=0;j<length;j++){
        	arr1[j]=len.nextInt();
        	if(j == length) 
        	{
        		len.close();

        	}
        }
	    System.out.println("Before sort :"+Arrays.toString(arr1));
	    len.close();
	    for(j=0;j<length-1;j++)
	    {
	    	for(i=0;i<length-1;i++)
	    	{
	    		if(arr1[i]>arr1[i+1])
	    		{
	    			tmp=arr1[i];
                    arr1[i]=arr1[i+1];
                    arr1[i+1]=tmp;
	    		}
	    	}
	    }
	    System.out.println("After sort :"+Arrays.toString(arr1));

	}
	
}
