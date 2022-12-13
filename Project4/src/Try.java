import java.util.Stack;


class data{
	

	void add_data(Stack<String> stack,String[]sentence){
		int i;
		for( i=0 ; i<12 ; i++)
		{
			stack.push(sentence[i]);
		}
	}
	void print(Stack<String> stack,String[]sentence)
	{
		int j;
		System.out.println("\nAfter :");
		for (j=0 ; j<12 ;j++)
		{
			sentence[j]=stack.pop();
			System.out.printf("%s",sentence[j]);
		}
	}
}

public class Try {

	public static void main(String[] args) {
		String[] sentence = {"H","e","l","l","o"," ","W","o","r","l","d","!"};
		System.out.println("Before :");
		for (int j=0 ; j<12 ;j++)
		{
			System.out.printf("%s",sentence[j]);
		}
		Stack<String> stack = new Stack<String>();
		data d = new data();
		d.add_data(stack,sentence);
		d.print(stack,sentence);
	}
}
