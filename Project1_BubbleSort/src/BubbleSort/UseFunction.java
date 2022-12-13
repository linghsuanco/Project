package BubbleSort;
import java.util.Arrays;

public class UseFunction {

	public static void main(String[] args) {
		int[] arr1={58,24,90,34,66,12};
		int j,i;
		
		 for(j=0;j<5;j++)
	     {
	            for(i=0;i<5;i++)
	          {
	                if(arr1[i]>arr1[i+1])
	                {
	                	BubbleSort(arr1,i);
	                }
	         }
	      }
	     System.out.println(Arrays.toString(arr1));
	}
	public static void BubbleSort(int[] arr1,int i)
	{
		int tmp;
		tmp=arr1[i];
        arr1[i]=arr1[i+1];
        arr1[i+1]=tmp;
	}

}
