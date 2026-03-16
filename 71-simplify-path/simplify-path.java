class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for(String p : parts){
            if(p.equals("") || p.equals(".")){
                continue;
            }else if(p.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(p);
            }
        }

        StringBuilder result = new StringBuilder();

        for(String dir : stack){
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
        
    }
}