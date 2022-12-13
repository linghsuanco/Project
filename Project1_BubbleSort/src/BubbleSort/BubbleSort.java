package BubbleSort;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr1={58,24,90,34,66,12};
	      int j,i,tmp;
	     for(j=0;j<5;j++)
	     {
	            for(i=0;i<5;i++)
	          {
	                if(arr1[i]>arr1[i+1])
	                {
	                    tmp=arr1[i];
	                    arr1[i]=arr1[i+1];
	                    arr1[i+1]=tmp;
	                }
	         }
	      }
	     System.out.println(Arrays.toString(arr1));
	}

}
