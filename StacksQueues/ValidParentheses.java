package StacksQueues;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String x){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if(s.isEmpty() && (x.charAt(i)==']' || x.charAt(i)=='}' || x.charAt(i)==')')){
                return false;
            }

            else{
                if(!s.isEmpty()){
                    if(s.peek() == '[' && x.charAt(i)==']'){
                    s.pop();
                }

                else if(s.peek() == '(' && x.charAt(i)=='}'){
                    s.pop();
                }

                else if(s.peek() == '{' && x.charAt(i)=='}'){
                    s.pop();
                }

                else{
                    s.push(x.charAt(i));
                }
            }

            else{
                s.push(x.charAt(i));
            }
            }
        }
        return s.isEmpty();
    }
}
