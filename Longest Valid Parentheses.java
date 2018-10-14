class Solution {
    //https://leetcode.com/problems/longest-valid-parentheses/description/
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int maxans=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){stack.push(i);}
            else{
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }else{
                    maxans=Math.max(maxans,i-stack.peek());
                }
            }
        }
        
     return maxans;   
    }
}