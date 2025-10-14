class Solution {
    public void gen(List<String> result, int max, int o, int c, String s){
      if(s.length()==(2*max)){
        result.add(s);
        return;
      }
      if(o<max){
        gen(result, max,o+1,c,s+"(");
      }
      if(c<o){
        gen(result,max,o,c+1,s+")");
      }
    }


    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        gen(result,n,0,0,"");
        return result;
        
    }
}