    class Solution {
        public int minimumRefill(int[] plants, int capacityA, int capacityB) {
            
            int i = 0;
            int j = plants.length-1;
            int alice = capacityA;
            int bob = capacityB;

            int refil = 0;
            while(i<j){
                if(alice < plants[i]){
                    refil++;
                    alice = capacityA;
                }
                alice -= plants[i];
                i++;

                if(bob < plants[j]){
                    refil++;
                    bob = capacityB;
                }
                bob -= plants[j];
                j--;

                if(i==j){
                    int maxWater = Math.max(alice, bob);

                    if (maxWater < plants[i]) {
                        refil++;
                    }
                }
            }
            return refil;
        }
    }