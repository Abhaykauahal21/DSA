class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> stack = new Stack<>();

        for(char c: num.toCharArray()){
            while(!stack.isEmpty() && stack.peek() > c && k > 0){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();

        for(char c : stack){
            result.append(c);
        }
        while(result.length() > 1 && result.charAt(0)=='0'){
            result.deleteCharAt(0);
        }

        return result.length()==0 ? "0": result.toString();
        
    }
}