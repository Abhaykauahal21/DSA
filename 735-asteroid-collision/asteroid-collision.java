class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int curr : asteroids){
            boolean destroy = false;

            while(!stack.isEmpty() && stack.peek() > 0 && curr <0){
                if(Math.abs(curr) > stack.peek()){
                    stack.pop();
                    continue;
                }else if(Math.abs(curr) == stack.peek()){
                    stack.pop();
                }
                destroy = true;
                break;
            }
            if(!destroy){  // agar destroy nahu hua to push kro
                stack.push(curr);  // stack mai safe asteriod save kro
            }
        }
        int[] result = new int[stack.size()];

        for(int i = stack.size()-1; i>=0;i--){
            result[i] = stack.pop();
        }
        return result;
    }
}