class data{
	void dijkstra(int [][] arr,int start_node)
	{
		int i=0,j=0,len=0;
		int[] dis = new int [10];
		int[] pre_node = new int [10];
		int comp=0,num=0,pre;

		for(i=0;i<=8;i++)
		{
			dis[i] = 0;
		}

		for(i=0;i<10;i++)
		{

			for(j=0;j<=8;j++)
			{
				
				if(arr[start_node][j]!=0)
				{
					if(start_node >= 1)
					{
						len = arr[start_node][j]+dis[start_node];
					}
					else {
						len = arr[start_node][j];
					}
					if(dis[j] == 0 || len <= dis[j])
					{
						dis[j] = len;
						pre_node[j] = start_node;
					}
					
					if(comp == 0 | comp > dis[j]   )
					{
						comp = dis[j];		
						num = j;
					}
				}
			
			}
			start_node = num;
			comp = 0;

		}
		
		System.out.println("Output result:");
		for(i=0;i<=8;i++)
		{
			System.out.println("node 0 to node" + i);
			System.out.println("Distance : "+dis[i]);
			j=i;
			pre = pre_node[j];
			System.out.println("node: "+j);
			while( pre != 0)
			{
				System.out.print("pre_node: "+pre);
				System.out.println(' ');
				pre = pre_node[pre];
			}
			
			System.out.println('\n');
			
		}
	}
	
}
public class DijkstraAlgorithm {

	public static void main(String[] args) {
	
		int [][] arr = {
				{0, 4, 0, 0, 0, 0, 0, 8, 0},
				{0, 0, 8, 0, 0, 0, 0, 11, 0},
				{0, 0, 0, 7, 0, 4, 0, 0, 2},
				{0, 0, 0, 0, 9, 14, 0, 0, 0},
				{0, 0, 0, 0, 0, 10, 0, 0, 0},
				{0, 0, 4, 14, 10, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 2, 0, 0, 6},
				{0, 0, 0, 0, 0, 0, 1, 0, 7},
				{0, 0, 2, 0, 0, 0, 6, 0, 0}
		};
		data info = new data();
		info.dijkstra(arr,0);
	}
	

}
