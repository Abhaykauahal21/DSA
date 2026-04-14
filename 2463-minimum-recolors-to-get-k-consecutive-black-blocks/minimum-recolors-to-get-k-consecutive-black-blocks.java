class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;

        // Count whites in the first window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }

        int minOps = whiteCount;

        // Sliding window
        for (int i = k; i < blocks.length(); i++) {
            // Add next element
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }

            // Remove previous element
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }

            minOps = Math.min(minOps, whiteCount);
        }

        return minOps;
    }
}