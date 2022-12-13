import java.util.Stack;

class data{
	
	
	void add_data(Stack<Integer> stack_1,Stack<Integer> stack_2,Integer numbers[],int arr_len)
	{
		int i=0;
		for (;i<arr_len;i++)
		{
			stack_1.push(numbers[i]);
			
		}
		stack_2.clear();
		
	}
	void bubble_sort(Stack<Integer> stack_1,Stack<Integer> stack_2 )
	{
		int tmp;
		
		while(!stack_1.empty())
		{

			tmp = stack_1.pop();
			if(stack_2.empty() || tmp < stack_2.peek()  )
			{
				stack_2.push(tmp);
			}
			else if(tmp > stack_2.peek())
			{
				while(!stack_2.empty() && tmp > stack_2.peek())
				{
					stack_1.push(stack_2.pop());
				}
				stack_2.push(tmp);
			}
		}
	}
}
public class project5 {

	public static void main(String[] args) {
		Stack<Integer> stack_1 = new Stack<Integer>();
		Stack<Integer> stack_2 = new Stack<Integer>();
		Integer[] numbers = {35, 22, 78, 12, 14,19};
		int i;
		int len = numbers.length;
		data d = new data();
		d.add_data(stack_1,stack_2, numbers,len);
		System.out.println("Before :");
		for (i=0;i<6;i++)
		{
			System.out.print(numbers[i]+" ");
		}
		d.bubble_sort(stack_1, stack_2);
		System.out.println("\nAfter :");
		for (i=0;i<6;i++)
		{
			System.out.print(stack_2.pop()+" ");
		}
	}
}
