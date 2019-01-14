package cn.rocker.stack.leetcode;

import java.util.Stack;

/**
 * @author rocker
 * @date 2019/01/14 11:26
 * @since V1.0
 */
public class ValidParentheses {

    public boolean isValid(String src) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<src.length(); i++){
            char c = src.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if(stack.empty()){
                    return false;
                }

                Character topChar = stack.pop();
                if(c == '}' && topChar != '{'){
                    return false;
                }
                if(c == ']' && topChar != '['){
                    return false;
                }
                if(c == ')' && topChar != '('){
                    return false;
                }
            }
        }

        return stack.empty();
    }

}
