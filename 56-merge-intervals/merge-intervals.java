class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals){
            int n = result.size();

            if(n==0 || result.get(n-1)[1] < interval[0]){
                result.add(interval);
            }else{
                result.get(n-1)[1] = Math.max(result.get(n-1)[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
        
    }
}