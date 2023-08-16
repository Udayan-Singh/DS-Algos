package StacksQueues;

import java.util.Stack;

public class NextGreatestRight {
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> s = new Stack<>();
        long[] ans = new long[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            if(s.isEmpty()){
                s.push(arr[i]);
                ans[i] = -1;
            }

            else if(!s.isEmpty() && s.peek()>arr[i]){
                ans[i] = s.peek();
            }

            else if(!s.isEmpty() && s.peek()<=arr[i]){
                while(!s.isEmpty()){
                    if(arr[i] > s.peek()){
                        s.pop();
                    }
                }

                if(s.isEmpty()){
                     ans[i] = -1;
                }

                else{
                    ans[i] = s.peek();
                }
            }
        }


        return ans;
    } 
}
