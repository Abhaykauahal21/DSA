class Solution {
    public boolean superPower(int i, int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                // use super powwr
                return superPower(i+1,j,s) || superPower(i,j-1,s);
            }else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}