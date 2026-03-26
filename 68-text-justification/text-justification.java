class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        
        int i = 0;
        
        while(i < words.length){
            
            int j = i;
            int length = 0;
            
            while(j < words.length && length + words[j].length() + (j - i) <= maxWidth){
                length += words[j].length();
                j++;
            }
            
            int gaps = j - i - 1;
            StringBuilder line = new StringBuilder();
            
            // Last line or single word
            if(j == words.length || gaps == 0){
                
                for(int k = i; k < j; k++){
                    line.append(words[k]);
                    
                    if(k < j - 1){
                        line.append(" ");
                    }
                }
                
                int remaining = maxWidth - line.length();
                while(remaining-- > 0){
                    line.append(" ");
                }
                
            } else {
                
                int spaces = (maxWidth - length) / gaps;
                int extra = (maxWidth - length) % gaps;
                
                for(int k = i; k < j; k++){
                    line.append(words[k]);
                    
                    if(k < j - 1){
                        
                        for(int s = 0; s < spaces; s++){
                            line.append(" ");
                        }
                        
                        if(extra-- > 0){
                            line.append(" ");
                        }
                    }
                }
            }
            
            result.add(line.toString());
            i = j;
        }
        
        return result;
    }
}