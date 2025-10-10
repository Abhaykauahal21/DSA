class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;

      
        for (int start = n - 1; start >= n - k; start--) {
            int sum = 0;
            for (int j = start; j >= 0; j -= k) {
                sum += energy[j];
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
