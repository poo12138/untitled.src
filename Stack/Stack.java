package Stack;
import java.lang.*;
public class Stack {

   private int[] stackElem;
    private int top;
    SqStack fuzhu;
    public boolean isEmpty()
    {
        return top==0;
    }
    public int length()
    {
        return top;
    }
    public Stack(){

    }


    public Stack(int maxSize)
    {
        stackElem=new int[maxSize];
        fuzhu=new SqStack(maxSize);
        top=0;
    }
    public Object peek()
    {
        if(!isEmpty())
            return stackElem[top-1];
        else
            return null;
    }
    public void push(int x) throws Exception
    {
        if(top==stackElem.length)
        {
            throw new Exception("栈已满！");
        }
        else
        {
            stackElem[top++]=x;
        }
        if(fuzhu.isEmpty()==true){
            fuzhu.push(x);
        }else {
            int temp=(int)fuzhu.peek();
            if(temp>x) {
                fuzhu.push(x);
            }else{
                fuzhu.push(temp);
            }
        }
    }
    public Object pop() throws Exception
    {
        if(top==0)
        {
            throw new Exception("栈为空！");
        }

            top=top-1;
            return stackElem[top];
        //删除然后返回现在的栈顶
    }
    public void display()
    {
        for(int i=length()-1; i>=0; i--)     //ps:不能用stackElem;length ywei1全局变量 在这个函数域内改变并不会影响全局 用了这个不能出栈
        {
            System.out.print(stackElem[i]+" ");
        }
        System.out.println();
    }

    /*
     * @return: An integer
     */
    public int min()throws Exception   {
        // write your code here
//            int temp = stackElem[length() - 1];
//            for (int i = length() - 1; i > 0; i--) {
//                if (temp > stackElem[i - 1]) {
//                    temp = stackElem[i - 1];
//                }
//            }
        if(fuzhu.isEmpty())
            throw new Exception("栈中无元素");
        else
        return (int)fuzhu.peek();
    }
    public static void main(String[] args) throws Exception
    {
        Stack sqStack=new Stack(30);
        sqStack.push(3);
        sqStack.push(6);
        sqStack.push(1);
        sqStack.push(-2);
        sqStack.push(2);
        sqStack.push(4);
        sqStack.push(7);

        int min=sqStack.min();

        System.out.println(min);
        System.out.print("打印输出： ");
        sqStack.display();

        sqStack.pop();
        Object s= sqStack.pop();
        System.out.println(s);
        System.out.print("弹出栈顶，打印输出： ");
        sqStack.display();
    }
}
