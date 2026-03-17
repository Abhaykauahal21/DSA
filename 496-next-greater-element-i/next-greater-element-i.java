class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] result = new int[n];

        for(int i = 0;i<n;i++){
            int idx = -1;

            // check idx of same element 

            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx = j;
                    break;
                }
            }
            result[i] = -1;

            for(int j = idx +1; j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;

       
        
    }
}