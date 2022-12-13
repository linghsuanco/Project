import java.util.*;



public class test {
    public static void main(String args[])
    {
        int i,n=5;
        Stack<Integer> stack_1 = new Stack<Integer>();
        Stack<Integer> stack_2 = new Stack<Integer>();
        Stack<Integer> stack_3 = new Stack<Integer>();

        for(i=0;i<5;i++)
        {
            stack_1.push(n);
            n--;
        }  
         
        Hanoi(stack_1, stack_2, stack_3);

        if(stack_1.empty())
        System.out.println("stack 1 is empty");

        if(stack_2.empty())
        System.out.println("stack 2 is empty");
        for(i=0;i<5;i++)
        {
           System.out.println("stack 3: "+ stack_3.pop());

        }   

    }

    public static void Hanoi(Stack<Integer> stack_1 , Stack<Integer> stack_2 , Stack<Integer> stack_3 ) 
    {
        if( stack_3.size() == 5)
        {
            return;
        }
 
        if ((stack_2.empty() || stack_3.empty()) )
        {
            stack_3.push(stack_1.pop()); // 1 --> 3

            if( stack_3.size() == 5)
            {
                return;
            }

            else if((stack_3.peek()==1 || stack_2.empty()) && !stack_1.empty()){
                stack_2.push(stack_1.pop());  // 1 --> 2
                stack_2.push(stack_3.pop()); // 3 --> 2

                Hanoi(stack_1, stack_2, stack_3);
            }
            else{
                stack_1.push(stack_2.pop()); // 2 --> 1
                stack_3.push(stack_2.pop());  // 2 --> 3

                Hanoi(stack_1, stack_2, stack_3);
            }
        }
        else
        {                     

            if(stack_2.peek()==1 && stack_3.peek()==2)
            {
                stack_1.push(stack_3.pop());
                stack_1.push(stack_2.pop());
                if(stack_3.peek()==5)
                {
                    stack_3.push(stack_2.pop());
                    Hanoi(stack_1, stack_2, stack_3);
                }
                else
                {
                    stack_2.push(stack_3.pop());
                    Hanoi(stack_1, stack_2, stack_3);
                }
                
            }
            else
            {
                stack_3.push(stack_1.pop());
                if((stack_3.peek()==1 || stack_2.empty()) && !stack_1.empty())
                {
                    stack_2.push(stack_1.pop());  // 1 --> 2
                    stack_2.push(stack_3.pop()); // 3 --> 2
                    Hanoi(stack_1, stack_2, stack_3);
                }
                else if (stack_1.empty() && stack_2.peek()==1){
                    stack_1.push(stack_2.pop()); // 2 --> 1 
                    stack_3.push(stack_2.pop());  // 2 --> 3
                    Hanoi(stack_1, stack_2, stack_3);
                }
                else
                {
                    stack_1.push(stack_2.pop()); // 2 --> 1 
                    stack_2.push(stack_3.pop());  // 3 --> 2
                    Hanoi(stack_1, stack_2, stack_3);
                }

            }
                
        }
            
    }
       
}


