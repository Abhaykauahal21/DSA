class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()) {

            // FIXED while condition
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;  // IMPORTANT
            }

            stack.push(c);
        }

        // Agar k abhi bhi bacha hai
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build result
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        // Edge case
        return result.length() == 0 ? "0" : result.toString();
    }
}