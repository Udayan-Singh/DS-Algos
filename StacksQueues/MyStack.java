package StacksQueues;

class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    top++;
        arr[top] = a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        int a = arr[top];
        top--;
        return a;
	}
}
