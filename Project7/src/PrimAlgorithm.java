class data{

    void  Prim(int [][] arr,int start_node)
    {
    	int index = 0,i=0,j=0,min=0,Pmin=0,k=0;
    	int[] P = new int[9];
    	P[0]=0;
    	for(i=1;i<9;i++)
    	{
    		P[i]=100;
    	}
		
    	for(i=1;i<9;i++)
    	{
    		for(j=0;j<9;j++)
    		{
    			if(arr[index][j] > 0)
    			{
    				min = arr[index][j];
    				Pmin = j;
    				break;
    			}
    		}
    		while(j<9)
    		{
    			if( min > arr[index][j] )
    			{
    				for(k=0;k<9;k++)
    				{
    					if(index!=P[k]| P[k] == 100)
    					{
    						min = arr[index][j];
    						Pmin = j;
    					}
    					
    				}
    			}
    			j++;
    		}
    		index = Pmin;
    		P[i] = Pmin;
    	}
    	for(i=0;i<9;i++)
    	{
    		System.out.println("P :"+P[i]);
    	}
		
    }
	

}

public class PrimAlgorithm  {

	public static void main(String[] args) {
	
		int[][] arr = {
				{0, 4, 0, 0, 0, 0, 0, 8, 0},
				{4, 0, 8, 0, 0, 0, 0, 11, 0},
				{0, 8, 0, 7, 0, 4, 0, 0, 2},
				{0, 0, 7, 0, 9, 14, 0, 0, 0},
				{0, 0, 0, 9, 0, 10, 0, 0, 0},
				{0, 0, 4, 14, 10, 0, 2, 0, 0},
				{0, 0, 0, 0, 0, 2, 0, 1, 6},
				{8, 11, 0, 0, 0, 0, 1, 0, 7},
				{0, 0, 2, 0, 0, 0, 6, 7, 0}
		};
		data info = new data();
		info.Prim(arr,0);

	}

}