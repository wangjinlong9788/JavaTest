class Solution {//https://leetcode.com/problems/valid-parentheses/description/
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                //if(!stack.isEmpty()){char top=stack.pop();}
                //else{char top='#';}
                char top = stack.isEmpty() ? '#' : stack.pop();
                if(map.get(s.charAt(i))!=top){
                    return false;
                }
                
                
            }
            else{
                stack.push(s.charAt(i));
            }
        
    }
        return stack.isEmpty();
}
}