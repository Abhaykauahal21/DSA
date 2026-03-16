class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int n = temp.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int past = stack.pop();
                result[past] = i-past;
            }
            stack.push(i);
        }
        return result;
        
    }
}